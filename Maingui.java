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

@SuppressWarnings("unchecked")
public class Maingui extends JFrame implements ActionListener{
    
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu,carMenu;
    JButton submitbtn;
    JComboBox cmbCounties, cmbYear, cmbMonth, cmbDays;
    String [] listCounties = {"","Kerry","Dublin","Cork","Clare","Galway","Donegal","Mayo","Waterford"};
    String [] listDays = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    String [] listMonth = {"01","02","03","04","05","06","07","08","09","10","11","12"};
    int [] years = new int[57];
    String [] listYears = new String[57];
    int j = 56;
    JPanel panel;
    

    public static void main (String [] args) {
		Maingui mainFrame = new Maingui();
        mainFrame.setVisible(true);
    }

    public Maingui () {
    	
        super("Motor Tax Calculator");
        setSize (500, 500);
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
        
		panel = new JPanel(new FlowLayout());
       	
                
        cmbDays = new JComboBox(listDays);
        JLabel jlDays = new JLabel("Day");
       	panel.add(jlDays);
       	panel.add(cmbDays);
       	cmbDays.setSelectedIndex(0);
       	cmbDays.addActionListener(this);
       	
       	cmbMonth = new JComboBox(listMonth);
       	JLabel jlMonth = new JLabel("Month");
       	panel.add(jlMonth);
       	panel.add(cmbMonth);
       	cmbDays.setSelectedIndex(0);
       	cmbDays.addActionListener(this);
        
        cmbYear = new JComboBox(listYears);
       	JLabel jlYear = new JLabel("Year");
       	panel.add(jlYear);
       	panel.add(cmbYear);
       	cmbYear.setSelectedIndex(0);
       	cmbYear.addActionListener(this);
        
        cmbCounties = new JComboBox(listCounties);
        JLabel jlCounty = new JLabel("County");
        panel.add(jlCounty);
        panel.add(cmbCounties);
       	cmbCounties.setSelectedIndex(0);
       	cmbCounties.addActionListener(this);
       	
   		add(panel);
        panel.setBackground(Color.orange);
        //==========================================================
        
        
        submitbtn = new JButton("Submit Details");
        submitbtn.addActionListener(this);
        add(submitbtn);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submitbtn)
        {
        	int day, month;
        	String county, year;
        	
        	county = cmbCounties.getSelectedItem().toString();
        	day = Integer.parseInt(cmbDays.getSelectedItem().toString());
        	month = Integer.parseInt(cmbMonth.getSelectedItem().toString());  
        	year = cmbYear.getSelectedItem().toString(); 
        	RegNo regNum = new RegNo(day,month,year,county);
        	JOptionPane.showMessageDialog(null,regNum.toString());
        	
           
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

}