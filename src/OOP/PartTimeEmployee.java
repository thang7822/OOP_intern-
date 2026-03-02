package OOP;

public class PartTimeEmployee extends Employee{

    private int workingHours;
    private double hourlyRate;

    public PartTimeEmployee(int workingHours, double hourlyRate) {
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    public PartTimeEmployee(String id, String name, String departments, int workingHours, int hourlyRate) {
        super(id, name, departments);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return this.hourlyRate*this.workingHours;
    }

    public void displayInfo(){
        System.out.printf("\n Luong cua nha vien %s la %s", this.getName(), this.calculateSalary() );
    }
}
