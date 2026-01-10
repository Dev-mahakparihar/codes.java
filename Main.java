import java.util.Random;
public class Main{
    public static void main(String[]args){
        int number;

        Random random = new Random();

        number = random.nextInt(2,7);
        System.out.println(number);

    }
}