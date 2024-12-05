import java.util.Deque;
import java.util.LinkedList;

public class Driver extends Person {
    private int driverID;
    private String vehicle;
    private double averageRating;
    private Deque<Integer> ratings;
    private Order currentOrder;

    public Driver(int driverID, String name, int number, String vehicle) {
        super(name, number);
        this.driverID = driverID;
        this.vehicle = vehicle;
        this.ratings = new LinkedList<>();
        this.averageRating = 0.0;
    }

    public int getDriverID() {
        return driverID;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public void addRating(int rating) {
        if (ratings.size() == 10) {
            ratings.pollFirst();
        }
        ratings.addLast(rating);
        calculateRating();
    }

    private void calculateRating() {
        double sum = 0;
        for (int r : ratings) {
            sum += r;
        }
        this.averageRating = ratings.isEmpty() ? 0 : sum / ratings.size();
    }

    public double getAverageRating() {
        return averageRating;
    }

    public String getDriverDetails() {
        return "Driver ID: " + driverID + ", Name: " + getName() + ", Vehicle: " + vehicle +
                ", Average Rating: " + averageRating;
    }
}
