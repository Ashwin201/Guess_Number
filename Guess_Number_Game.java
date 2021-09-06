        import java.util.Random;
import java.util.Scanner;

        class game
        {
            int number;
            int userInput;
            int no_of_guesses=0;
            game() {
                Random ran = new Random();
                number = ran.nextInt(100);
            }

            public void take_input()
            {
                Scanner sc =new Scanner(System.in);
                System.out.println("Guess the number....");
                userInput=sc.nextInt();
            }

            boolean isCorrectNumber()
            {
                no_of_guesses++;
                if (userInput==number)
                {
                    System.out.format("yes,you choose the correct number and it is %d.\nYou guesses the right number in " +
                            "%d Attempts." ,number,no_of_guesses);
                    return true;
                }
                else if (userInput<number)
                {
                    System.out.format("The number you choose id too smaller.\nYour's attempts = %d\n",no_of_guesses);
                }
                else {
                    System.out.format("The number you choose id to larger.\nYour's attempts = %d\n", no_of_guesses);
                }
                return false;
            }

        }
        public class Guess_Number_Game {
            public static void main(String[] args) {
                game g=new game();
                boolean b=false;
                do {
                    g.take_input();
                    b=g.isCorrectNumber();
                }while(!b);
            }
        }


