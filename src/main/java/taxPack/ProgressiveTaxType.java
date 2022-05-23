package taxPack;

public class ProgressiveTaxType extends TaxType {

    //Прогрессивный налог, до 100 тысяч = 10%, больше 100 тысяч = 15% (ProgressiveTaxType)
    @Override
    public double calculateTaxFor(double amount) {
        if (amount <= 100_000) {
            double progressiveTaxType = (amount * 0.10);
            return progressiveTaxType;
        } else {
            double progressiveTaxType = (amount * 0.15);
            return progressiveTaxType;
        }
    }
}
