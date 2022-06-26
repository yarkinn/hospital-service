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
    public void addEmployee( int id, String type){
        if( employeeExists(id)){
            System.out.println("Employee already exists");

        }
        else{
            if(type.compareTo("doctor") == 0){
                employees.add(new Doctor(id));
            }
            else if(type.compareTo("nurse") == 0){
                employees.add( new Nurse(id));

            }
            else if(type.compareTo("pct") == 0){
                employees.add( new PatientCareTechnician(id));

            }
            else if(type.compareTo("pt") == 0){
                employees.add( new PhysicalTechnician(id));

            }
            else if(type.compareTo("sw") == 0){
                employees.add( new SocialWorker(id));

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
            System.out.println( "Id: " + e.getId() + "\nSalary: " + e.getSalary() + "\nWorkingHours: " + e.getWorkingHours() );
            System.out.println();
        }

    }



}
