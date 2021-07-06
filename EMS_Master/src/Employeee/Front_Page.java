package Employeee;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
/*CLICK HERE TO CONTINUE in front page will perform an action that is nothing but the event. To use event we will import java package java.awt.event*/
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Front_Page implements ActionListener {
	/*JFrame objects are located in swing class. If we want to utilize the JFrame functionality we had to extend JFrame, as we have not extended we are explicitly creating below objects*/
	/*class Front_Page extends JFrame implements ActionListener*/     /*If we use this way then we don't have to create manual objects like below*/
	JFrame f;
    JLabel id, l1;
    JButton b;
    /*Frame coding will be inside the Front_Page constructor*/
    Front_Page() {

        f = new JFrame("Employee Management System"); //Frame name
        f.setBackground(Color.red);
        f.setLayout(null); /*We have no of other layout such as border, grade etc.,*/

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg")); /*Used to insert icon using ImageIcon class*/
        Image i2 = i1.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT); /*Setting icon to image size as per our requirement*/
        /*method "getScaledInstance" used to modify image size*/
        /*We can not set image directly on frame we have to use label in this case to achieve our requirement*/
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);

        l1.setBounds(0, 150, 1360, 530); /*Setting layouts  x-axis, y-axis, length of image and breadth of image */
        f.add(l1);//Adding image to frame finally

        b = new JButton("CLICK HERE TO CONTINUE"); //Argument will be displayed over the button
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);

        b.setBounds(500, 600, 300, 70);
        b.addActionListener(this);

        id = new JLabel();
        id.setBounds(0, 0, 1360, 750);
        id.setLayout(null);

        JLabel lid = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        lid.setBounds(80, 30, 1500, 100);
        lid.setFont(new Font("serif", Font.PLAIN, 70));
        lid.setForeground(Color.red);
        id.add(lid);

        id.add(b);
        f.add(id); //Adding above id on frame

        f.getContentPane().setBackground(Color.WHITE);//Setting frame color to white
        //By default frame visibility is false. We have to set it like below
        f.setVisible(true);
        f.setSize(1360, 750); //Frame size
        f.setLocation(200, 100); //Opening location of frame

        while (true) {    
            lid.setVisible(false); // lid = j label
            try {
                Thread.sleep(500); // 1000ms = 1 second .... 500ms = 0.5sec... lid label will be disable for 0.5 sec and it will show up. This will run in an infinite loop
            } catch (Exception e) {
            }
            lid.setVisible(true);//Making label visible again after half a second
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }

    }

    public void actionPerformed(ActionEvent ae) {/*using action event object ae and action is being performed when we click the button in front page using java.awt.event*/

        if (ae.getSource() == b) {//ae.getSource is getting the click input button to perform action
            f.setVisible(false); //Once click action is performed open front_page frame will be disabled and new login page will be enabled due to below object
            new login();//Constructor call for login class
        }
    }

    public static void main(String[] args) {
    	try {
    		new Front_Page();
    	}
        catch (Exception e) {
        	System.out.println(e);
        }
    }
}
