import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String temporaryInput;

        // input variables
        double billAmount;
        int tipPercent;
        int amountOfPeople;

        // inputting to internal variables
        System.out.print("Enter your bill for your party: ");
        temporaryInput = s.nextLine();
        billAmount = Double.parseDouble(temporaryInput);

        System.out.print("Enter the percentage for the tip as a whole number (30): ");
        temporaryInput = s.nextLine();
        tipPercent = Integer.parseInt(temporaryInput);

        System.out.print("Enter amount of people in your party: ");
        temporaryInput = s.nextLine();
        amountOfPeople = Integer.parseInt(temporaryInput);

        TipCalculator tip = new TipCalculator(billAmount, tipPercent, amountOfPeople);

        tip.printTip();

        s.close();
    }
}