package Exam2;

public class Employee {
    private String name;
    private int salary;
    private String startDate;

    public Employee(String name, int salary, String startDate) {
        this.name = name;
        this.salary = salary;
        this.startDate = startDate;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Name: " + name + " \n" + "Salary: " + salary + "\n" + "Start Day: " + startDate;

    }
}
