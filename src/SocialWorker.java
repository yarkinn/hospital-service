public class SocialWorker extends Employee{

    public SocialWorker(int id,int salary,int workingHours, String name){
        super(id,salary,workingHours,name);
    }

    @Override
    public String getJob() {
        return "sw";
    }
}



