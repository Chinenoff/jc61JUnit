import taxPack.*;

public class Main {

    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        TaxType incomeTaxType = new IncomeTaxType();
        TaxType vATaxType = new VATaxType();
        TaxType progressiveTaxType = new ProgressiveTaxType();

        Bill[] payments = new Bill[4];
        {
            payments[0] = new Bill(100.13, incomeTaxType, taxService);
            payments[1] = new Bill(1000.13, vATaxType, taxService);
            payments[2] = new Bill(100, progressiveTaxType, taxService);
            payments[3] = new Bill(1000000, progressiveTaxType, taxService);
            // TODO создать платежи с различным типами налогообложения
        }
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
