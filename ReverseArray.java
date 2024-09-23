package Arraybasedprogram;

public class ReverseArray {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6,7,8,9,10};
		int N = array.length;
		int temp;
		
		System.out.println("The Given Array is : ");
		for(int x : array) {
			System.out.print(x+" ");
		}
		
		// N/2 iterations
		for(int i=0;i<N/2;i++) {
			//swap ith index with N-i-1 index
			temp = array[i];
			array[i] = array[N - 1 - i];	
			array[N - 1 - i] = temp;
		}
		
		System.out.println("\nThe Reversed Array is : ");
		for(int x : array) {
			System.out.print(x+" ");
		}
	}
}
