/**
 * @(#)CarTest.java
 *
 *
 * @author 
 * @version 1.00 2016/11/23
 */


public class CarTest {

    public static void main(String []args) {
    	
    //	Person p1 = new Person();
    //	Person p2 = new Person("Declan",35,'M');
    //	Car c1 = new Car("Toyota","Corolla",2.4f,"Petrol",140,3999,"Alexander Nagel",36,'M');
    //	Car c2 = new Car("BMW","M3",2.2f,"Diesel",98,5499,p2);
    	Car c3 = new Car(14,12,"2008","Kerry","Toyota","Corolla",2.4f,"Petrol",140,3999,"Alexander Nagel",36,'M');
    	Car c4 = new Car(14,12,"2012","Kerry","BMW","M5",2.2f,"Petrol",120,6999,"Declan",35,'M');
    	
    	System.out.println(c3.toString());
    	System.out.println(c4.toString());
    
    }
    
   /* public String getRegNum(int day,int month,String yearAsString,String county){
    	
    	String regNum;
    	int min = 0;
 		int max =999;
    	int minmax =(max-min)+1;
    	
    	if (county.equals("Kerry"))
    	{
    		regNum = yearAsString.substring(2)+getCountyCode()+(day+month)+(int)(Math.random() * minmax);
    	}	
    	else if (county.equals("Dublin"))
    	{
    		regNum = yearAsString.substring(2)+getCountyCode()+(day+month)+(int)(Math.random() * minmax);
    	}
    	else if (county.equals("Donegal"))
    	{
    		regNum = yearAsString.substring(2)+getCountyCode()+(day+month)+(int)(Math.random() * minmax);
    	}	
    	
    }
    public String getCountyCode(String county){
    	
    	String countyCode;
   
    	switch(county){
    		case "Kerry" :
    			countyCode = "-KY-";
    			break;
    		case "Dublin" :
    			countyCode = "-D-";
    			break;
    		case "Donegal" :
    			countyCode = "-DL-";
    			break;
    		case "Galway" :
    			countyCode = "-G-";
    			break;
    		case "Meath" :
    			countyCode = "-MH-";
    			break;
    		case "Mayo" :
    			countyCode = "-MO-";
    			break;
    		case "Offaly" :
    			countyCode = "-OY-";
    			break;
    		case "Tipperary" :
    			countyCode = "-T-";
    			break;
    		case "Wicklow" :
    			countyCode = "-WW-";
    			break;
    		default:
             	countyCode = "Invalid County";
    			break;
    	}
    	return countyCode;
    }
    */
    
}