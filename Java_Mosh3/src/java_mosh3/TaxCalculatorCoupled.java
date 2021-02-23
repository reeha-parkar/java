package java_mosh3;

public class TaxCalculatorCoupled implements TaxCalculator{
    private double taxableIncome;

    public TaxCalculatorCoupled(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
    @Override
    public double calculateTax(){
        return 0.3 * taxableIncome;
    }
    
}
