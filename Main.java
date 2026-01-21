import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        String[] questions= {"Which of the following can never be a prime number? ",
                             "If yesterday was Thursday, what day will it be after 10 days?",
                             "If all roses are flowers and some flowers fade quickly, which statement is TRUE?",
                             "Which planet rotates in the opposite direction compared to most planets?"};
        String[][] options = {{"A) A number ending with 1\n" +
                "B) A number ending with 3\n" +
                "C) A number ending with 5\n" +
                "D) A number ending with 7"},
                              {"A) Sunday\n" +
                                      "B) Monday\n" +
                                      "C) Tuesday\n" +
                                      "D) Wednesday"},
                              {"A) All roses fade quickly\n" +
                                      "B) Some roses may fade quickly\n" +
                                      "C) No rose fades quickly\n" +
                                      "D) Roses never fade"},
                              {"A) Mars\n" +
                                      "B) Venus\n" +
                                      "C) Jupiter\n" +
                                      "D) Saturn\n" +
                                      "\n" }};

        char[] answers={'c','c','b','b'};
        int score = 0;
        char[] guess = {} ;


        System.out.println("WElcome to Mahak's Quiz❤️");
        System.out.println("------------------------");
         guess = new char[answers.length];
        for(int i = 0;i<questions.length;i++){

                System.out.println(questions[i]);


                for (String option : options[i]) {
                    System.out.println(option);

                    System.out.print("Your Guess-");
                    guess[i] = scanner.next().charAt(0);
                    if (guess[i] == answers[i]) {
                        System.out.println("CORRECT👌");
                        System.out.println("---------");

                        score++;

                    } else {
                        System.out.println("WRONG👎");
                        System.out.println("---------");

                    }

                }
            System.out.println();
            }
        System.out.println("Your total score is: " + score + "/" + answers.length);

        }

    }
