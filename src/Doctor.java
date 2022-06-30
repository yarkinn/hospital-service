public class Doctor extends Employee{


    public Doctor(int id,int salary,int workingHours,String name){
        super(id,salary,workingHours,name);
    }

    @Override
    public String getJob() {
        return "doctor";
    }


}