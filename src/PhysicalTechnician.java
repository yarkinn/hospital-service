public class PhysicalTechnician extends Employee{

    public PhysicalTechnician(int id,int salary,int workingHours,String name){
        super(id, salary, workingHours, name);
    }

    @Override
    public String getJob() {
        return "pt";
    }
}


