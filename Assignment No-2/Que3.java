import java.util.Scanner;
class Que3
{
    public static void main(String[]args)
    {
        Employee e;
        Employee emp[] = {new Employee(102,"NILESH",7000),new Employee(101,"BHAGESH",5000), new Employee(103,"ATHARV",8000),new Employee(104,"SHREYASH",9000)};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Salary : ");
        double salary =  sc.nextDouble();
        for(int i = 0;i<emp.length;i++)
        {
            int j = i-1;
            while(j>=0 && emp[j].getEmpSalary()== salary)
            {
                emp[j].display();
                j--;
            }
        }
        
    }
}
class Employee
{
    private int empId;
    private  String empName;
    private double empSalary;

    public Employee()
    {

    }
    public Employee(int empId,String empName,double empSalary)
    {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

   
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee id : ");
        empId = sc.nextInt();
        System.out.println("Employee Name : ");
        empName = sc.next();
        System.out.println("Employee Salary : ");
        empSalary = sc.nextDouble();
    }

    void display()
    {
        System.out.println("Employee Id : "+empId);
        System.out.println("Employee Name : "+empName);
        System.out.println("Employee Salary : "+empSalary);
    }

    int getEmpId()
    {
        return empId;
    }

    String getEmpName()
    {
        return empName;
    }

    double getEmpSalary()
    {
        return empSalary;
    }

    void setEmpId(int empId)
    {
        this.empId = empId;
    }

    void  setEmpName(String empName)
    {
        this.empName = empName;
    }

    void setEmpSalary(double empSalary)
    {
        this.empSalary = empSalary;
    }
}
