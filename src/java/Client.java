import java.util.List;

public class Client extends User {

  Location address;

  List<Location> favoriteLocations;

  List<Ride> rideHistory;

  boolean createRideRequest(Location startLocation, Location endLocation) {
        return true;
  }

  boolean updateRideRequest(Ride ride, Location startLocation, Location endLocation) {
        return true;
  }

  boolean cancelRideRequest(Ride ride) {
        return true;
  }

  boolean makePayment(Payment payment) {
        return true;
  }

  boolean addFunds(double amount) {
        return true;
  }

  void seeRideHistory() {

  }

  void seeFavoriteLocations() {

  }

  public void giveTip(Ride ride) {
  }

  public void usePromoCode(Ride ride) {
  }

  private void giveFeedback(Ride ride) {
  }

}