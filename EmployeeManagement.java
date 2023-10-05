import entities.Department;
import entities.Dependent;
import entities.Level;

public class EmployeeManagement {
  public static void main(String[] args) {
    Dependent dep1 = new Dependent(1, Department.PRODUCTION, Level.EMPLOYEE);
    Dependent dep2 = new Dependent(2, Department.PRODUCTION, Level.EMPLOYEE);
    Dependent dep3 = new Dependent(3, Department.ADMINISTRATION, Level.MANAGER);
    Dependent dep4 = new Dependent(4, Department.SALES, Level.WORKER);


    Dependent[] dependents = {dep1, dep2, dep3, dep4};

    Dependent.printData(dependents);
    System.out.println(Dependent.getTotalEmployeeSalary(dependents));
  }

}
