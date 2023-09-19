import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String temporaryInput;

        // input variables
        double billAmount;
        int tipPercent;
        int amntOfPeople;

        // output variables
        double totalTip;
        double totalBill;
        double tipPerPerson;
        double totalPerPerson;

        // inputting to internal variables
        System.out.print("Enter your bill for your party: ");
        temporaryInput = s.nextLine();
        billAmount = Double.parseDouble(temporaryInput);

        System.out.print("Enter the percentage for the tip as a whole number (30): ");
        temporaryInput = s.nextLine();
        tipPercent = Integer.parseInt(temporaryInput);

        System.out.print("Enter amount of people in your party: ");
        temporaryInput = s.nextLine();
        amntOfPeople = Integer.parseInt(temporaryInput);

        // output calculation
        totalTip = billAmount * ((double)tipPercent / 100);
        totalBill = billAmount + totalTip;
        tipPerPerson = totalTip / amntOfPeople;
        totalPerPerson = (billAmount / amntOfPeople) + tipPerPerson;

        // output printing
        System.out.println("\nTotal tip: " + totalTip);
        System.out.println("Total bill: " + totalBill);
        System.out.println("Tip each person pays: " + tipPerPerson);
        System.out.println("Total amount per person: " + totalPerPerson);
    }
}