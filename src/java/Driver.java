import java.util.List;

public class Driver extends User {

    Car car;

    List<Ride> rideHistory;

    FleetManager fleetManager;

    double rating;

    public FleetManager manages;
    public Car myCar;

    boolean acceptRideRequest(Ride ride) {
        return true;
    }

    boolean rejectRideRequest(Ride ride) {
        return true;
    }

    boolean cancelRide(Ride ride) {
        return true;
    }

    boolean endRide(Ride ride) {
        return true;
    }

    boolean updateRide(Ride ride) {
        return true;
    }

    boolean setRideStatus(Ride ride, RideStatus status) {
        return true;
    }

    boolean registerCar(Car car) {
        return true;
    }

    boolean updateCar(Car car) {
        return true;
    }

    void seeRideHistory() {

    }

}