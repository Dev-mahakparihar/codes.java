import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner  scanner = new Scanner(System.in);
        int[] numbers = {2,5,4,7,8};
        int target = 8;

        for(int i =0;i< numbers.length;i++){
            if(target==numbers[i]){
                System.out.println("Element found at index: " + i);
                break;
            }

        }
    }
 }
