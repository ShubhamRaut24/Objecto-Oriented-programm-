package Inheritance;

 class Employee {

  String name="xyz";
  double salary=1500.254;
  public String getName() {
   return name;
  }

  public void setName(String name) {
   this.name = name;
  }

  public double getSalary() {
   return salary;
  }

  public void setSalary(int salary) {
   this.salary = salary;
  }

}
class Manager extends Employee{  //manager extends employee is single level inheritance

  String department;
  String address;

}
class Developer extends Employee{   //manager and developer extends employee is Hierarchical inheritance

}

class HR extends Manager{    //manager extends employee and HR extends manager  is Multi level inheritance

}