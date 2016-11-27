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

public class Maingui extends JFrame implements ActionListener{
    
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu,carMenu;
    private JTextField jtfDay,jtfMonth,jtfYear,jtfCounty;
    private JLabel jlDay,jlMonth,jlfYear,jlfCounty;

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
        setLayout(new GridBagLayout()); 
        
        createFileMenu();
        createCarMenu();
        
        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        menuBar.add(carMenu);
        //==========================================================
       
        jtfDay = new JTextField("Day",3);
        add(jtfDay);
        jtfMonth = new JTextField("Month",3);
        add(jtfMonth);
        jtfYear = new JTextField("Year",4);
        add(jtfYear);
        jtfCounty = new JTextField("County",10);
        add(jtfCounty);
        
        //==========================================================
       
    }

    public void actionPerformed(ActionEvent event) {
        //  code 

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