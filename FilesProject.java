//Student Name: Seth Naquin
//LSU ID: 897271259
//Lab Section: 1
//Assignment 1
//Submission Time
package filesproject;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Random;
import java.io.File;
/**
 *
 * @author snaqu14
 */
public class FilesProject {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws FileNotFoundException{ // this method prompts for imput from user
        
        System.out.println("Please enter the numbers of files");
        
        Scanner in = new Scanner(System.in);
        
        int numFiles = in.nextInt();
            
            System.out.println("Please enter the file size");
        
        int filesize = in.nextInt();
        
            populatefiles(numFiles,filesize);
        
            calculateStat(numFiles,filesize);
        
    }
   public static void populatefiles(int n, int s)throws FileNotFoundException{//this method populates the files
       
       for(int i = 0; i<n; i++){
           
           PrintWriter outfile = new PrintWriter("number_"+i+".txt");
           
           Random rand = new Random();     
          
           for(int j=0; j<s; j++){
               
               outfile.println(rand.nextInt(9)+1);
               
               
           
    }
outfile.close();
    }    
  }
public static void calculateStat (int n, int s) throws FileNotFoundException{//this method calculates the files
    
    PrintWriter outfile = new PrintWriter ("stats.txt"); 
    
    for(int i=0; i<n; i++){
    
        File inputFile = new File("number_"+i+".txt");
       
        Scanner in = new Scanner (inputFile);
       
        int sum = 0;
       
        while (in.hasNextInt()){
            
            sum+= in.nextInt(); 
        } 
        
        float average = sum/s;
       
      
        outfile.printf("%s\t%d\t%.3f%n","number1_"+i+".txt",sum,average);
        }  
    
    outfile.close();
}
}

