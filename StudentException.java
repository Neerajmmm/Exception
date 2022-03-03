import java.util.Scanner;
public class StudentException {
	
	public static void main(String[] args) throws CantAllow
	{	
		int Marks;
		System.out.println("Enter your marks");
		Scanner s=new Scanner(System.in);
		Marks=s.nextInt();
		
		if (Marks<70)
		{
			throw new CantAllow("you are not eligible for exam ........");
		}
		else
		{
			System.out.println("you are eligible for exam.......");
		}
	}
}

class CantAllow extends Exception
{
	CantAllow (String msg)
	{
		super(msg);
	}
}