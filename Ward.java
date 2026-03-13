// 7. Ward.java
class Ward extends Facility {
    private int capacity;

    public Ward(String name, int capacity) {
        super(name);
        this.capacity = capacity;
    }

    @Override
    public void showFacilityInfo() {
        System.out.println("Ward Name: " + getFacilityName() + " | Capacity: " + capacity + " beds.");
    }
}