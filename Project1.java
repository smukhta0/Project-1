import java.util.Scanner;
public class Project2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        double multiplier = 0;
        String resolution = null;
        int computersEvaluated = 0;
        int highestPerformance = 0;
        int lowestPerformance = 0;
        int performanceScore = 0;
        String recommendedGraphics =" ";
        System.out.println("Enter the number of computers that you wish to enter information for");
        String tool = "Computer hardware Graphics Quality Reccomendation Tool";
        System.out.println(tool);
        computersEvaluated = scanner.nextInt();
        for (int x  = 0; x < computersEvaluated; x++) {

            System.out.print("Please enter the clock speed (in Megahertz) of your graphics card: ");
            int gpuClockSpeed = scanner.nextInt();
                while(gpuClockSpeed<800 || gpuClockSpeed>2000){
                    System.out.print("Please enter the clock speed (in Megahertz) of your graphics card: ");
                    gpuClockSpeed = scanner.nextInt();
                }

            System.out.print("Please enter the clock speed (in Megahertz) of your processor: ");
            int cpuClockSpeed = scanner.nextInt();
                while (cpuClockSpeed <1000 || cpuClockSpeed >5500){
                    System.out.print("Please enter the clock speed (in Megahertz) of your processor: ");
                    cpuClockSpeed = scanner.nextInt();
                }
            System.out.print("Please enter the number of cores of your processor: ");
            int cpuCores = scanner.nextInt();
                while(cpuCores <1 || cpuCores >16){
                    System.out.print("Please enter the number of cores of your processor: ");
                    cpuCores = scanner.nextInt();
                }
            System.out.print("What is the resolution of your monitor?\n\t1. 1280 x 720\n\t2. 1920 x 1080\n\t3. 2560 x 1440\n\t4. 3840 x 2160\nPlease Select from the options above:");
            int resolutionChoice = scanner.nextInt();
                while(resolutionChoice <1 || resolutionChoice > 4){
                    System.out.print("Please choose a number 1-4");
                    resolutionChoice = scanner.nextInt();
                }


            if (resolutionChoice == 1) {
                multiplier = 1;
                resolution = "1280 x 720";
            } else if (resolutionChoice == 2) {
                multiplier = .75;
                resolution = "1920 x 1080";
            } else if (resolutionChoice == 3) {
                multiplier = .55;
                resolution = "2560 x 1440";
            } else if (resolutionChoice == 4) {
                multiplier = .35;
                resolution = "3840 x 2160";
            }


            performanceScore = (int) (((5 * gpuClockSpeed) + (cpuCores * cpuClockSpeed)) * multiplier);
            lowestPerformance = performanceScore;
            highestPerformance = performanceScore;
            if(performanceScore>highestPerformance){
                    highestPerformance =performanceScore;
                } else if (performanceScore<lowestPerformance){
                    lowestPerformance =performanceScore;
                }



            if (performanceScore > 17000) {
                recommendedGraphics = "Ultra";
            } else if (performanceScore > 15000 && performanceScore <= 17000) {
                recommendedGraphics = "High";
            } else if (performanceScore > 13000 && performanceScore <= 15000) {
                recommendedGraphics = "medium";
            } else if (performanceScore > 11000 && performanceScore <= 13000) {
                recommendedGraphics = "low";
            } else if (performanceScore <= 11000) {
                recommendedGraphics = "Unable to play";
            }





            System.out.println("\nGPU Clock Speed: " + gpuClockSpeed);
            System.out.println("CPU Clock Speed: " + cpuClockSpeed);
            System.out.println("Number of cores: " + cpuCores);
            System.out.println("Monitor resolution: " + resolution);
            System.out.println("Performance Score: " + performanceScore);
            System.out.println("Recommended Graphics Quality: " + recommendedGraphics);
        }
        System.out.print("\nHighest score: " +highestPerformance);
        System.out.print("\nLowest score: " + lowestPerformance);
    }
}
