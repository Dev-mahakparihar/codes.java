import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        String[] animals= new String[4];


        for(int i=0;i< animals.length;i++){
            System.out.print("Enter  animal: ");
            animals[i] = scanner.nextLine();

        }
        for(String animal:animals) {
            System.out.println(animal);
        }





    }
}