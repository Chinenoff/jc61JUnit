import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import taxPack.IncomeTaxType;
import taxPack.ProgressiveTaxType;
import taxPack.VATaxType;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MyTest {

    @Test
    @DisplayName("Тест incomeTaxType")
    public void testValidIncomeTaxType() {
        IncomeTaxType incomeTaxTypeObj = new IncomeTaxType();
        double resultIncomeTaxType = incomeTaxTypeObj.calculateTaxFor((double) 100);
        assertNotNull(resultIncomeTaxType);
        Assertions.assertEquals(resultIncomeTaxType, (double) 13);
    }

    @Test
    @DisplayName("Тест ProgressiveTaxType")
    public void testValidProgressiveTaxType() {
        ProgressiveTaxType progressiveTaxTypeObj = new ProgressiveTaxType();
        double resultIncomeTaxTypeLow100 = progressiveTaxTypeObj.calculateTaxFor((double) 100);
        double resultIncomeTaxTypeHighMil =
                progressiveTaxTypeObj.calculateTaxFor((double) 1000000);
        assertNotNull(resultIncomeTaxTypeLow100);
        assertNotNull(resultIncomeTaxTypeHighMil);
        Assertions.assertEquals(resultIncomeTaxTypeLow100, (double) 10);
        Assertions.assertEquals(resultIncomeTaxTypeHighMil, (double) 150000);
    }

    @Test
    @DisplayName("Тест vATaxType")
    public void testValidVATaxType() {
        VATaxType vATaxTypeObj = new VATaxType();
        double resultVATaxTypeObj = vATaxTypeObj.calculateTaxFor((double) 100);
        assertNotNull(resultVATaxTypeObj);
        Assertions.assertEquals(resultVATaxTypeObj, (double) 18);
    }
}
