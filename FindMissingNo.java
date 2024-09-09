package Arraybasedprogram;

public class FindMissingNo {
	
	public static void main(String[] args) {

		int array[] = {2, 4, 1, 6, 3,5, 8};
		int n = array.length;

		int arraySum = 0;
		for(int v : array)
			arraySum += v;

		n = n+1;
		
		int expectedSum = (n * (n+1)) / 2;
		
		System.out.println("The Given Array is : ");
		for(int v : array)
			System.out.print(v+" ");
		
		int missingNo = expectedSum - arraySum;
		System.out.println("\nMissing Number is : "+missingNo);
	}
}
