public class Doctor extends Employee{


    public Doctor(int id,String name){
        this.setName(name);
        this.setId(id);
        this.setWorkingHours(60);
        this.setSalary(10000);
    }

}