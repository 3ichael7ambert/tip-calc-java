import java.util.Scanner;

class tipCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much was the bill?");
        double bill = sc.nextDouble();
        System.out.println("What % do you want to tip?");
        double tipPercent = sc.nextDouble();
        double tip = (tipPercent/100)*bill;
        double total = bill + tip;
        System.out.println(" ");
        System .out.println("Your bill: $" + bill);
        System .out.println("Your tip: $" + tip);
        System.out.println("Your total: +$" + total);
        System.out.println("");
        System.out.println("Thanks for Shopping with us!");
    }

}