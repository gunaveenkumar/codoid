package codoidCoding;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
	int GivenNumber = input.nextInt();
	int Given=GivenNumber;
	String Number=String.valueOf(Given);
	int Length=Number.length();
	int n=0;
	int m=0;
	int sum=0;
	if(Length==3)
	{
	for(int i=0;i<3;i++)
	{
		
		n= GivenNumber/10;
		m= GivenNumber%10;
		GivenNumber=n;
		sum=sum+(m*m*m);
		
	}
	}
	else if(Length==4)
	{
	for(int i=0;i<4;i++)
	{
		
		n= GivenNumber/10;
		m= GivenNumber%10;
		GivenNumber=n;
		sum=sum+(m*m*m*m);
		
	}
	}

	if(Given==sum)
	{
		System.out.println("the given number is Armstrong ");
	}
	else
	{
		System.out.println("the given number not  is Armstrong ");
	}
	System.out.println(sum);
	
	}

}
