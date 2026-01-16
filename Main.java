public class Main{
    public static void main(String[]args){
        System.out.println("Que- Find square/cube of 4.");
        System.out.print("Ans-");
        System.out.println("the square is " + square(4));
        System.out.println("    the cube is " + cube(4));

    }
    static double cube(double number){
        return number*number*number;
    }
   static double square(double number){
        return number*number;
    }
}