//first exercise
// class Main{

    //  public static void main(String[] args){

     //  int age = 18;
        // double height = 5.6;
        // char section = 'A';
        //  boolean eligibility = true;

        //  System.out.println("His age is " + age);
        //  System.out.println("his height is " + height);
        //  System.out.println("He Studies in Section " + section);
        // System.out.println(eligibility + ", he is eligible.");

//  }
// }



//import java.util.Scanner;

//public class Main {
    //public static void main(String[]args){

        //Scanner scanner = new Scanner(System.in);

       // System.out.println("What is your name? ");
       // String name = scanner.nextLine();
      //  System.out.println("What is your age ");
       // int age = scanner.nextInt();
      //  scanner.nextLine();
       // System.out.println("Where do you live? ");
       // String live = scanner.nextLine();

       // System.out.println("Hello " + name);
       // System.out.println("Your are " + age + "years old");
       // System.out.println("you live in "+ live);

  //  }

//}

//public class Main{
  //  public static void main(String[]args){
    //    int friends = 20;

      //  friends++;

        //System.out.println(friends);
    //}
//}

//import javax.swing.JOptionPane;

//public class Main{

   // public static void main(String[]args){
        //String name = JOptionPane.showInputDialog("Enter your name");
       // JOptionPane.showMessageDialog(null, "hello " + name );

       // int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age. "));
        //JOptionPane.showMessageDialog(null,"You are " + age + " years old");

       // double height = Double.parseDouble(JOptionPane.showInputDialog("Enter yoor heigth. "));
       // JOptionPane.showMessageDialog(null, "You are " + height + "cm tall" );
   // }
//}


//public class Main{
    //public static void main(String[]args){

        //double x = 3.45;
       // double y = -11;

       // double z = Math.floor(x);

       // System.out.print(z);
  //  }
//}

//import java.util.Scanner;
 //public class Main{
    // public static void main(String[]args) {

         //double x ;
         //double y;
        // double z ;

         //Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter side of x: ");
        // x = scanner.nextDouble();
        // System.out.print("Enter side of y: ");
        // y = scanner.nextDouble();

       //  z = Math.sqrt(x*x + y*y);

        // System.out.print("The Hypotenuse is: " + z);

    // }
 //}

//how to find pseudorandom values

//import java.util.Random;

//public class Main{
  //  public static void main(String[]args){

      //  Random random = new Random();



      // double x = random.nextDouble(2);

       // System.out.print(x);

   // }
//}

//if else statements;

//public class Main{

  //  public static void main (String[]args){

       // int age = 95;

       // if (age>=60) {
          //  System.out.print("Dadi got no chill.");
     //   }
     //   else if (age>=18){
      //      System.out.print("ohhhh");
      //  }

      //  else{
      //      System.out.print("yehhh girl.");
     //   }

//}
//}
// to ignore many if else statements , switches are used as case / break
//public class Main{
   // public static void main(String[]args){

        //String day = "mahak";

      //  switch(day){
      //      case "Sunday" : System.out.print("yeahh, its sunday");
        //    break;
          //  case "Monday" : System.out.print("yeah its monday");
            //break;
            //case"Tuesday" : System.out.print("yehh its tuesday");
         //   break;
           // case "wednesday": System.out.print("yehh its wednesday");
    //        break;
      //      case"Thurday": System.out.print("yeh its thursday");
        //    break;
          //  case"friday":  System.out.print("yeh its friday");
      //      break;
        //    case"saturday": System.out.print("yeh its saturday");
          //  break;

     //       default : System.out.print("this is not a day");
       // }
   // }
//}

// logical operators; && : both condition must be true
                  //    || : either conditon must be true
                  //! : reverses boolean value of condition

//public class Main{
    //public static void main (String[]args){
       // int age = 57;

      //  if (age<=15) {
      //      System.out.print("interested");
      //  }

      //  else if (age>= 15 && age<=25) {
      //      System.out.print("My Type");
     //   }

     //   else{
          //  System.out.print("Not Interested");
      //  }

   // }
//}

 // while loops : executes a block of code as long as its condition remains true

 //import java.util.Scanner;
//public class Main{
   // public static void main(String[]args){

       // Scanner scanner = new Scanner(System.in);
       // String name = " ";

       // while(name.isBlank()){
         //   System.out.print("Enter your name: ");
         //   name = scanner.nextLine();
     //   }
       // System.out.print("hello " + name);

   // }
//}

// for loop

//public class Main{
    //public static void main(String[]args){

     //  for(int i=0; i<=10 ; i+=4) {
          //  System.out.println(i);
      //  }
       //  System.out.print("Merry CHristmas");
 //   }
//}
// nested loops

 //import java.util.Scanner;
//public class Main {
   // public static void main(String[] args) {

      //  Scanner scanner = new Scanner(System.in);
     //   int rows;
       // int columns;
       // String symbol = " ";

       // System.out.print("Enter no. of rows: ");
      //  rows = scanner.nextInt();

      //  System.out.print("Enter no. of columns: ");
      //  columns = scanner.nextInt();

      //  System.out.print("Enter the symbol: ");
      //  symbol = scanner.next();


     //   for (int i = 1; i <= rows; i++) {
          //  System.out.println();
          //  for (int j = 1; j <= columns; j++) {
               // System.out.print(symbol);


          //  }
      //  }
  //  }
//}

// array = used to store multiple values in one variable

//public class Main{
   // public static void main(String[]args){
       // String[] cars= new String[4];
 //       cars[0]= "maruti";
   //     cars[1]= "honda";
     //   cars[2]= "bmw";
       // cars[3] = "hello";

 //       System.out.print(cars[0] + ",");
   //     System.out.print(cars[1] + ",");
     //   System.out.print(cars[2] + ",");
       // System.out.print(cars[3]);
   // }
//}

// 2d arrays

//public class Main{
   // public static void main(String[]args){

      //  int[][] cars = {
            //    {1, 2, 3}, {4, 5, 6} ,{7, 8, 9}
      //  };

        // for(int i=0 ; i<cars.length;i++){
           //  System.out.println();
            // for(int j=0;j<cars.length;j++){
            //     System.out.print(cars[i][j] + " ");
          //   }
       //  }
   // }
//}

// string methods

//public class Main{
   // public static void main(String[]args){

       // String name = "Mahak";

        //int length = name.length();
       // String answer = name.toUpperCase();
        //boolean answer = name.endsWith("k");

       // System.out.print(answer);
   // }
//}
//wrapper class;
//primitive data type  :    //wrapper
//    boolean              // Boolean
//    double               // Double
//    int                 //  Integer
//    char                 // Character

// public class Main {
   // public static void main(String[] args) {

       // Boolean a// = true;
     //   Character b = '$';
     //   Integer c = 123;
       // Double // d = 1.3;

       // if (b == '&') {
       //     System.out.print("this is good");

      //  } else {
       //     System.out.println("not good");
      //  }


   // }
//}

//overloading methods : same class name but different parameters
// static word is used access class even without object, in overloading it doesnt matter whether we use static or not;

//public class Main{
    //public static void main(String[]args) {
     //   int x = add(1,2,5);
     //   System.out.print(x);

// }
// static int add(int a , int b){
   //  System.out.println("#1");
    // return a + b;
 //}
 //static int add(int c , int d, int e){
     //System.out.println("#2");
    // return c + d + e;
 //}
//   }

//final keyword :

//public class Main {
 //   public static void main (String[]args){

       //  final double pi = 3.14;

      //  System.out.println(pi);
    //}
//}

//public class Main {
  //  public static void main (String[]args){
//
   //     Pizza pizza = new Pizza("thicc bread","tomoto","butter");
//
   //      System.out.println("Ingredients of pizza are: ");

     //   System.out.println(pizza.bread);
       // System.out.println(pizza.sauce);
      //  System.out.println(pizza.cheese);


   // }
//}


//tostring method: like behind the scenes

//public class Main{
   // public static void main(String[]args){

       // Car car = new Car();
       // System.out.print(car.toString());

       // Yoyo yoyo = new Yoyo();
      //  System.out.println(yoyo.toString());
   // }
//}

//array in java

//public class Main{
 //   public static void main(String[]args){

       // Food[] fridge = new Food[3];
        //Food food1 = new Food("pasta");
        //Food food2 = new Food("maggie");
       // Food food3 = new Food("bread");

     //   fridge[0] = food1;
   //     fridge[1] = food2;
       // fridge[2] = food3;

     //   System.out.println(fridge[2].name);

   // }
//}
//sending objects as arguements
//public class Main{
    //public static void main(String[]args){
        //Car you = new Car("Ferari");
      //  Garage garage = new Garage();

    //    garage.park(you);


  //  }
//}

//static arguements

// public class Main{
  //  public static void main(String[]args){

    //   friends friend1 = new friends("mihu");
      // friends friend2 = new friends("mahi");

       //System.out.println(friends.numberoffriend);
    //}
 //}
 //public class Main{
    //public static void main(String[]args){


      // animal janwar = new animal();
      //  Dog dog = new Dog();
      //  janwar.speaks();
   // }
     //  }

public class Main{
    public static void main(String[]args){


    }
}

