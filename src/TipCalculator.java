public class TipCalculator {

    // input variables
    private double billAmount;
    private int tipPercent;
    private int amountOfPeople;

    // output variables
    private double totalTip;
    private double totalBill;
    private double tipPerPerson;
    private double totalPerPerson;

    public TipCalculator(double billAmount, int tipPercent, int amountOfPeople) {
        this.billAmount = billAmount;
        this.tipPercent = tipPercent;
        this.amountOfPeople = amountOfPeople;
        calculateTips();
    }

    private void calculateTips() {
        // output calculation
        totalTip = billAmount * ((double) tipPercent / 100);
        totalBill = billAmount + totalTip;
        tipPerPerson = totalTip / amountOfPeople;
        totalPerPerson = (billAmount / amountOfPeople) + tipPerPerson;
    }

    public void updateBillAmount(double billAmount) {
        this.billAmount = billAmount;
        calculateTips();
    }

    public void updateTipPercent(int tipPercent) {
        this.tipPercent = tipPercent;
        calculateTips();
    }

    public void updateAmountOfPeople(int amountOfPeople) {
        this.amountOfPeople = amountOfPeople;
        calculateTips();
    }

    public void printTip() {
        // output printing
        System.out.println("\nTotal tip: " + totalTip);
        System.out.println("Total bill: " + totalBill);
        System.out.println("Tip each person pays: " + tipPerPerson);
        System.out.println("Total amount per person: " + totalPerPerson);
    }

}
