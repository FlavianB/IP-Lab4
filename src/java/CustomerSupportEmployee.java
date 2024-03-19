import java.util.List;

public class CustomerSupportEmployee extends User {

    CustomerSupportDepartment customerSupportDepartment;

    boolean blockUser(User user) {
        return true;
    }

    boolean unblockUser(User user) {
        return true;
    }

    boolean refundPayment(Payment payment) {
        return true;
    }

    boolean cancelRide(Ride ride) {
        return true;
    }

    public boolean giveCompensation(User user, Payment payment) {
        return false;
    }

}