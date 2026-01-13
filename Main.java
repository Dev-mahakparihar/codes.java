import java.util.Scanner;
public class Main{
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        int choice;
        double temp;
        double newtemp;



        System.out.println("Conversion:");
        System.out.println("1. From Fahrenheit to Celsius-");
        System.out.println("2. From Celsius to Fahrenheit-");

        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();



        if(choice==1){
            System.out.print("Your given temperature is: ");
            temp = scanner.nextDouble();
            newtemp = (temp - 32) * 5/9;
            System.out.println("Your calculated temp from F to C is " + newtemp);
        }
        else if (choice==2){
            System.out.print("Your given temperature is: ");
            temp = scanner.nextDouble();
            newtemp = (temp * 9/5) +32;
            System.out.println("Your calculated temp from C to F is " + newtemp);
        }
        else{
            System.out.println("Wrong Choice darlinn!!!");
        }
    }
}