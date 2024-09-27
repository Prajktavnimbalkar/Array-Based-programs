package Arraybasedprogram;

import java.util.Arrays;

public class FindPairForZ {
	public static void main(String[] args) {
//		int arr[]= {2,45,7,3,5,1,8,9};
//		int Z = 10;
		
        int arr[] = {1, 4, 45, 6, 10, 8};
        int Z = 16;

        Arrays.sort(arr);
		int left = 0;
		int right = arr.length-1;
				
		while(left < right){
			int sum = arr[left] + arr[right];
			if(sum == Z){
				System.out.println("Pair is "+
						arr[left]+", "+arr[right]);
				left++;
			}else if(sum > Z)
				right--;
			else
				left++;
		}
	}
}
