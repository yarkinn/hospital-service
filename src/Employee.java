public abstract class Employee {
    private int id,salary,workingHours;
    private String name;
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




}
