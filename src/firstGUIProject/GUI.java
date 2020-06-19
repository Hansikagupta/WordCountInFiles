package firstGUIProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUI {


	
	  public static void main(String args[]) throws IOException{
	       JFrame frame = new JFrame("My First GUI");
			JPanel panel1 = new JPanel();

	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       frame.setSize(300,300);
	       
	        String word;
			word = JOptionPane.showInputDialog("Word");
			
			


	       
	       JButton button1 = new JButton("Choose File 1");
	       JButton button2 = new JButton("Choose File 2");
	       
	       
	       
	       File file1 = new File("C:\\path\\1.txt"); 
	        FileInputStream fileStream1 = new FileInputStream(file); 
	        InputStreamReader input1 = new InputStreamReader(fileStream); 
	        BufferedReader reader1 = new BufferedReader(input); 
	          
	        String line1; 
	          
	        // Initializing counters 
	        int wordCountF1 = 0; 
	          
	        // Reading line by line from the  
	        // file until a null is returned 
	        while((line1 = reader1.readLine()) != null) 
	        { 
	           // Search Word Instances
	        } 
	          
	        System.out.println("Total word count in file 1= " + wordCountF1); 
	        
		       File file2 = new File("C:\\path\\2.txt"); 
		        FileInputStream fileStream2 = new FileInputStream(file); 
		        InputStreamReader input2 = new InputStreamReader(fileStream); 
		        BufferedReader reader2 = new BufferedReader(input); 
		          
		        String line2; 
		          
		        // Initializing counters 
		        int wordCountF2 = 0; 
		          
		        // Reading line by line from the  
		        // file until a null is returned 
		        while((line2 = reader2.readLine()) != null) 
		        { 
		           // Search Word Instances
		        } 
		          
		        System.out.println("Total word count in file 2= " + wordCountF2); 
	       
	       frame.getContentPane().add(button1); // Adds Button to content pane of frame
	       frame.getContentPane().add(button2); // Adds Button to content pane of frame
	       frame.setVisible(true);
	    }

}
