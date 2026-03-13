// 4. Facility.java
abstract class Facility {
    private String facilityName;

    public Facility(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getFacilityName() { return facilityName; }
    public abstract void showFacilityInfo();
}
