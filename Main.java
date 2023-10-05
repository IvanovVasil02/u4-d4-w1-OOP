import entities.Department;
import entities.Dependent;
import entities.Level;

public class Main {
  public static void main(String[] args) {
    Dependent franco = new Dependent(233, Department.ADMINISTRATION);
    Dependent gianFranco = new Dependent(773, Department.SALES, Level.WORKER);

    System.out.println(franco.toString());

    gianFranco.printData();
    gianFranco.setLevelUp();
    gianFranco.printData();
    gianFranco.setLevelUp();
    gianFranco.printData();
    gianFranco.setLevelUp();
    gianFranco.printData();

    System.out.println(Dependent.getSalary(gianFranco));
    System.out.println(gianFranco.calcTotalSalary(gianFranco, 4));
  }

}
