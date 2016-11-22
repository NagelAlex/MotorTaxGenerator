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
    JMenu fileMenu,carMenu,ownerMenu;

    public static void main (String [] args) {
		Maingui mainFrame = new Maingui();
        mainFrame.setVisible(true);
    }

    public Maingui () {
    	
        this.setTitle ("Motor Tax Genirator");
        this.setSize (500, 500);
        this.setDefaultCloseOperation( EXIT_ON_CLOSE );

        // get the content pane and set properties
        Container contentPane = getContentPane();
        contentPane.setBackground (Color.lightGray);
        contentPane.setLayout(null); // so that we can use absolute positioning
        
        createFileMenu();
        createCarMenu();
        createOwnerMenu();
        
        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        menuBar.add(carMenu);
        menuBar.add(ownerMenu);
        
       
    }

    public void actionPerformed(ActionEvent event) {
        //  code

    }
    private void createFileMenu(){
      	fileMenu = new JMenu("File");
      	JMenuItem item;
      	item = new JMenuItem("Save");
      	item.addActionListener(this);
      	fileMenu.add(item);
      	fileMenu.addSeparator();
      	item = new JMenuItem("Quit");
      	item.addActionListener(this);
      	fileMenu.add(item);
      }
    private void createCarMenu(){
      	carMenu = new JMenu("Car");
      	JMenuItem item;
      	item = new JMenuItem("Add Car");
      	item.addActionListener(this);
      	carMenu.add(item);
      	item = new JMenuItem("Display Cars");
      	item.addActionListener(this);
      	carMenu.add(item);
      }
    private void createOwnerMenu(){
      	ownerMenu = new JMenu("Owner");
      	JMenuItem item;
      	item = new JMenuItem("Add Owner");
      	item.addActionListener(this);
      	ownerMenu.add(item);
      	item = new JMenuItem("Display Owners");
      	item.addActionListener(this);
      	ownerMenu.add(item);
      }
}