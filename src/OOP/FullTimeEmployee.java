package OOP;

public class FullTimeEmployee extends Employee{
    private double fixedSalary;
    private double bonus;

    public FullTimeEmployee(double fixedSalary, double bonus) {
        this.fixedSalary = fixedSalary;
        this.bonus = bonus;
    }

    public FullTimeEmployee(String id, String name, String departments, double fixedSalary, double bonus) {
        super(id, name,departments);
        this.fixedSalary = fixedSalary;
        this.bonus = bonus;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return this.bonus + this.fixedSalary;
    }

    public void displayInfo(){
        System.out.printf("\n Luong cua nha vien %s la %s", this.getName(), this.calculateSalary() );
    }
}
