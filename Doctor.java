public class Doctor extends Person implements MedicalStaff {
    private String specialty;

    public Doctor(String id, String name, String specialty) {
        super(id, name); // Requirement: use of 'super'
        this.specialty = specialty;
    }

    @Override
    public void showDetails() { // Requirement: Method Overriding
        System.out.println("Doctor: " + getName() + " | Specialty: " + specialty);
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + " is currently examining patients.");
    }
}
