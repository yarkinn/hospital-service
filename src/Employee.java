//import lombok.Data;

//@Data
public abstract class Employee {


    private int id,salary,workingHours;
    private String name;
    public Employee(int id, int salary, int workingHours, String name) {
        this.id = id;
        this.salary = salary;
        this.workingHours = workingHours;
        this.name = name;
    }
    public abstract String getJob();

    //<editor-fold decs="getter setter">
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;

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

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    //</editor-fold>
}
