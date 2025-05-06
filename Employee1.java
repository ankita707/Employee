public class Employee1{
    String name;
    int id;
    double salary;
    int age;
    Employee1(String name,int id,double salary,int age)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.age=age;
    }
    public void displayInfo()
    {
        System.out.println("Employee id:"+id);
        System.out.println("Employee name:"+name);
        System.out.println("Employee salary:"+salary);
        System.out.println("Employee age:"+age);
    }
    public static void main(String[] args) {
        Employee1 emp1= new Employee1("ankita",101,5000.00,18);
        emp1.displayInfo();
    }
}