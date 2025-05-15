package billing;

public class Billing {
    AdvertBilling advertBilling = new AdvertBilling();
    ProductBilling productBilling = new ProductBilling();

    public int bill(int numberOfAdverts, int numberOfProducts, CustomerType customerType) {
        int advertsBill;
        int productsBill;

        advertsBill = advertBilling.getBillForAdverts(numberOfAdverts, customerType);

        productsBill = productBilling.getBillForProducts(numberOfAdverts, numberOfProducts);

        return advertsBill + productsBill;
    }
}
