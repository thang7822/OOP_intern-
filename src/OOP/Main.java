package OOP;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[4];

        employees[0] = new FullTimeEmployee("E01", "Thang", "FullTimeEmployee", 1000, 200);
        employees[1] = new FullTimeEmployee("E02", "Nam","FullTimeEmployee",  1200, 300);
        employees[2] = new PartTimeEmployee("E03", "Linh","PartTimeEmployee", 80, 10);
        employees[3] = new PartTimeEmployee("E04", "Huy","PartTimeEmployee", 60, 12);

        System.out.println("===== DANH SÁCH NHÂN VIÊN =====");

        double totalSalary = 0;

        for (int i = 0; i < employees.length; i++) {
            employees[i].displayInfo();
            totalSalary += employees[i].calculateSalary();
        }

        double departmentsFulltimeSalary = 0;
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getDepartments() == "FullTimeEmployee") {
                departmentsFulltimeSalary += employees[i].calculateSalary();
            }
        }

        double departmentsParttimeSalary = 0;
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getDepartments() == "PartTimeEmployee") {
                departmentsParttimeSalary += employees[i].calculateSalary();
            }
        }

        System.out.println("\nTổng lương phòng ban Part Time: " + departmentsParttimeSalary);

        System.out.println("\nTổng lương phòng ban Fulltime: " + departmentsFulltimeSalary);

        System.out.println("\nTỔNG LƯƠNG CÔNG TY: " + totalSalary);
    }
}
