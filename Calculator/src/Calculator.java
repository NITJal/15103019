import java.util.Scanner;
interface calcu{
	public int Sum(int a,int b);
	public int Multiply(int a,int b);
	public int Divide(int a,int b);
	public int Max(int a,int b);
	public int subtract(int a,int b);
	public int Min(int a,int b);
}
 class Calculator implements calcu {
	 public int Sum(int a,int b)
	{
		return a+b;
	}
	public int Multiply(int a,int b)
	{
		return a*b;
	}
	public int Divide(int a,int b)
	{
		return a/b;
	}
	public int Max(int a,int b)
	{
		if(a>=b)
			return a;
		else
			return b;
	}
	public int subtract(int a,int b)
	{
		return a-b;
	}
	public int Min(int a,int b)
	{
		if(a<=b)
			return a;
			else
				return b;
	}
	
 
	public static void main(String[] args) {
		System.out.println("This is SSN GURJAR'S Calculator");
     Calculator ob=new Calculator();
     Scanner sc= new Scanner(System.in);
     while(true){
     System.out.printf("Press :\n 1: addition\n2: Substraction\n3:Multiplication\n4:Divison\n");
     System.out.printf("5:Minimum\n6: Maximum\n7: sin\n8: cos\n");
     int choice=sc.nextInt();
      switch(choice)
     {
     case 1:
    	 int a=sc.nextInt();
    	 int b=sc.nextInt();
    	 int sums=ob.Sum(a, b);
    	 System.out.printf("The sum is:-%d\n",sums);
    	 break;
     case 2:
          a=sc.nextInt();
    	  b=sc.nextInt();
    	  sums=ob.subtract(a, b);
    	 System.out.printf("The substraction is:-%d\n",sums);
    	 break;
     case 3:
    	  a=sc.nextInt();
    	  b=sc.nextInt();
    	  sums=ob.Multiply(a, b);
    	 System.out.printf("The Multiplication  is:-%d\n",sums);
    	 break;
     case 4:
    	  a=sc.nextInt();
    	  b=sc.nextInt();
    	  sums=ob.Divide(a, b);
    	 System.out.printf("The Division is:-%d\n",sums);
    	 break;
     case 5:
    	 a=sc.nextInt();
    	  b=sc.nextInt();
    	  sums=ob.Min(a, b);
    	 System.out.printf("The Minimum  is:-%d\n",sums);
    	 break;
     case 6:
    	 a=sc.nextInt();
    	  b=sc.nextInt();
    	  sums=ob.Max(a, b);
    	 System.out.printf("The Maximum is is:-%d\n",sums);
    	 break;
     case 7:
    	 double c=sc.nextDouble();
    	double sumss=java.lang.Math.sin(c);
    	 System.out.printf("The sin is:-%f\n",sumss);
    	 break;
     case 8:
    	  c=sc.nextDouble();
      	 sumss=java.lang.Math.cos(c);
    	 System.out.printf("The cos is:-%f\n",sumss); 
    	 break;
     }
     }
    
	}
}
