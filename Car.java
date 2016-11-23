/**
 * @(#)Car.java
 *
 *
 * @author 
 * @version 1.00 2016/11/22
 */


public class Car {
	private String regNo = getRegNo();
	private String brand;
	private String model;
	private float engSize;
	private String fuel;
	private int co2;
	private double value;
	private Person owner;

    public Car() {
	    brand = "No Brand Specified";
	    model = "No Model Specified";
	    engSize = 0.0f;
	    fuel = "No Fuel Type Specified";
	    co2 = 0;
	    value = 0.0;
	    owner = new Person();
    }
    public Car(String brand,String model,float engSize,String fuel,int co2,double value,String name,int age,char gender) {
    	setRegNo(regNo);
    	setBrand(brand);
    	setModel(model);
    	setEngSize(engSize);
    	setFuel(fuel);
    	setCo2(co2);
    	setValue(value);
    	owner = new Person(name,age,gender);
    	
    }
    
    public Car(String brand,String model,float engSize,String fuel,int co2,double value,Person owner) {
    	setRegNo(regNo);
    	setBrand(brand);
    	setModel(model);
    	setEngSize(engSize);
    	setFuel(fuel);
    	setCo2(co2);
    	setValue(value);
    	setOwner(owner);
    	
    }
    
    //--------------------------------------------------------
    public void setRegNo(String regNo)
    {
    	this.regNo=regNo;
   	
    }
    public void setBrand(String brand)
    {
    	this.brand=brand;
    }
    public void setModel(String model)
    {
    	this.model=model;
    }
    public void setEngSize(float engSize)
    {
    	this.engSize=engSize;
    }
    public void setFuel(String fuel)
    {
    	this.fuel=fuel;
    }
    public void setCo2(int co2)
    {
    	this.co2=co2;
    }
    public void setValue(double value)
    {
    	this.value=value;
    }
    public void setOwner(Person owner)
    {
  	    this.owner=owner;
  	}
  	
  	public void setOwner(String name,int age,char gender)
    {
  	    owner.setName(name);
  	    owner.setAge(age);
  	    owner.setGender(gender);
  	}
  	
    //---------------------------------------------------------
    public String getBrand()
    {
    	return brand;
    }
    public String getModel()
    {
    	return model;
    }
    public float getEngSize()
    {
    	return engSize;
    }
    public String getFuel()
    {
    	return fuel;
    }
    public int  getCo2()
    {
    	return co2;
    }
    public double getValue()
    {
    	return value;
    }
    public Person getOwner()
    {
	     return owner;
    } 
    public String getRegNo()
    {
    	int day =03;
    	int month =02;
    	int seq = 0;
    	String yearAsString ="2016";
    	String location = "Kerry";
    	String output="";
    	int min = 0;
    	int max =999;
    	int minmax =(max-min)+1;
    	
    	if (location.equals("Kerry"))
    	{ 
			return "Registration Number: "+yearAsString.substring(2)+"-KY-"+(day+month)+(int)(Math.random() * minmax);
		}
    	else
    		return "Registration Number: "+yearAsString.substring(2)+"-D-"+(day+month)+(int)(Math.random() * minmax);
    }
    //----------------------------------------------------------
    public String toString()
    {
    	
    		
    	    return regNo + "\nCar Brand: " + brand + "\nCar Model: " + model + "\nEngine Size: " + engSize + "L" +
    			"\nFuel Type: " + fuel + "\nCar Value: " + value + " Euro" + "\nCo2 Emission : " + co2 + " g/km" +
    				"\nOwner: " + owner.toString();

    }
    
}