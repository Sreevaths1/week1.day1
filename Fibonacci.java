package week1.day1;

public class Fibonacci {
	public static void main(String args[])  
	{    
	 int n1=0,n2=1,sum,i,finalvalue=9;    
	 System.out.print(n1+" "+n2);  
	    
	 for(i=2;i<finalvalue;++i)    
	 {    
	  sum=n1+n2;    
	  System.out.print(" "+sum);    
	  n1=n2;    
	  n2=sum;    
	 }    
	  
	}
}

