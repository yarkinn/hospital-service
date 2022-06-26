import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeList employees = new EmployeeList();
        System.out.println("Welcome to Hospital Employee Management System");
        boolean stop = false;
        while(!stop){
            System.out.println("Press 1 to add new employee\n Press 2 to remove employee\nPress 3 to list employees");
            System.out.print( "Your choice: ");
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            System.out.println();
            if( choice == 1){
                System.out.print("Id of the employee: ");
                int id = in.nextInt();
                System.out.print("Type of employee: ");
                String type = in.next();
                employees.addEmployee(id,type);
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

        }
    }
}
