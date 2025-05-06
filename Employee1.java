public class Employee1{
    String name;
    int id;
    double salary;
    Employee1(String name,int id,double salary)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void displayInfo()
    {
        System.out.println("Employee id:"+id);
        System.out.println("Employee name:"+name);
        System.out.println("Employee salary:"+salary);
    }
    public static void main(String[] args) {
        Employee1 emp1= new Employee1("ankita",101,5000.00);
        emp1.displayInfo();
    }
}