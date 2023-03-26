package codoidCoding;

import java.util.Scanner;

public class pattern {
	public  void starpattern()
	{
		Scanner input =new Scanner(System.in);
		int GivenNumber=input.nextInt();
		for(int i=1;i<=GivenNumber;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(" * ");
			
		}
			System.out.println();
	}
	}

	public static void main(String[] args) {

    pattern obj =new pattern();
    obj.starpattern();
}

}


