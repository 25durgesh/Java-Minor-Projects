import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Full Time Employee");
        System.out.println("2. Part Time Employee");
        System.out.print("Choose employee type: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Enter Basic Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new FullTimeEmployee(id, name, salary);
            emp.displayDetails();
            System.out.println("Total Salary: " + emp.calculateSalary());

        } else if (choice == 2) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Hours Worked: ");
            int hours = sc.nextInt();

            System.out.print("Rate per Hour: ");
            double rate = sc.nextDouble();

            Employee emp = new PartTimeEmployee(id, name, hours, rate);
            emp.displayDetails();
            System.out.println("Total Salary: " + emp.calculateSalary());
        } else {
            System.out.println("Invalid Choice!");
        }
    }
}
