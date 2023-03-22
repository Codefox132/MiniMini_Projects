import uulib.Console;

public class Mini_Pt1 {
    public static void AreaPerimiter() {

        //Gathers the dimentions of the rectangle
        int length = Console.getInt("Enter length ");
        int breadth = Console.getInt("Enter breadth ");
        System.out.println("");

        /*Calculates the perimiter and area of the rectangle*/
        int perimeter = (2 * breadth) + (2 * length);
        int area = (length * breadth);

        /*Displays the value of the rectangle*/
        System.out.println("Area:" + area + "\n" + "Perimeter: " + perimeter);

    }


    public static void Greetings() {
        //Asks the user for their name
        String name = Console.getString("What is your name? ");

        //Prints a gretting to the user
        System.out.println("Hello " + name + ", nice to meet you.");

    }

    public static void VATCalc() {

        //Declares a constant called VATRATE
        final double VATRATE = 0.20;

        //Extracts the price of an item
        double Price = Console.getDouble("What is the price of your item? £");


        //calcualtes the VAT amount
        double VATam = Price * VATRATE;

        /*Displays the vat amount to two decimal places*/
        System.out.println("Your VAT is going to be £" + String.format("%.2f", VATam));

    }


    public static void ChangeCalc() {


        //Prompts the user to enter the amount of change they have
        int Tpound = Console.getInt("£2: ");
        int Opund = Console.getInt("£1: ");
        int FiftyP = Console.getInt("50p: ");
        int TwentyP = Console.getInt("20p: ");
        int TenP = Console.getInt("10p: ");
        int FiveP = Console.getInt("5p: ");
        int TwoP = Console.getInt("2p: ");
        int OneP = Console.getInt("1p: ");

        //Calculates the change value
        double total = (Tpound * 2) + Opund + (FiftyP * 0.50) + (TwentyP * 0.20) + (TenP * 0.10) + (FiveP * 0.05) +
                (TwoP * 0.02) + (OneP * 0.01);

        //Prints the total amount of change they have
        System.out.println("Total change is £" + String.format("%.2f", total));

    }


    public static void HypeCalc() {

        //This gathers the dimentions of the triangle
        double length = Console.getDouble("What is the length of your rightangle triangle? ");
        double hight = Console.getDouble("What is the hight of your rightangle triangle? ");

        //Calcualtes the squarwed values
        double square = ((hight * hight) + (length * length));

        //Extracts the square root of the total
        double ans = Math.sqrt(square);

        //Displays the answer to the console
        System.out.println("The hypothenues of a triangle will equal to: " + String.format("%.2f", ans));

    }

    public static void main(String[] args) {
        // uncomment the sub-program (method)that you wish to exectute

        //AreaPerimiter();
        //Greetings();
        //VATCalc();
        //ChangeCalc();
        HypeCalc();

    }
}
