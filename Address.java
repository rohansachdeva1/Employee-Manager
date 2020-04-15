package util;

public class Address
{
    private String street;
    private String city;
    private String state;
    private String zipCode;
    
    public String getStreet()
    {
        return street;
    }
    
    public void setStreet (String str)
    {
        street = str;
    }
    
    public String getCity()
    {
        return city;
    }
    
    public void setCity (String cty)
    {
        city = cty;
    }
    
    public String getState()
    {
        return state;
    }
    
    public void setState (String sta)
    {
        if (sta.length() == 2)
        {
            sta = sta.toUpperCase();
            
            if ((sta.charAt(0) >= 'A' && sta.charAt(0) <= 'Z') &&
                (sta.charAt(1) >= 'A' && sta.charAt(1) <= 'Z'))
                state = sta;
            else
                errorMessage ("State must be letters only");
        }
        else
            errorMessage ("State must be 2 letters long");
    }
    
    public String getZipCode()
    {
        return zipCode;
    }
    
    public void setZipCode (String zip)
    {
        if (zip.length() == 5)
        {
            for (int i = 0; i < 5; i++)
            {
                if (zip.charAt(i) >= '0' && zip.charAt(i) <= '9')
                    zipCode = zip;
                else
                {
                    errorMessage ("Zip code must be digits only");
                    break;
                }
            }
        }
        else
            errorMessage ("Zip code must be 5 digits long");
    }
    
    private void errorMessage (String msg)
    {
        System.out.println ("Error Message: " + msg);
    }
}
