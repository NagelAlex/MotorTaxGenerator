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
	private String gender;

    public Person()
    {	
    	this.name=name;
    	this.age=age;
    	this.gender=gender;
    	//this("no",0,'n');
    }
    public Person(String name,int age,String gender)
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
    public void setGender(String gender)
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
    public String getGender()
    {
    	return gender;
    }
    public String toString()
    {    		
    	return name + ", " + age + ", " + gender;		
    }   
    
}