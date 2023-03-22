import uulib.Console;

public class Mini_Pt2 {

    public static void multCheck() {

        //Collects a number
        int num1 = Console.getInt("Enter a number and it will tell you if its a multiple of 3: ");

        /*Checks if the number is a multiple of 3*/
        if (num1 % 3 == 0) {
            System.out.println(num1 + " is a multiple of 3");
        } else {
            System.out.println(num1 + " is not a multiple of 3");
        }

    }

    public static void change() {
        /*declaring my variables*/
        float Price = Console.getFloat("What is your total price? £");
        float Tender = Console.getFloat("What is your tender amount? £");
        float Change;


        //Chaking if there is no change needed
        if (Tender == Price) {
            System.out.println("No change due");

            //Check if more cash is needed
        } else if (Tender < Price) {
            Change = (Price - Tender);

            System.out.println("A further £" + (String.format("%.2f", Change)) + " is required");

            //Prints the user their change
        } else if (Tender > Price) {
            Change = (Tender - Price);
            System.out.println("Your change is £" + String.format("%.2f", Change));
        }

    }
        public static void isLeapYr() {

        //Declaring my variables
        int year = Console.getInt("Enter in a year, to check if its a leap year: ");
        int Centry = (year % 100);

        // For two conditions for if the year entered is aleap year
        if ((year % 4) == 0 || (Centry % 400 == 0)) {
            System.out.println("The year" + year + " is a leap");
        } else {
            System.out.println("The year " + year + " is not a leap");
        }
    }


    public static void listQry() {

        //Declaring my variables.
        int num1 = Console.getInt("Enter first number: ");
        int num2 = Console.getInt("Enter second number: ");
        int num3 = Console.getInt("Enter third number: ");

        //This determines which is the largest number
        if ((num1 > num2) && (num1 > num3)) {
            System.out.println("The largst number is " + num1);
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println("The largest number is " + num2);
        } else {
            System.out.println("The largest number is " + num3);
        }

        //This checks for the smallest number
        if ((num1 < num2) && (num1 < num3)) {
            System.out.println("The largst number is " + num1);
        } else if ((num2 < num1) && (num2 < num3)) {
            System.out.println("The largest number is " + num2);
        } else {
            System.out.println("The smalest number is " + num3);
        }



    }

    // program execution starts here
    public static void main(String[] args) {
        // uncomment the sub-program (method)that you wish to execute

        multCheck();
        change();
        isLeapYr();
        listQry();

    }
}
