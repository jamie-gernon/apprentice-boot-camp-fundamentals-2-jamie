package billing;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BillingTest {

    @Test
    public void WhenGettingBillFor0AdvertsAnd0Products_shouldReturn0() {
        Billing billing = new Billing();

        int totalBill = billing.bill(0, 0, CustomerType.DEALER);

        assertThat(totalBill).isEqualTo(0);
    }

    @Test
    public void WhenGettingBillForOneAdvertAnd0Products_shouldReturn50(){
        Billing billing = new Billing();

        int totalBill = billing.bill(1, 0, CustomerType.DEALER);

        assertThat(totalBill).isEqualTo(50);
    }

    @Test
    public void WhenGettingBillForOneAdvertAndOneProduct_shouldReturn60(){
        Billing billing = new Billing();

        int totalBill = billing.bill(1, 1, CustomerType.DEALER);

        assertThat(totalBill).isEqualTo(60);
    }

    @Test
    public void WhenGettingBillForPrivateCustomerWith1Advert_shouldReturn20() {
        Billing billing = new Billing();

        int totalBill = billing.bill(1, 0, CustomerType.PRIVATE);

        assertThat(totalBill).isEqualTo(20);
    }

    @Test
    public void WhenGettingBillForDealerWith1000AdvertsAnd2Products_shouldReturnCorrectBill() {
        Billing billing = new Billing();

        int totalBill = billing.bill(1000, 2, CustomerType.DEALER);

        assertThat(totalBill).isEqualTo(70000);
    }

    @Test
    public void WhenGettingBillForPrivateWith3AdvertsAnd1Products_shouldReturnCorrectBill() {
        Billing billing = new Billing();

        int totalBill = billing.bill(10, 2, CustomerType.PRIVATE);

        assertThat(totalBill).isEqualTo(400);
    }
}
