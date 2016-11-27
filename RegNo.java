/**
 * @(#)RegNo.java
 *
 *
 * @author 
 * @version 1.00 2016/11/24
 */


public class RegNo {
	
	private int day;
	private int month;
	private String year;
	private String location;
	

    public RegNo() {
    	
    	this.day = day;
    	this.month = month;
    	this.year = year;
    
    }
    public RegNo(int day,int month,String year,String location)
    {	
    	setDay(day);
    	setMonth(month);
    	setYear(year);
    	setLocation(location);
    }
    //===================================================================
    public void setDay(int day)
    {
    	this.day=day;
    }
    public void setMonth(int month)
    {
    	this.month=month;
    }
    public void setYear(String year)
    {
    	this.year=year;
    }
    public void setLocation(String location)
    {
    	this.location=location;
    }
    //===================================================================
    public int getDay()
    {
    	return day;
    }
    public int getMonth()
    {
    	return month;
    }
    public String getYear()
    {
    	return year;
    }
    public String getLocation()
    {
    	return location;
    }
    //===================================================================
    public String toString()
    {
    	String output="";
    	int min = 0;
    	int max =999;
    	int minmax =(max-min)+1;
    	
    	if (location.equals("Kerry"))
    	{ 
			return "Registration Number: "+year.substring(2)+"-KY-"+(day+month)+(int)(Math.random() * minmax);
		}
    	else
    		return "Registration Number: "+year.substring(2)+"-D-"+(day+month)+(int)(Math.random() * minmax);
    }
    
}