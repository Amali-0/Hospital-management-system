// 5. Doctor.java
class Doctor extends Person implements MedicalStaff {
    private String specialty;

    public Doctor(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void provideTreatment() {
        System.out.println("Doctor " + getName() + " is providing specialized treatment in " + specialty + ".");
    }

    @Override
    public void displayDetails() {
        System.out.println("Doctor ID: " + getId() + " | Name: " + getName() + " | Specialty: " + specialty);
    }
}

