package javaapplication1;
import java.util.ArrayList;
public class Task 
{
    private short ID;
    private String Title;
    private String StartDate,EndDate;
    private ArrayList<TeamMember> Members = new ArrayList<TeamMember>();
    private String Status;
    public void SetID(short ID)
    {
        this.ID=ID;
    }
    public short GetID()
    {
        return ID;
    }
    public void SetTitle(String Title)
    {
        this.Title = Title;
    }
    public String GetTitle()
    {
        return Title;
    }
    public void SetStatus(String Status)
    {
        this.Status=Status;
    }
    public String GetStatus()
    {
        return Status;
    }
    public void SetStartDate(String Date)
    {
        StartDate=Date;
    }
    public String GetStartDate()
    {
        return StartDate;
    }
    public void SetEndtDate(String Date)
    {
        EndDate=Date;
    }
    public String GetEndDate()
    {
        return EndDate;
    }
}