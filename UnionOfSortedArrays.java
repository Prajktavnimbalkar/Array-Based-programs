package Arraybasedprogram;

import java.util.ArrayList;

public class UnionOfSortedArrays {

	public static void main(String[] args) {
		int array1[] = {1, 2, 3, 4, 5, 6};
		int array2[] = {2, 4, 6, 8, 10};
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int i=0,j=0;
		while(i < array1.length && j < array2.length){
			if(array1[i] < array2[j]){
				list.add(array1[i]);
				i++;
			}else if(array1[i] > array2[j]){
				list.add(array1[j]);
				j++;
			}else{
				list.add(array1[i]);
				i++;
				j++;
			}
		}
		while(i<array1.length){
			list.add(array1[i]);
			i++;
		}
		while(j<array2.length){
			list.add(array2[j]);
			j++;
		}			
		Integer unionArray[] = list.toArray(new Integer[list.size()]);
		
		System.out.println("Given Array 1 is : ");
		for(int v : array1)
			System.out.print(v+" ");
		
		System.out.println("\nGiven Array 2 is : ");
		for(int v : array2)
			System.out.print(v+" ");
		
		System.out.println("\nUnion Of Two Arrays is :");
		for(int v : unionArray)
			System.out.print(v+" ");
	}
}

