public class Main{
    public static void main(String[]args){
        User user1= new User("Mahak");
        User user2 = new User("payal","mahparihar@gmail.com");
        User user3 = new User("payal","mahparihar@gmail.com",22);

        System.out.println(user3.username + " is " + user3.age + " years old");
        

    }
}