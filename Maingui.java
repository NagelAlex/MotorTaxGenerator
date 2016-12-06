/**
 * @(#)Maingui.java
 *
 *
 * @author 
 * @version 1.00 2016/11/22
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

@SuppressWarnings({"unchecked","deprecation"})
public class Maingui extends JFrame implements ActionListener{
    
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu,carMenu;
    JButton submitDate,submitOwner,calcTax,clearUi;
    JComboBox cmbCounties, cmbYear, cmbMonth, cmbDays, cmbGender, cmbFuel, cmbBrand;
    JTextField jtfName, jtfAge, jtfGender;
    JTextField jtfBrand, jtfModel, jtfEngSize, jtfFuel, jtfCo2, jtfValue;
    String [] listCounties = {"Kerry","Dublin","Cork","Clare","Galway","Donegal","Mayo","Waterford"};
    String [] listDays = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    String [] listMonth = {"01","02","03","04","05","06","07","08","09","10","11","12"};
    String [] listGender = {"","Male","Female"};
    String [] listFuel = {"","Petrol","Diesel","Electric","Hybrid"};
    String [] listBrand = {"","Aston Martin","Audi","BMW","Bentley","Cadillac","Chevrolet","Citroen","Dodge","Fiat","Ford","Honda","Jaguar","Jeep","Lexus","Mazda","Mercedes-Benz","Nissan","Opel","Renault","Toyota","Volkswagen","Volvo"};
    int [] years = new int[57];
    String [] listYears = new String[57];
    int j = 56,age;
    JPanel datePanel,ownerPanel,carPanel,regPanel,namePanel;
    JLabel jlRegNo,jlOwnerName;
    ArrayList <Car> resultsList = new ArrayList <Car>(); 
    JTextArea resultsArea;
    //private List<Car> resultsList;
    	

    public static void main (String [] args) {
		Maingui mainFrame = new Maingui();
        mainFrame.setVisible(true);
    }

    public Maingui () {
    	
        super("Motor Tax Calculator");
        setSize (900, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation( EXIT_ON_CLOSE );

        Container frame = getContentPane();
        frame.setBackground (Color.lightGray);
        setLayout(new FlowLayout()); 
        
        createFileMenu();
        createCarMenu();
        
        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        menuBar.add(carMenu);
        //==========================================================
       
        for(int i =1960; i < 2017; i++){
        		years[j] = i;
	        	listYears[j] = Integer.toString(years[j]);
        		j--;
        
        }
        //===========================================================
		datePanel = new JPanel(new FlowLayout());
       	
                
        cmbDays = new JComboBox(listDays);
        JLabel jlDays = new JLabel("Day");
       	datePanel.add(jlDays);
       	datePanel.add(cmbDays);
       	cmbDays.setSelectedIndex(0);
       	cmbDays.addActionListener(this);
       	
       	cmbMonth = new JComboBox(listMonth);
       	JLabel jlMonth = new JLabel("Month");
       	datePanel.add(jlMonth);
       	datePanel.add(cmbMonth);
       	cmbMonth.setSelectedIndex(0);
       	cmbMonth.addActionListener(this);
        
        cmbYear = new JComboBox(listYears);
       	JLabel jlYear = new JLabel("Year");
       	datePanel.add(jlYear);
       	datePanel.add(cmbYear);
       	cmbYear.setSelectedIndex(0);
       	cmbYear.addActionListener(this);
        
        cmbCounties = new JComboBox(listCounties);
        JLabel jlCounty = new JLabel("County");
        datePanel.add(jlCounty);
        datePanel.add(cmbCounties);
       	cmbCounties.setSelectedIndex(0);
       	cmbCounties.addActionListener(this);
       	
   		add(datePanel);
   		datePanel.setVisible(false);
        //datePanel.setBackground(Color.WHITE);
        
        submitDate = new JButton("Generate Reg NO.");
        submitDate.addActionListener(this);
        add(submitDate);
        submitDate.setVisible(false);
        //=========================================================
        regPanel = new JPanel(new FlowLayout());
        add(regPanel);
        regPanel.setBackground(Color.orange);
       	jlRegNo = new JLabel("");
        regPanel.add(jlRegNo);
        regPanel.setVisible(false);
        
        //=========================================================
        ownerPanel = new JPanel(new FlowLayout());
        add(ownerPanel);
          
        jtfName = new JTextField(10);
        JLabel jlName = new JLabel("Owner Name: ");
       	ownerPanel.add(jlName);
       	ownerPanel.add(jtfName);
       	
       	jtfAge = new JTextField(2);
        JLabel jlAge = new JLabel("Age: ");
       	ownerPanel.add(jlAge);
       	ownerPanel.add(jtfAge);
       	
       	cmbGender = new JComboBox(listGender);
        JLabel jlGender = new JLabel("Gender");
        ownerPanel.add(jlGender);
        ownerPanel.add(cmbGender);
       	cmbGender.setSelectedIndex(0);
       	cmbGender.addActionListener(this);
       	
       	submitOwner = new JButton("Submit Details");
        submitOwner.addActionListener(this);
        add(submitOwner);
       	
       	submitOwner.setVisible(false);
       	ownerPanel.setVisible(false);
       	
       	namePanel = new JPanel(new FlowLayout());
        add(namePanel);
        namePanel.setBackground(Color.orange);
       	jlOwnerName = new JLabel("");
        namePanel.add(jlOwnerName);
        namePanel.setVisible(false);
        //=================================================================
        carPanel = new JPanel(new FlowLayout());
        add(carPanel);
        carPanel.setVisible(false);
        
        cmbBrand = new JComboBox(listBrand);
        JLabel jlBrand = new JLabel("Make: ");
        carPanel.add(jlBrand);
        carPanel.add(cmbBrand);
       	cmbBrand.setSelectedIndex(0);
       	cmbBrand.addActionListener(this);
       	
       	jtfModel = new JTextField(7);
        JLabel jlModel = new JLabel("Model: ");
       	carPanel.add(jlModel);
       	carPanel.add(jtfModel);
       	
       	jtfEngSize = new JTextField(7);
        JLabel jlEngSize = new JLabel("Engine Size: ");
       	carPanel.add(jlEngSize);
       	carPanel.add(jtfEngSize);
       	
       	cmbFuel = new JComboBox(listFuel);
        JLabel jlFuel = new JLabel("Fuel type: ");
        carPanel.add(jlFuel);
        carPanel.add(cmbFuel);
       	cmbFuel.setSelectedIndex(0);
       	cmbFuel.addActionListener(this);
       	
       	jtfCo2 = new JTextField(7);
        JLabel jlCo2 = new JLabel("CO2: ");
       	carPanel.add(jlCo2);
       	carPanel.add(jtfCo2);
       	
       	jtfValue = new JTextField(7);
        JLabel jlValue = new JLabel("Value: ");
       	carPanel.add(jlValue);
       	carPanel.add(jtfValue);
       	
       	calcTax = new JButton("Calculate Road Tax");
        calcTax.addActionListener(this);
        add(calcTax);
        calcTax.setVisible(false);
        
        clearUi = new JButton("Clear");
        clearUi.addActionListener(this);
        add(clearUi);
        clearUi.setVisible(false);
       	
       	 	
    }

    public void actionPerformed(ActionEvent e) {
    	
    	
    	if (e.getActionCommand() .equals ("Exit"))
    	{
      	 	JOptionPane.showMessageDialog(null,"Thank You for using our system");
      	 	System.exit(0);
      	}
      	else if (e.getActionCommand() .equals ("Add Car"))
      	{
      		reset();
      		JOptionPane.showMessageDialog(null,"Please enter manufacture date of the vehicle and County of registration");
      	 	datePanel.setVisible(true);
      	 	submitDate.setVisible(true);
      	}
      	else if (e.getActionCommand() .equals ("Save")){
      		
      	 	//code
      	}
      	else if (e.getActionCommand() .equals ("Load")){
      		
      	 	//code
      	}
      	else if (e.getActionCommand() .equals ("Display Results")){
      		
      	 	//code
      	}
    	
        else if(e.getSource() == submitDate)
        {
        	int day, month;
        	String county, year;
        	JOptionPane.showMessageDialog(null,"Please enter Owner Details");
        	county = cmbCounties.getSelectedItem().toString();
        	day = Integer.parseInt(cmbDays.getSelectedItem().toString());
        	month = Integer.parseInt(cmbMonth.getSelectedItem().toString());  
        	year = cmbYear.getSelectedItem().toString(); 
        	RegNo regNum = new RegNo(day,month,year,county);
        	String reg = regNum.toString();
        	regPanel.setVisible(true);
        	jlRegNo.setText(reg);
        	ownerPanel.setVisible(true);
        	submitOwner.setVisible(true);
   
        }
        else if(e.getSource() == submitOwner)
        {
        	String name,gender;
        	int age;
        	
        	JOptionPane.showMessageDialog(null,"Please enter required specification of the vehicle");
        	name = jtfName.getText();
        	age = Integer.parseInt(jtfAge.getText());
        	gender = cmbGender.getSelectedItem().toString();
        	Person owner = new Person(name,age,gender);
        	String onr = owner.toString();
        	jlOwnerName.setText(onr);
        	namePanel.setVisible(true);
        	carPanel.setVisible(true);
        	calcTax.setVisible(true);
        }
        else if(e.getSource() == calcTax)
        {
        	String brand,model,fuel;
        	String name,gender;
        	int age; 
        	int day, month;
        	String county, year;
        	int engSize,co2;
        	double value;
        	//owner = getOwner();
        	//regNo = getRegNo(); 
        	
        	brand = cmbBrand.getSelectedItem().toString();
        	model = jtfModel.getText();
        	fuel = cmbFuel.getSelectedItem().toString();
        	engSize = Integer.parseInt(jtfEngSize.getText());
        	co2 = Integer.parseInt(jtfCo2.getText());
        	value = Double.parseDouble(jtfValue.getText());
        	//=============================================================
        	county = cmbCounties.getSelectedItem().toString();
        	day = Integer.parseInt(cmbDays.getSelectedItem().toString());
        	month = Integer.parseInt(cmbMonth.getSelectedItem().toString());  
        	year = cmbYear.getSelectedItem().toString();
        	//=============================================================
        	name = jtfName.getText();
        	age = Integer.parseInt(jtfAge.getText());
        	gender = cmbGender.getSelectedItem().toString();
        	
        	Car carObject = new Car(day,month,year,county,brand,model,engSize,fuel,co2,value,name,age,gender);
        	String result = carObject.toString();
        	resultsList.add(carObject);
        	clearUi.setVisible(true);
        	
        	
        	JOptionPane.showMessageDialog(null,result + "\n\n" + carObject.motorTaxRate());	
        	
        }
        else if(e.getSource() == clearUi)
        {	
        	reset();
        }

    }
    private void createFileMenu(){
         //  menu
      	fileMenu = new JMenu("File");
      	// menu items
      	JMenuItem item;
      	item = new JMenuItem("Save");
      	item.addActionListener(this);
      	fileMenu.add(item);
      	item = new JMenuItem("Load");
      	item.addActionListener(this);
      	fileMenu.add(item);
      	fileMenu.addSeparator();
      	item = new JMenuItem("Exit");
      	item.addActionListener(this);
      	fileMenu.add(item);
      }
    private void createCarMenu(){
         // menu
      	carMenu = new JMenu("Car");
      	// menu items
      	JMenuItem item;
      	item = new JMenuItem("Add Car");
      	item.addActionListener(this);
      	carMenu.add(item);
      	carMenu.addSeparator();
      	item = new JMenuItem("Display Results");
      	item.addActionListener(this);
      	carMenu.add(item);
      }
     private void reset()
     {
        clearUi.setVisible(false);
        ownerPanel.setVisible(false);
        submitOwner.setVisible(false);
        namePanel.setVisible(false);
        carPanel.setVisible(false);
        calcTax.setVisible(false);
        regPanel.setVisible(false);
        datePanel.setVisible(false);
      	submitDate.setVisible(false);
      	jtfName.setText("");
      	jtfAge.setText("");
      	jtfModel.setText("");
      	jtfEngSize.setText("");
      	jtfCo2.setText("");
      	jtfValue.setText("");
      	cmbDays.setSelectedIndex(0);
      	cmbMonth.setSelectedIndex(0);
      	cmbYear.setSelectedIndex(0);
      	cmbCounties.setSelectedIndex(0);
      	cmbBrand.setSelectedIndex(0);
      	cmbFuel.setSelectedIndex(0);
      	cmbGender.setSelectedIndex(0);
      	
      }

}