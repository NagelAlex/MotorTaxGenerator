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

public class Maingui extends JFrame implements ActionListener{
    
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu,carMenu;

    public static void main (String [] args) {
		Maingui mainFrame = new Maingui();
        mainFrame.setVisible(true);
    }

    public Maingui () {
    	
        this.setTitle ("Motor Tax Calculator");
        this.setSize (500, 500);
        this.setDefaultCloseOperation( EXIT_ON_CLOSE );

        Container contentPane = getContentPane();
        contentPane.setBackground (Color.lightGray);
        contentPane.setLayout(null); 
        
        createFileMenu();
        createCarMenu();
        
        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        menuBar.add(carMenu);
        
       
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