package taxPack;

public class IncomeTaxType extends TaxType {
    //Подоходный налог, = 13% (IncomeTaxType)
    @Override
    public double calculateTaxFor(double amount) {
        double incomeTaxType = (amount * 0.13);
        return incomeTaxType;
    }
}
