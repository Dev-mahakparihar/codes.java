import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double number1;
        char operator;
        double number2;
        double result=0;

        System.out.print("Enter the first number: ");
        number1 = scanner.nextInt();

        System.out.print("Enter the operator(+,-,*,/): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        number2 = scanner.nextInt();

        switch(operator){
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            case '*' -> result = number1 * number2;
            case '/' -> result = number1 / number2;

        }


        System.out.println(result);



    }
}