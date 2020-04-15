package util;

public class Date
{
    private int month;
    private int day;
    private int year;
    
    public int getMonth()
    {
        return month;
    }
    
    public void setMonth (int mm)
    {
        if (mm >= 1 && mm <= 12)
            month = mm;
        else
            errorMessage ("Month must be 1 to 12");
    }
    
    public int getDay()
    {
        return day;
    }
    
    public void setDay (int dd)
    {
        if (dd >= 1 && dd <= 31)
            day = dd;
        else
            errorMessage ("Day must be 1 to 31");
    }
    
    public int getYear()
    {
        return year;
    }
    
    public void setYear (int yyyy)
    {
        year = yyyy;
    }
    
    private void errorMessage (String msg)
    {
        System.out.println ("Error Message: " + msg);
    }
}
