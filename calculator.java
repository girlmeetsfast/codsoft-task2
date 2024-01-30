package gradecalculator;
import java.util.Scanner;
public class calculator {

	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("enter the total number of subjects");
	
	        int totalsub = scanner.nextInt();
	        String[]subname=new String[totalsub];
	        System.out.println("the total number of subjects are  "+totalsub);
	        int[] marks = new int[totalsub];
	        for (int o = 0; o < totalsub; o++) {
	        	System.out.print("Enter the name of the subject " + (o + 1) + ": ");
	            subname[o] = scanner.next();
	            System.out.print("Enter the marks of the Subject " + (o+1) + ": ");
	            marks[o] = scanner.nextInt();
	        }
	        
	        
	        for (int o = 0; o < totalsub; o++) {
	        	System.out.println("subject:  "+subname[o]);
	           
	            System.out.println("the marks obtained in the subject are:  "+marks[o]);
	          
	        }
	         
	        
int totalmarks=0;
	for(int t=0;t<totalsub;t++) {
		totalmarks += marks[t];
		
	}
	        
	System.out.println("the total marks are:  "+totalmarks);      
	        
	 double avgper=(double)totalmarks/totalsub;      
	   System.out.println("the averagepercentage of the student is"+avgper);   
	  
	   
	   
	   char grade;
       
        if (avgper >= 80) {
           grade = 'A';
       } else if (avgper >= 70) {grade = 'B';
       } else if (avgper >= 60) {grade = 'C';
          }else if(avgper >= 50){ grade='D';
       } else {
           grade = 'F';
       }    
	   
	   
	   
       System.out.println("Result:");
       System.out.println("Total Marks obtained: " + totalmarks);
       System.out.println("Average Percentage: " + avgper + "%");
       System.out.println("Grade: " + grade);

       scanner.close();
  
	   
	   
	   
	   
	   
	   
	   
	   
	        
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	
};
