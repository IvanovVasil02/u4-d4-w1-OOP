package entities;

public class Dependent {
  protected double basicSalary;

  private double salary;
  private int dependentId;
  private double extraordinary;
  private Level level;
  private Department department;

  public Dependent(int dependentId, Department department) {
    this.basicSalary = 1000;
    this.extraordinary = 30;
    this.level = Level.WORKER;
    this.dependentId = dependentId;
    this.department = department;
    this.salary = basicSalary;
  }

  public Dependent(int dependentId, Department department, Level level) {
    this(dependentId, department);
    this.level = level;
    this.extraordinary = 30;
    switch (this.level){
      case EMPLOYEE:
        this.salary = 1200;
        break;

      case FRAMEWORK:
        this.salary = 1500;
        break;
      case MANAGER:
        this.salary = 2000;
        break;
      default:
        this.salary = 1000;
        break;
    }

  }

  //  getter
  public static double getSalary(Dependent dependent) {
    return dependent.salary;
  }
  public double calcTotalSalary(Dependent dependent, int extraHour) {
    return dependent.salary + (extraHour * this.basicSalary);
  }
  public static int getTotalEmployeeSalary (Dependent[] salaries) {

    int total = 0;

    for (Dependent dependent : salaries) {
      total += (int) dependent.salary + (5 * 30);
    }
    return total;

  }

  public int getDependentId() {
    return dependentId;
  }

  public double getExtraordinary() {
    return extraordinary;
  }

  public Level getLevel() {
    return level;
  }

  public Department getDepartment() {
    return department;
  }


// setter
  public void setExtraordinary(double extraordinary) {
    this.extraordinary = extraordinary;
  }

  public void setLevelUp() {
    switch (this.level){

      case WORKER:
        this.level = Level.EMPLOYEE;
        this.salary *= 1.2;
        System.out.println("Promotion to: " + this.level);

        break;

      case EMPLOYEE:
        this.level = Level.FRAMEWORK;
        this.salary *= 1.5;
        System.out.println("Promotion to: " + this.level);

        break;

      case FRAMEWORK:
        this.level = Level.MANAGER;
        this.salary *= 2;
        System.out.println("Promotion to: " + this.level);
        break;
      default:
        this.level = Level.WORKER;
    }

  }

  public void setDepartment(Department department) {
    this.department = department;
  }

//  toString

  @Override
  public String toString() {
    return "Dependent{" +
            "salary=" + salary +
            ", dependentId=" + dependentId +
            ", extraordinary=" + extraordinary +
            ", level=" + level +
            ", department=" + department +
            '}';
  }

  public void printData(){
    System.out.println(toString());;
  }
  public static void printData(Dependent[] dependents){
    for (Dependent dependent : dependents){
      System.out.println(dependent.toString());
    }
  }

}
