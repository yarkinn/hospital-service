public class Nurse implements Employee{
    private int id,salary,workingHours;

    public Nurse(int id){
        this.setId(id);
        this.setWorkingHours(60);
        this.setSalary(6000);
    }
    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;

    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;

    }

    @Override
    public int getWorkingHours() {
        return workingHours;
    }

    @Override
    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }


}
