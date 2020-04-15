import util.*;

public class Employee
{
    private int empNumber;
    private Name empName;
    private Address empAddress;
    private Date empHireDate;
    
    public Employee (int number, Name name, Address address)
    {
        empNumber = number;
        empName = name;
        empAddress = address;
    }
    
    public Employee (int number, Name name, Address address, Date hireDate)
    {
        empNumber = number;
        empName = name;
        empAddress = address;
        empHireDate = hireDate;
    }
    
    public void displayEmployee (Employee emp)
    {
        System.out.println ();
        System.out.println ("Employee number: " + emp.empNumber);
        System.out.println ("Employee name: " + emp.empName.getFirstName() + " " + emp.empName.getLastName());
        System.out.println ("Employee address: " + emp.empAddress.getStreet() + ", " + emp.empAddress.getCity() + ", " + emp.empAddress.getState() + " " + emp.empAddress.getZipCode());
        System.out.println ("Employee hire date: " + emp.empHireDate.getMonth() + "/" + emp.empHireDate.getDay() + "/" + emp.empHireDate.getYear());
    }
}
