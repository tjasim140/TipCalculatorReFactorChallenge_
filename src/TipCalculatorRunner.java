import java.util.Scanner;
public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your Bill Amount (leave out $): ");
        String a = s.nextLine();
        double bill = Double.parseDouble(a);

        System.out.print("Enter Tip Amount (leave out %): ");
        String b = s.nextLine();
        int tip = Integer.parseInt(b);

        System.out.print("Number of People: ");
        String c = s.nextLine();
        int numPpl = Integer.parseInt(c);

        TipCalculator reciept = new TipCalculator(bill,tip,numPpl);
        reciept.printReciept();
    }
}