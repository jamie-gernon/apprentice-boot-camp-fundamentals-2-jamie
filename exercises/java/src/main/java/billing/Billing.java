package billing;

public class Billing {
    AdvertBilling advertBilling = new AdvertBilling();

    public int bill(int numberOfAdverts, int numberOfProducts, CustomerType customerType) {
        int advertsBill;
        int productsBill = 0;

        advertsBill = advertBilling.getBillForAdverts(numberOfAdverts, customerType);

        productsBill = getProductsBill(numberOfAdverts, numberOfProducts, productsBill);

        return advertsBill + productsBill;
    }



    private int getProductsBill(int numberOfAdverts, int numberOfProducts, int productsBill) {
        if (numberOfProducts != 0) {
            productsBill = (10 * numberOfProducts * numberOfAdverts);
        }
        return productsBill;
    }
}
