import java.util.Random;
import java.util.Scanner;
   public class Randomsearch { 
	   
	public static void main(String[] args) {
		  int [] A=new int[10]; 
		  int num;
		  int flag=0;
		  A[0]=15;
		  Random r=new Random();
		  for(int i=1;i<10;i++)
		  A[i]=r.nextInt(50);
		  System.out.println("Enter the number to be searched:-");
	      Scanner sc=new Scanner(System.in);
          num=sc.nextInt();
          for(int i=0;i<10;i++)
          {
        	if(A[i]==num)
        		{System.out.printf("The number is found at index :-%d", i);
        	 flag=1;}
        	else
        		continue;
        
         }
          if(flag==0)
        	System.out.printf("The number is not found ");	
     
}
}