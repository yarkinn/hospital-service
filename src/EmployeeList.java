import java.util.ArrayList;
import java.util.List;

public class EmployeeList {


    private List<Employee> employees;

    public EmployeeList( List<Employee> employeeList){
        this.employees = employeeList;
    }

    public boolean employeeExists(int id){
        for (Employee i: employees) {
            if( i.getId() == id){
                return true;
            }

        }
        return false;

    }
    public void addEmployee( int id, String type,String name,int salary,int workingHours){
        if( !employeeExists(id)){

            if(type.compareTo("doctor") == 0){
                employees.add(new Doctor(id,salary,workingHours,name));
            }
            else if(type.compareTo("nurse") == 0){
                employees.add( new Nurse(id,salary,workingHours,name));

            }
            else if(type.compareTo("pct") == 0){
                employees.add( new PatientCareTechnician(id,salary,workingHours,name));

            }
            else if(type.compareTo("pt") == 0){
                employees.add( new PhysicalTechnician(id,salary,workingHours,name));

            }
            else if(type.compareTo("sw") == 0){
                employees.add( new SocialWorker(id,salary,workingHours,name));

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
            System.out.println( "Id: " + e.getId() +"\nName: " + e.getName() +"\nJob: " + e.getJob() + "\nSalary: " + e.getSalary() + "\nWorkingHours: " + e.getWorkingHours() );
            System.out.println();
        }

    }



}
