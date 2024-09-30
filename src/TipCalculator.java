public class TipCalculator {
    private double bill;
    private double tip;
    private int numPpl;
    public TipCalculator (double bill,double tip,int numPpl){
        this.bill=bill;
        this.numPpl=numPpl;
        this.tip=tip;
    }
    public double totalTip(){
        double tipT = bill*(tip/100);
        String.format("%.2f",tipT);
        return tipT;
    }
    public double totalBill(){
        double billT = bill+totalTip();
        String.format("%.2f",billT);
        return billT;
    }
    public double costPer(){
        double billPer = totalBill()/numPpl;
        String.format("%.2f",billPer);
        return billPer;
    }
    public double tipPer(){
        double tipPer = totalTip()/numPpl;
        String.format("%.2f",tipPer);
        return tipPer;
    }

    public void printReciept(){
        System.out.println("---------------------------------------");
        System.out.println("Total Tip: $" + totalTip());
        System.out.println("---------------------------------------");
        System.out.println("Total Bill: $" + totalBill());
        System.out.println("---------------------------------------");
        System.out.println("Tip per Person: $" + tipPer());
        System.out.println("---------------------------------------");
        System.out.println("Bill per Person: $" + costPer());
    }

}
