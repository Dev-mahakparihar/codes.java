public class Main{
    public static void main(String[]args){
       String mypizza = makepizza("thicc crust ");
        System.out.println(mypizza);
    }

    static String makepizza(String bread){
        return bread + "Pizza";
    }

}