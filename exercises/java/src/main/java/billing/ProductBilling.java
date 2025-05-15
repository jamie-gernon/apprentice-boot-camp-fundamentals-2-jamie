package billing;

public class ProductBilling {

    protected int getBillForProducts(int numberOfAdverts, int numberOfProducts) {
        return getProductsBill(numberOfAdverts, numberOfProducts);
    }

    private static int getProductsBill(int numberOfAdverts, int numberOfProducts) {
        if (numberOfProducts != 0) {
            return 10 * numberOfProducts * numberOfAdverts;
        } else return 0;
    }
}
