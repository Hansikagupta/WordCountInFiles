package firstGUIProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JButton;
import javax.swing.JFileChooser;
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
			
			

			JFileChooser j1 = new JFileChooser();
			j1.showSaveDialog(null);
			JFileChooser j2 = new JFileChooser();
			j2.showSaveDialog(null);
			File file1 = j1.getSelectedFile();
			File file2 = j2.getSelectedFile();
	        FileInputStream fileStream1 = new FileInputStream(file1); 
	        InputStreamReader input1 = new InputStreamReader(fileStream1); 
	        BufferedReader reader1 = new BufferedReader(input1); 
	          
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
	        
		        FileInputStream fileStream2 = new FileInputStream(file2); 
		        InputStreamReader input2 = new InputStreamReader(fileStream2); 
		        BufferedReader reader2 = new BufferedReader(input2); 
		          
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
	       
	     
	       frame.setVisible(true);
	    }

}
