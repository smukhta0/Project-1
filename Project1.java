import java.util.Scanner;
public class Project1 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        double multiplier = 0;
        String resolution = null;
        System.out.print("Please enter the clock speed (in Megahertz) of your graphics card: ");
        int gpuClockSpeed = scanner.nextInt();
        System.out.print("Please enter the clock speed (in Megahertz) of your processor: ");
        int cpuClockSpeed = scanner.nextInt();
        System.out.print("Please enter the number of cores of your processor: ");
        int cpuCores = scanner.nextInt();
        System.out.print("What is the resolution of your monitor?\n\t1. 1280 x 720\n\t2. 1920 x 1080\n\t3. 2560 x 1440\n\t4. 3840 x 2160\nPlease Select from the options above:");
        int resolutionChoice = scanner.nextInt();




        if(resolutionChoice==1){
            multiplier = 1;
            resolution = "1280 x 720";
        } else if(resolutionChoice==2){
            multiplier = .75;
            resolution = "1920 x 1080";
        } else if(resolutionChoice==3){
            multiplier =.55;
            resolution = "2560 x 1440";
        } else if(resolutionChoice==4){
            multiplier =.35;
            resolution = "3840 x 2160";
        }


        int performanceScore = (int) (((5 * gpuClockSpeed) + (cpuCores * cpuClockSpeed)) * multiplier);
        String reccomendedGraphics = null;



        if(performanceScore>17000){
            reccomendedGraphics = "Ultra";
        }   else if(performanceScore>15000 && performanceScore<17000){
            reccomendedGraphics = "High";
        }   else if(performanceScore>13000 && performanceScore<15000){
            reccomendedGraphics = "medium";
        }   else if(performanceScore>11000 && performanceScore<13000){
            reccomendedGraphics = "low";
        }   else if(performanceScore<=11000){
            reccomendedGraphics = "Unable to play";
        }





            String tool = "Computer hardware Graphics Quality Reccomendation Tool";
            System.out.println(tool);
            System.out.println("\nGPU Clock Speed: " + gpuClockSpeed);
            System.out.println("CPU Clock Speed: " + cpuClockSpeed);
            System.out.println("Number of cores: " +cpuCores);
            System.out.println("Monitor resolution: " + resolution );
            System.out.println("Performance Score: " + performanceScore);
            System.out.println("Reccomended Graphics Quality: " + reccomendedGraphics);
            
    }
}
