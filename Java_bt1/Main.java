package Java_bt1;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Employee> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static int nextId = 1;

    public static void main(String[] args) {

        initializeEmployees();

        displayEmployeeList();

        addEmployee();

        removeEmployee();

        displayEmployeeList();
    }

    private static void removeEmployee() {
        System.out.print("Enter ID of the employee to remove: ");
        int idToRemove = scanner.nextInt();
        scanner.nextLine();

        boolean removed = false;
        for (Employee emp : employees) {
            if (emp.getId() == idToRemove) {
                employees.remove(emp);
                System.out.println("Employee removed successfully.");
                removed = true;
                break;
            }
        }

        if (!removed) {
            System.out.println("Employee with ID " + idToRemove + " not found.");
        }
    }

    private static void addEmployee() {
        System.out.println("Add Employee");
        System.out.println("Enter employee details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Code: ");
        String code = scanner.nextLine();
        System.out.print("Salary Rate: ");
        double salaryRate = scanner.nextDouble();
        scanner.nextLine();

        employees.add(new Employee(nextId++, name, age, department, code, salaryRate));
        System.out.println("Employee added successfully.");
    }

    private static void initializeEmployees() {
        employees.add(new Employee(nextId++, "John Doe", 30, "HR", "JD001", 2000.0));
        employees.add(new Employee(nextId++, "Jane Smith", 35, "IT", "JS002", 2500.0));
        employees.add(new Employee(nextId++, "Michael Johnson", 28, "Marketing", "MJ003", 2200.0));
        employees.add(new Employee(nextId++, "Emily Davis", 33, "Finance", "ED004", 2700.0));
        employees.add(new Employee(nextId++, "William Wilson", 40, "Operations", "WW005", 2300.0));
        employees.add(new Employee(nextId++, "Olivia Brown", 32, "Sales", "OB006", 2600.0));
        employees.add(new Employee(nextId++, "James Miller", 37, "Engineering", "JM007", 2800.0));
        employees.add(new Employee(nextId++, "Sophia Garcia", 29, "Product Management", "SG008", 2400.0));
        employees.add(new Employee(nextId++, "Benjamin Martinez", 34, "Customer Support", "BM009", 2100.0));
        employees.add(new Employee(nextId++, "Emma Taylor", 31, "Research", "ET010", 2900.0));
    }

    private static void displayEmployeeList() {
        System.out.println("Employee List:");
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
    }
}
