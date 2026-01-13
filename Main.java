import java.util.Scanner;
public class Main {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principle;
        double rate;
        int compound;
        int years;
        double amount;

        System.out.print("Enter the principle amount: ");
        principle = scanner.nextDouble();

        System.out.print("Enter the interest rate: ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times compounded every year: ");
        compound = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principle * Math.pow(1 + rate / compound, compound * years);
        System.out.println(amount);

    }
}