import java.util.List;

public class FleetManager extends User {

  List<Driver> drivers;

  List<Ride> rides;

  boolean hireDriver(Driver driver) {
        return true;
  }

  boolean removeDriver(Driver driver) {
        return true;
  }

  boolean addCar(Car car) {
        return true;
  }

  boolean removeCar(Car car) {
        return true;
  }

  public boolean fireDriver(Driver driver) {
  return false;
  }

  public void seeAnalytics(Driver driver) {
  }

  public void seeAnalytics(Car car) {
  }

  public void seeAnalytics() {
  }

}