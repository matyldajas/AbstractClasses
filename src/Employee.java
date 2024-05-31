

public class Employee extends Person{
    private int hireYear;
    private String companyName;
    private double salary;

    public Employee(String firstName, String lastName, int birthdayYear, int hireYear, String companyName, int salary) {
        super(firstName, lastName, birthdayYear);
        this.hireYear=hireYear;
        this.companyName=companyName;
        this.salary=salary;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getJobSeniority(){
        return 2024-hireYear;
    }

}
