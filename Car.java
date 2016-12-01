/**
 * @(#)Car.java
 *
 *
 * @author 
 * @version 1.00 2016/11/17
 */


public class Car {
	private RegNo regNo;
	private String brand;
	private String model;
	private int engSize;
	private String fuel;
	private int co2;
	private double value;
	private Person owner;
	String motorTax;

    public Car() {
    	regNo = new RegNo();
	    brand = "No Brand Specified";
	    model = "No Model Specified";
	    engSize = 0;
	    fuel = "No Fuel Type Specified";
	    co2 = 0;
	    value = 0.0f;
	    owner = new Person();
	    
    }
    public Car(int day,int month,String year,String location,String brand,String model,int engSize,String fuel,int co2,double value,String name,int age,String gender) {
    	regNo = new RegNo(day,month,year,location);
    	setBrand(brand);
    	setModel(model);
    	setEngSize(engSize);
    	setFuel(fuel);
    	setCo2(co2);
    	setValue(value);
    	owner = new Person(name,age,gender);
    	
    }
    
    //--------------------------------------------------------
    public void setRegNo(int day,int month,String year,String location)
    {
    	regNo.setDay(day);
  	    regNo.setMonth(month);
  	    regNo.setYear(year);
  	    regNo.setLocation(location);
   	
    }
    public void setBrand(String brand)
    {
    	this.brand=brand;
    }
    public void setModel(String model)
    {
    	this.model=model;
    }
    public void setEngSize(int engSize)
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
  	
  	public void setOwner(String name,int age,String gender)
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
    //----------------------------------------------------------
    public String toString()
    {
    	
    		
    	    return regNo + "\nCar Brand: " + brand + "\nCar Model: " + model + "\nEngine Size: " + engSize + "CC" +
    			"\nFuel Type: " + fuel + "\nCar Value: " + value + " Euro" + "\nCo2 Emission : " + co2 + " g/km" +
    				"\nOwner: " + owner.toString();

    }
    
    public String motorTaxRate()
    {
    	int year = Integer.parseInt(regNo.getYear());
    	float engineSize = getEngSize();
    	int co2 = getCo2();
    	String motorTax = "";
    	
    	
    	
    	if (year <= 2008)
    	{
    		if(engineSize>=0 && engineSize <=1000)
    		{
    			motorTax = ("Your anual Motor Tax is: " + 199 + "Euro");
    		}
    		else if(engineSize<=1100)
    		{
    			motorTax = ("Your anual Motor Tax is: " + 299 + "Euro");
    		}
    		else if(engineSize<=1200)
    		{
    			motorTax = ("Your anual Motor Tax is: " + 330 + "Euro");
    		}
    		else if(engineSize<=1300)
    		{
    			motorTax = ("Your anual Motor Tax is: " + 358 + "Euro");
    		}
    		else if(engineSize<=1400)
    		{
    			motorTax = ("Your anual Motor Tax is: " + 385 + "Euro");
    		}
    		else if(engineSize<=1500)
    		{
    			motorTax = ("Your anual Motor Tax is: " + 413 + "Euro");
    		}
    		else if(engineSize<=1600)
    		{
    			motorTax = ("Your anual Motor Tax is: " + 330 + "Euro");
    		}
    		else if(engineSize<=1700)
    		{
    			motorTax = ("Your anual Motor Tax is: " + 544 + "Euro");
    		}
    		else if(engineSize<=1800)
    		{
    			motorTax = ("Your anual Motor Tax is: " + 636 + "Euro");
    		}
    		else if(engineSize<=1900)
    		{
    			motorTax = ("Your anual Motor Tax is: " + 673 + "Euro");
    		}
    		else if(engineSize<=2000)
    		{
    			motorTax = ("Your anual Motor Tax is: " + 710 + "Euro");
    		}
    		else if(engineSize<=2100)
    		{
    			motorTax = ("Your anual Motor Tax is: " + 906 + "Euro");
    		}
    		else if(engineSize<=2200)
    		{
    			motorTax = ("Your anual Motor Tax is: " + 951 + "Euro");
    		}
    		else if(engineSize<=2300)
    		{
    			motorTax = ("Your anual Motor Tax is: " + 994 + "Euro");
    		}
    		else if(engineSize<=2400)
    		{
    			motorTax = ("Your anual Motor Tax is: " + 1034 + "Euro");
    		}
    		else if(engineSize<=2500)
    		{
    			motorTax = ("Your anual Motor Tax is: " + 1080 + "Euro");
    		}
    		else if(engineSize<=2600)
    		{
    			motorTax = ("Your anual Motor Tax is: " + 1294 + "Euro");
    		}
    		else if(engineSize<=2700)
    		{
    			motorTax = ("Your anual Motor Tax is: " + 1345 + "Euro");
    		}
    		else if(engineSize<=2800)
    		{
    			motorTax = ("Your anual Motor Tax is: " + 1391 + "Euro");
    		}
    		else if(engineSize<=2900)
    		{
    			motorTax = ("Your anual Motor Tax is: " + 1443 + "Euro");
    		}
    		else if(engineSize<=3000)
    		{
    			motorTax = ("Your anual Motor Tax is: " + 1494 + "Euro");
    		}
    		else
    		{
    			motorTax = ("Your anual Motor Tax is: " + 1809 + "Euro");
    		}
    		
    	}
    	else 
    	{
    		if(co2<=0)
    		{
    				motorTax = ("Your anual Motor Tax is: " + 120 + "Euro");
    		}
    		else if(co2<=80)
    		{
    				motorTax = ("Your anual Motor Tax is: " + 170 + "Euro");
    		}
    		else if(co2<=100)
    		{
    				motorTax = ("Your anual Motor Tax is: " + 180 + "Euro");
    		}
    		else if(co2<=110)
    		{
    				motorTax = ("Your anual Motor Tax is: " + 190 + "Euro");
    		}
    		else if(co2<=120)
    		{
    				motorTax = ("Your anual Motor Tax is: " + 200 + "Euro");
    		}
    		else if(co2<=130)
    		{
    				motorTax = ("Your anual Motor Tax is: " + 270 + "Euro");
    		}
    		else if(co2<=140)
    		{
    				motorTax = ("Your anual Motor Tax is: " + 280 + "Euro");
    		}
    		else if(co2<=155)
    		{
    				motorTax = ("Your anual Motor Tax is: " + 390 + "Euro");
    		}
    		else if(co2<=170)
    		{
    				motorTax = ("Your anual Motor Tax is: " + 570 + "Euro");
    		}
    		else if(co2<=190)
    		{
    				motorTax = ("Your anual Motor Tax is: " + 750 + "Euro");
    		}
    		else if(co2<=225)
    		{
    				motorTax = ("Your anual Motor Tax is: " + 1200 + "Euro");
    		}
    		else
    		{
    				motorTax = ("Your anual Motor Tax is: " + 2350 + "Euro");
    		}
    	}
    	return motorTax;
    }
    
}