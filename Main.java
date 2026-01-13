import java.util.Scanner;
public class Main{
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newweight;
        int choice;

        System.out.println("Weight Conversion Program.");

        System.out.println("1. Convert lbs to kgs-");
        System.out.println("2. Convert kgs to lbs-");

        System.out.print("Choose an option- ");
        choice = scanner.nextInt();


        if(choice == 1){
            System.out.print("Enter the weight in lbs- ");
            weight = scanner.nextDouble();
            newweight = 0.4535 * weight;
            System.out.printf("The acquired weight in kgs is %.2f"  , newweight);
        }
        else if(choice==2){
            System.out.print("Enter the weight in kgs- ");
            weight = scanner.nextDouble();
            newweight = 0.4535 * weight;
            System.out.printf("The acquired weight in lbs is %.2f" ,newweight);
        }
        else {
            System.out.println("Option Doesn't EXIST.");
        }




    }
}