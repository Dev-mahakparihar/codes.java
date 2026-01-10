import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int length;
        int breadth;
        int area;

        System.out.print("Enter length: ");
        length = scanner.nextInt();

        System.out.print("Enter the breadth: ");
        breadth = scanner.nextInt();

        area = length*breadth;

        System.out.println(area);

    }
}
