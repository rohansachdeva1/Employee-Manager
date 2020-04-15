import util.*;

public class Unit11Assignment
{
	public static void main( String [] args )
    {
        int empNumber = 0;
        
        Name empName;
        String firstName;
        String lastName;
        
        Address empAddress;
        String street;
        String city;
        String state;
        String zipCode;
        
        Date empHireDate;
        int month = 0;
        int day = 0;
        int year = 0;
        
        String prompt = "Enter number of employees: ";
        int empCount = Input.getInt (prompt);
        
        if (empCount > 0)
        {
            Employee employee;
            Employee empTable[] = new Employee[empCount];
            
            for (int i = 1; i <= empCount; i++)
            {
                // get and save employee number
                prompt = "Employee " + i + ": enter employee number: ";
                empNumber = Input.getInt (prompt);
                
                // get and save employee name
                prompt = "Employee " + i + ": enter employee first name: ";
                firstName = Input.getString (prompt);
                prompt = "Employee " + i + ": enter employee last name: ";
                lastName = Input.getString (prompt);
                empName = new Name();
                empName.setFirstName (firstName);
                empName.setLastName (lastName);
                
                // get and save employee address
                prompt = "Employee " + i + ": enter employee street: ";
                street = Input.getString (prompt);
                prompt = "Employee " + i + ": enter employee city: ";
                city = Input.getString (prompt);
                prompt = "Employee " + i + ": enter employee state: ";
                state = Input.getString (prompt);
                prompt = "Employee " + i + ": enter employee zip code: ";
                zipCode = Input.getString (prompt);
                empAddress = new Address();
                empAddress.setStreet (street);
                empAddress.setCity (city);
                empAddress.setState (state);
                empAddress.setZipCode (zipCode);
                
                // get and save hire date
                prompt = "Employee " + i + ": enter start date (mm): ";
                month = Input.getInt (prompt);
                prompt = "Employee " + i + ": enter start date (dd): ";
                day = Input.getInt (prompt);
                prompt = "Employee " + i + ": enter start date (yyyy): ";
                year = Input.getInt (prompt);
                empHireDate = new Date();
                empHireDate.setMonth (month);
                empHireDate.setDay (day);
                empHireDate.setYear (year);
            
                // create new employee from the above information
                employee = new Employee (empNumber, empName, empAddress, empHireDate);
                
                // save employee in array
                empTable[i-1] = employee;
            }
            
            // display employee table
            for (int i = 0; i < empCount; i++)
                empTable[i].displayEmployee(empTable[i]);
        }
        else
            System.out.println("Error Message: Number of employees must be > 0");
    }
        
}
