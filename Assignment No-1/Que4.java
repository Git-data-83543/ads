import java.util.Scanner;
class Que4
{
    public static void main(String[]args)
    {
        Employee e1 = new Employee(101,"BHAGESH",5000);
        Employee e2 = new Employee(102,"NILESH",7000);
        Employee e3 = new Employee(103,"ATHARV",8000);
        Employee e4 = new Employee(104,"SHREYASH",9000);
        
        Employee emp[] = {e1,e2,e3,e4};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Id : ");
        int id =  sc.nextInt();
        for(int i = 0;i<emp.length;i++)
        {
            if(id == emp[i].getEmpId())
            {
                System.out.println("Searched using Employee id : ");
                emp[i].display();
                break;
            }
            else
            {
                System.out.println("Employee Not Exist !!");
                break;
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