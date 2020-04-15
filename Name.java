package util;

public class Name
{
    private String firstName;
    private String lastName;
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public void setFirstName (String fn)
    {
        if (fn.length() > 0)
            firstName = fn;
        else
            errorMessage ("First name cannot be empty");
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public void setLastName (String ln)
    {
        if (ln.length() > 0)
            lastName = ln;
        else
            errorMessage ("Last name cannot be empty");
    }
    
    private void errorMessage (String msg)
    {
        System.out.println ("Error Message: " + msg);
    }
}
