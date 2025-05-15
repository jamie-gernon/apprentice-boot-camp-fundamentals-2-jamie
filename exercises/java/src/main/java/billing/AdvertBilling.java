package billing;

import static billing.CustomerType.DEALER;
import static billing.CustomerType.PRIVATE;

public class AdvertBilling {

    protected int getBillForAdverts(int numberOfAdverts, CustomerType customerType) {
       int advertsBill = 0;

       if (customerType.equals(DEALER)) {
            advertsBill = getAdvertsBillForDealer(numberOfAdverts);
       } else if (customerType.equals(PRIVATE)) {
            advertsBill = getAdvertsBillForPrivate(numberOfAdverts);
       }
       return advertsBill;
    }

    private int getAdvertsBillForDealer(int numberOfAdverts){
        return (50 * numberOfAdverts);
    }

    private int getAdvertsBillForPrivate(int numberOfAdverts) {
        return (20 * numberOfAdverts);
    }
}
