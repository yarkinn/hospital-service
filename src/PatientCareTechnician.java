public class PatientCareTechnician extends Employee{

    public PatientCareTechnician(int id,String name){
        this.setName(name);
        this.setId(id);
        this.setWorkingHours(40);
        this.setSalary(8000);
    }
}