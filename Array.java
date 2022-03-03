
public class Array {

	public static void main(String[] args) {
		int[] numbers = {2,4,-6,0,10,11,15,14,19,6};
		int sum = 0;
		double average;
		for(int number: numbers) {
			sum += number;
		}
		//get total number of elements
int arrayLenght =numbers.length;
//converted int to double
//calculate the average
average = ((double)sum/ (double)arrayLenght);
System.out.println("sum =" +sum);
System.out.println("average =" +average);
	}

}
