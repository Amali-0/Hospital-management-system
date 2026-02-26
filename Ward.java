 public class Ward extends Facility {
    private int roomNumber;

    public Ward(String location, int roomNumber) {
        super(location);
        this.roomNumber = roomNumber;
    }

    public void showWardDetails() {
        System.out.println("Ward Room: " + roomNumber + " located in " + getLocation());
    }
}
