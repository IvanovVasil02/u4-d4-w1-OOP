import entities.Department;
import entities.Dependent;
import entities.Level;

public class EmployeeManagement {
  public static void main(String[] args) {
    Dependent dep1 = new Dependent(1, Department.PRODUCTION, Level.EMPLOYEE);
    Dependent dep2 = new Dependent(2, Department.PRODUCTION, Level.EMPLOYEE);
    Dependent dep3 = new Dependent(3, Department.ADMINISTRATION, Level.MANAGER);
    Dependent dep4 = new Dependent(4, Department.SALES, Level.WORKER);

    dep1.printData();
    dep2.printData();
    dep3.printData();
    dep4.printData();

    Dependent[] dependents = {dep1, dep2, dep3, dep4};

    System.out.println(Dependent.getTotalEmployeeSalary(dependents));
  }

}
