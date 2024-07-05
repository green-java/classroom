import java.util.*;
public static void main(String args[])
{
	int c;
	System.out.println("Enter the input ");
	c=input.nextInt();
	int n=2;
	while(n*n>c)
	{
		if(n%2==0){
			System.out.println("not prime");
		break;
		}
		n+1;
	}
	System.out.println("prime");
}


