import java.util.List;

public class Location {

    double latitude;

    double longitude;

    String address;

    public Ride myRide;

    boolean updateLocation(double latitude, double longitude) {
        return true;
    }

    boolean updateAddress(String address) {
        return true;
    }

}