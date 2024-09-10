package Arraybasedprogram;

public class IntersectionOfTwoArrays {
	public static void main(String[] args) {
		int array1[] = {44, 49, 30, 25, 67, 69};
		int array2[] = {88, 44, 69, 93, 30};
		
		System.out.println("Given array 1 is : ");
		for(int v : array1)
			System.out.print(v+" ");
		
		System.out.println("\nGiven array 2 is : ");
		for(int v : array2)
			System.out.print(v+" ");
		
		int intersectionLength = array1.length;
		if(array2.length < array1.length)
			intersectionLength = array2.length;
		
		int intersectionArray[] = new int[intersectionLength];
		int k = 0;
		for(int a : array1){
			for(int b : array2){
				if(a == b){
					intersectionArray[k++] = a; 
					break;
				}
			}
		}
		System.out.println("\nIntersection of the array 1 & 2 is :");
		for(int i=0;i<k;i++)
			System.out.print(intersectionArray[i]+" ");
		
	}
}
