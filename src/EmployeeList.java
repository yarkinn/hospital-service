import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    public EmployeeList(){
        this.employees = new ArrayList<>();
    }

    private List<Employee> employees;

    public boolean employeeExists(int id){
        for (Employee i:
             employees) {
            if( i.getId() == id){
                return true;
            }

        }
        return false;

    }
    public void addEmployee( int id, String type,String name){
        if( !employeeExists(id)){

            if(type.compareTo("doctor") == 0){
                employees.add(new Doctor(id,name));
            }
            else if(type.compareTo("nurse") == 0){
                employees.add( new Nurse(id,name));

            }
            else if(type.compareTo("pct") == 0){
                employees.add( new PatientCareTechnician(id,name));

            }
            else if(type.compareTo("pt") == 0){
                employees.add( new PhysicalTechnician(id,name));

            }
            else if(type.compareTo("sw") == 0){
                employees.add( new SocialWorker(id,name));

            }
            else{
                System.out.println( "Employee type doesn't exist");
            }
        }
    }
    public void removeEmployee(int id){
        if( employeeExists(id)){
            for (Employee e:
                 employees) {
                if(e.getId() == id){
                    employees.remove(e);
                    break;
                }

            }
        }
        else{
            System.out.println("Employee doesn't exist");
        }
    }
    public void listEmployees(){
        for (Employee e:
             employees) {
            System.out.println( "Id: " + e.getId() +"\nName: " + e.getName() + "\nSalary: " + e.getSalary() + "\nWorkingHours: " + e.getWorkingHours() );
            System.out.println();
        }

    }



}
