import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeManagement {
    static ArrayList<Employee> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1.Add 2.View 3.Search 4.Delete 5.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Salary: ");
                    double sal = sc.nextDouble();
                    list.add(new Employee(id, name, sal));
                    break;

                case 2:
                    for (Employee e : list)
                        System.out.println(e.id + " " + e.name + " " + e.salary);
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int sid = sc.nextInt();
                    for (Employee e : list)
                        if (e.id == sid)
                            System.out.println("Found: " + e.name);
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int did = sc.nextInt();
                    list.removeIf(e -> e.id == did);
                    break;

                case 5:
                    return;
            }
        }
    }
}
