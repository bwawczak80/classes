public class Employee {

    private int employeeShift;
    private String employeeName;
    private String employeeNumber;

    public Employee(int employeeShift, String employeeName, String employeeNumber) {
        this.employeeShift = employeeShift;
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
    }

    public int getEmployeeShift() {
        return employeeShift;
    }

    public void setEmployeeShift(int employeeShift) {
        this.employeeShift = employeeShift;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void displayInfo(){
        System.out.println("Employee Name: " + employeeName  + "\n");
        System.out.println("Employee Number: " + employeeNumber + "\n");
        System.out.println("Shift Number: " + employeeShift + "\n");
        System.out.println("-----------------------------------\n");

    }
}
