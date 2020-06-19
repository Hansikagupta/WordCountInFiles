package firstGUIProject;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUI {


	
	  public static void main(String args[]){
	       JFrame frame = new JFrame("My First GUI");
			JPanel panel1 = new JPanel();

	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       frame.setSize(300,300);
	       
	        int wordCount = 0; 
	        String word;
			word = JOptionPane.showInputDialog("Word");


	       
	       JButton button1 = new JButton("Choose File 1");
	       JButton button2 = new JButton("Choose File 2");
	       
	       frame.getContentPane().add(button1); // Adds Button to content pane of frame
	       frame.getContentPane().add(button2); // Adds Button to content pane of frame
	       frame.setVisible(true);
	    }

}
