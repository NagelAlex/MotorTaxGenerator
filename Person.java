/**
 * @(#)Person.java
 *
 *
 * @author 
 * @version 1.00 2016/11/17
 */


public class Person {
	
	private String name;
	private int age;
	private char gender;

    public Person()
    {	
    	this.name=name;
    	this.age=age;
    	this.gender=gender;
    	//this("no",0,'n');
    }
    public Person(String name,int age,char gender)
    {	
    	setName(name);
    	setAge(age);
    	setGender(gender);
    }
    //========================================================
    public void setName(String name)
    {
    	this.name=name;
    }
    public void setAge(int age)
    {
    	this.age=age;
    }
    public void setGender(char gender)
    {
    	this.gender=gender;
    }
    //==============================================================
    public String getName()
    {
    	return name;
    }
    public int getAge()
    {
    	return age;
    }
    public char getGender()
    {
    	return gender;
    }
    public String toString()
    {
    	if(name !=null)
    		
    		return name + " " + age + " " + gender;
    		
    	else
    	    return "No Owner Specified";
    }
    
    
}