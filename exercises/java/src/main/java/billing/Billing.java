package billing;

public class Billing {
    AdvertBilling advertBilling = new AdvertBilling();
    ProductBilling productBilling = new ProductBilling();

    public int bill(int numberOfAdverts, int numberOfProducts, CustomerType customerType) {
        int advertBill;
        int productBill;

        advertBill = advertBilling.getBillForAdverts(numberOfAdverts, customerType);

        productBill = productBilling.getBillForProducts(numberOfAdverts, numberOfProducts);

        return getTotalBill(advertBill, productBill);
    }

    private static int getTotalBill(int advertsBill, int productsBill) {
        return advertsBill + productsBill;
    }
}
