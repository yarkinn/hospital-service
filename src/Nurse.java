public class Nurse extends Employee{

    public Nurse(int id,int salary,int workingHours,String name){
        super(id, salary, workingHours, name);
    }

    @Override
    public String getJob() {
        return "nurse";
    }


}
