package assignment1;
//java program to find palindrome of string
import java.util.Scanner;
public class Palindrome {
	public static void checkPalindrome(String s)
	  {
	    // reverse the given String
	    String reverse = new StringBuffer(s).reverse().toString();
	 
	    if (s.equals(reverse))
	      System.out.println("Yes");
	 
	    else
	      System.out.println("No");
	  }
	 
	  public static void main (String[] args)
	               throws java.lang.Exception
	  {
		  Scanner sc =new Scanner(System.in);
		  String s=new String();
		  s=sc.nextLine();
	    checkPalindrome(s);
	    
	  }
	}


