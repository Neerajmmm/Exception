import java.util.Scanner;

public class searchArray {

	public static void main(String[] args) {
		int a[] =new int[5];int n; int count = 0;
		Scanner r =new Scanner(System.in);
		System.out.println("Enter the array Element");
		for(int i =0;i<a.length;i++) {
			a[i]=r.nextInt();
			System.out.println(a[i]+"");
		}
		System.out.println("Enter the Search Element");
			n=r.nextInt();
			for(int i =0;i<a.length;i++) {
				System.out.println("search the Element");
				{
					
					if(a[i]==n) 
				{
						count++;
				}
				}
				if(count>0)
					System.out.println("Element Found");
				else
					System.out.println(" Element not Found");
				}
				
			}
		
		
	

	}


