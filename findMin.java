import java.util.Scanner;
public class findMin{
  public static void main (String[] arg){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the first number:");
    double first=s.nextDouble();
    System.out.println("Enter the second number:");
    double second=s.nextDouble();
    System.out.println("Enter the third number:");
    double third=s.nextDouble();
    System.out.println("The minimum value: "+minimum(first, second, third));
    System.out.println("The maximum value: "+maximum(first, second, third));
    System.out.print("The average value: " + average(first, second, third));
    
  }
  public static double minimum(double first, double second, double third){
    return Math.min(Math.min(first, second), third);
    }
  public static double maximum(double first, double second, double third){
    return Math.max(Math.max(first, second), third);
  }
 
  

  public static double average(double first, double second, double third){
        return (first + second + third) / 3;
    }

}

    