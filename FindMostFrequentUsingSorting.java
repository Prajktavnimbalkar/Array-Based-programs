package Arraybasedprogram;

import java.util.Arrays;

public class FindMostFrequentUsingSorting {
	public static void main(String[] args) {
//		int arr[] = {3, 9, 1, 3, 6, 3, 8, 1, 6};
//		int arr[] = {1, 9, 1, 3, 2, 3, 10};
		int arr[] = {2, 1, 2, 2, 1, 3};
		int N = arr.length;
		int output = 0;
		int output_counter = 0;
		
		Arrays.sort(arr);
		
		for(int i=0;i<N;i++){
			int local_counter = 1;
			while( i+1 < N && arr[i+1] == arr[i]){
				local_counter++;
				i++;
			}
			if(output_counter < local_counter){
				output = arr[i];
				output_counter = local_counter;
			}
		}
		System.out.println("Most Frequent element is :: "+output);
		System.out.println("Frequency of the element is :: "+output_counter);
	}
}
