package OOP;

public abstract class Employee implements Payable{
    private String id;
    private  String Name;
    private String departments;

    public Employee() {

    }

    public Employee(String id, String name,String departments) {
        this.id = id;
        this.Name = name;
        this.departments = departments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }

    abstract void displayInfo();

    public double calculateSalary(){
        return 0;
    }

}
