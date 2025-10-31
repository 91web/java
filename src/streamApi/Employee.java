package streamApi;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Employee {
    private  String name;
    private  String department;
    //Constructor
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    // toString
    public String toString() {
        return name; }
    //Getter for Name
    public String getName() {
        return name;
    }
    //Getter for Department
    public String getDepartment() { return department; }

    //main method
    public static <list> void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Yusuf Babatunde", "Backend"),
                new Employee("Ahmed Ibrahim", "UI/UX"),
                new Employee("Abdulah Kabeer", "FrontEnd"),
                new Employee("Suliyat Ahmed", "HR" ),
                new Employee("Yusuf Ahmad", "Backend"),
                new Employee("Folake Ibrahim", "UI/UX"),
                new Employee("Dolapo Ibrahim", "FrontEnd"),
                new Employee("Suliyat Yusuf", "HR" ),
                new Employee("Yusuf Yusuf", "Backend"),
                new Employee("Kadijat Yahyah", "UI/UX"),
                new Employee("Dolapo Mariam", "FrontEnd"),
                new Employee("George John", "HR" )
        );
        
        Map<String, List<Employee>> employeesByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
          System.out.println(employeesByDept);


      //  System.out.println( employees.stream().collect(Collectors.groupingBy(Employee::getDepartment)));
       // System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getName)));
}
}
