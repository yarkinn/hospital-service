public class PatientCareTechnician extends Employee{

    public PatientCareTechnician(int id,int salary,int workingHours,String name){
        super(id, salary, workingHours, name);
    }

    @Override
    public String getJob() {
        return "pct";
    }
}