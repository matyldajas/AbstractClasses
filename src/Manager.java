public class Manager extends Employee {
    private int bonus;

    public Manager(String firstName, String lastName, int birthdayYear, int hireYear, String companyName, int salary, int bonus) {
        super(firstName, lastName, birthdayYear, hireYear, companyName, salary);
        this.bonus=bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary()+bonus;
    }

    @Override
    public String toString() {
        return "Manager with lastName" + getLastName()+ "and age"+ getAge()+"has salary"+ getSalary();

    }
}
