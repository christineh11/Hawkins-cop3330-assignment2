package ex39;

import java.util.Date;

public class Records {
    private String Firstname;
    private String Lastname;
    private String position;
    Date separationdate;


    public Records(String Firstname, String Lastname, String position, Date separationdate)
    {
        this.Firstname=Firstname;
        this.Lastname=Lastname;
        this.position=position;
        this.separationdate=separationdate;
    }

    public String setFirstName(String FirstName)
    {

        this.Firstname = Firstname;
        return FirstName;
    }


    public  String getFirstName()
    {
        return Firstname;
    }

    public void setLastName(String Lastname)
    {
        this.Lastname = Lastname;
    }

    public String getLastName()
    {
        return Lastname;
    }



    public void setposition(String position)
    {
        this.position = position;
    }


    public String getposition()
    {
        return position;
    }

    public void setdate(Date separationdate)
    {
        this.separationdate = separationdate;
    }

    public Date getdate()
    {
        return separationdate;
    }

    public String toString()
    {

        return String.format("%s %-20s | %-20s|%-20s",
                getFirstName(), getLastName(), getposition(),getdate());
    }



    }


