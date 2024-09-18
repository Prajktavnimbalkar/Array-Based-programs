package Arraybasedprogram;

import java.util.Arrays;
import java.util.HashSet;

public class UnionArrayUsingHashSet {

	public static void main(String[] args) {
		Integer array1[] = {17, 23, 31, 14, 25, 26};
		Integer array2[] = {23, 44, 14, 8, 17};
		
		HashSet<Integer> set = new HashSet<>();
		//add all the elements of array1
		set.addAll(Arrays.asList(array1));
		//add all the elements of array2
		//duplicate elements will not be added
		set.addAll(Arrays.asList(array2));
		
		//convert HashSet to array[]
		Integer unionArray[] = set.toArray(new Integer[set.size()]);
		
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
