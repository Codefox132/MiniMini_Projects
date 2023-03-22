import uulib.Console;

public class Mini_Pt3 {
    public static void cTOf() {

        //Declaring a convertion factor a constant
        final double CONVFACTOR = 9.0 / 5.0;

        //declaring a SENTINEL constant
        final int SENTINEL = -99;

        //Prompting for temprature input
        int celsius = Console.getInt("Temprature in Celsius: ");


        while (celsius != SENTINEL) {

            //Converting celcious to fahrenheit
            double fahrenheit = (CONVFACTOR * celsius) + 32;

            //Out put the results
            System.out.println(celsius + "C is " +
                    String.format("%.1f", fahrenheit) + " F");

            //Prompting for the next number input
            celsius = Console.getInt("Enter a temprature in Celsius, else if you wish to exit enter -99: ");
        }


    }


    public static void multTbl() {

        //Prompt the user to enter the multiplications tables they wish
        int num = Console.getInt("Enter the number for their multiplication table: ");

        //Declaring variables
        int series = 1, mult = 0;

        //Declaring a sentinel 12
        final int SENTINEL = 12;

        //Forcing the user to enter a number lower than 12
        while (num > SENTINEL) {

            //Asks the user again for the number they want
            num = Console.getInt("Enter the number between 1 and 12 please, for their multiplication table: ");

        }
        //Prints out the table
        while (series <= 12) { /*Condition*/

            mult = (series * num);
            System.out.println(series + " times " + num + " = " + mult);

            //Incraments by 1 as its the iteration
            series += 1;
        }



    }

    public static void numGuess() {
        //Declaring a constant then getting a final random number
        final int numToGuess = (int) (Math.random() * 100 + 1);

        //Prompting the user to enter their guess
        int guess1 = Console.getInt("Enter your guess: ");

        //Declaring a counter variable
        int counter = 0;

        /*Incramenting by 1 to the counter to track the number of guesses*/
        counter++;

        //Keeps runing untill the guess is correct
        while (guess1 != numToGuess) {

            //Checks if the number is too high or too low
            if (guess1 > numToGuess) { //too high
                System.out.println("You guessed too high");
            } else if (guess1 < numToGuess) { //too low
                System.out.println("You guessed too low");
            }

            //Keeps the loop runing untill the right number is entered
            guess1 = Console.getInt("Enter your guess: ");

            /*Incraments by one to keep count of turns*/
            counter++;
        }

        //Displays this whenver the guess was correct
        System.out.println("You took " + counter + " guesses to find the correct number: " +                 numToGuess);
    }


    public static void main(String[] args) {

        cTOf();
        multTbl();
        numGuess();
    }
}
