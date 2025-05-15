package billing;

import static billing.CustomerType.DEALER;
import static billing.CustomerType.PRIVATE;

public class Billing {

    public int bill(int numberOfAdverts, int numberOfProducts, CustomerType customerType) {
        int advertsBill = 0;
        int productsBill = 0;

        advertsBill = getBillForAdverts(numberOfAdverts, customerType, advertsBill);

        productsBill = getProductsBill(numberOfAdverts, numberOfProducts, productsBill);

        return advertsBill + productsBill;
    }

    private int getBillForAdverts(int numberOfAdverts, CustomerType customerType, int advertsBill) {
        if (customerType.equals(DEALER)) {
            advertsBill = (50 * numberOfAdverts);
        } else if (customerType.equals(PRIVATE)) {
            advertsBill = (20 * numberOfAdverts);
        }
        return advertsBill;
    }

    private int getProductsBill(int numberOfAdverts, int numberOfProducts, int productsBill) {
        if (numberOfProducts != 0) {
            productsBill = (10 * numberOfProducts * numberOfAdverts);
        }
        return productsBill;
    }
}
