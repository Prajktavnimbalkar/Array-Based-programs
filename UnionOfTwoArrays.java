package Arraybasedprogram;

public class UnionOfTwoArrays {
	
	public static void main(String[] args) {
		int array1[] = {17, 23, 31, 14, 25, 26};
		int array2[] = {23, 44, 14, 8, 17};
		
		int unionArrayMaxLen = array1.length + array2.length;
		int unionArray[] = new int[unionArrayMaxLen];
	
		int k = 0;
		
		for(int i=0;i<array1.length;i++,k++)
			unionArray[k] = array1[i];
	
		for(int i=0;i<array2.length;i++){
			int j = 0;
			for(j=0;j<k;j++)
				if(unionArray[j] == array2[i])
					break;
			if(j == k)
				unionArray[k++] = array2[i];
		}
		
		System.out.println("Given Array 1 is : ");
		for(int i=0;i<array1.length;i++)
			System.out.print(array1[i]+" ");
		
		System.out.println("\nGiven Array 2 is : ");
		for(int i=0;i<array2.length;i++)
			System.out.print(array2[i]+" ");
		
		System.out.println("\nUnion of Two Array is : ");
		for(int i=0;i<k;i++)
			System.out.print(unionArray[i]+" ");
	}
}
