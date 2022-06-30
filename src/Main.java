

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeList employees = new EmployeeList(new ArrayList<>());
        System.out.println("Welcome to Hospital Employee Management System");
        boolean stop = false;
        while(!stop){
            try{
                System.out.println("Press 1 to add new employee\nPress 2 to remove employee\nPress 3 to list employees");
                System.out.print( "Your choice: ");
                Scanner in = new Scanner(System.in);
                int choice = in.nextInt();
                System.out.println();
                if( choice == 1){
    
                    System.out.print("Id of the employee: ");
                    int id = in.nextInt();
                    while(id <0){
                        System.out.print("Id can't be negative,please enter a new id: ");
                        id = in.nextInt();
    
                    }
                    while( employees.employeeExists(id)){
                        System.out.print("Employee with this id already exists, choose a different id: ");
                        id = in.nextInt();
                    }
                    System.out.println( "Employee types to choose from: doctor, nurse, pct, pt, sw");
                    System.out.print("Type of employee: ");
                    String type = in.next();
    
                    while( !employees.jobExists(type)){
                        System.out.print("Invalid type of employee. Please type another type: ");
                        type = in.next();
                    }
                    System.out.print("Name of employee: ");
                    String name = in.next();
                    System.out.print("Salary of employee: ");
                    int salary = in.nextInt();
                    while( salary < 0  ){
                        System.out.print("Salary can't be negative,please enter a new salary: ");
                        salary = in.nextInt();
                    }
                    System.out.print("Working hour of employee: ");
    
                    int workingHours = in.nextInt();
                    while( workingHours < 0  ){
                        System.out.print("Working hours can't be negative,please enter a new salary: ");
                        workingHours = in.nextInt();
                    }
                    employees.addEmployee(id,type,name,salary,workingHours);
                }
                else if( choice == 2){
                    System.out.print("Id of the employee: ");
                    int id = in.nextInt();
                    employees.removeEmployee(id);
    
                } else if (choice == 3) {
                    employees.listEmployees();
                }
                System.out.print("If you want to continue type 1 else 0: ");
                choice = in.nextInt();
                if(choice == 0){
                    stop = true;
                }
    
            }catch( Exception e){
                System.out.println("Invalid input!");

            }

        }
           
    }
}
