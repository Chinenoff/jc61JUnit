package taxPack;

public class VATaxType extends TaxType {
    //НДС, = 18% (VATaxType)
    @Override
    public double calculateTaxFor(double amount) {
        double vATaxType = (amount * 0.18);
        return vATaxType;
    }
}
