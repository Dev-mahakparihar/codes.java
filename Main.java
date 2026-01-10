  import java.util.Scanner;

public class Main{
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String adjective2;
        String noun;

        System.out.println("1. It was a " + "________ cold November day.(warm/freezy)");
        System.out.println("2. I saw " +  "_________.(horse/cat)" );
        System.out.println("3. Tanu likes to play"+ "________.(voilin/guitar)");

        System.out.println("Answers");

        System.out.print("1.");
        adjective1 = scanner.nextLine();
        System.out.print("2.");
        adjective2 = scanner.nextLine();
        System.out.print("3.");
        noun = scanner.nextLine();



        scanner.close();



    }
}