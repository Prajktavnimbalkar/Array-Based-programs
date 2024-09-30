package Arraybasedprogram;

import java.util.Arrays;
public class ArrayRotation {
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6};
		int d = 6;
		int n = arr.length;
		
		if(d > n)
			d = d-n;
		int new_arr[] = new int[n];
		int new_index = 0;
		for(int i=(n-d);i<n;i++,new_index++)
			new_arr[new_index] = arr[i];
		for(int i=0;i<(n-d);i++,new_index++)
			new_arr[new_index] = arr[i];
		
		System.out.println("Original Array ");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Array after rotation");
		System.out.println(Arrays.toString(new_arr));
	}
}
