package Arraybasedprogram;
import java.util.Arrays;

public class SecondMinimum {
	public static void main(String[] args) {
		int array[] = {10,32,34,54,19,29,38,45};
	
		int min = array[0];
		
		int secondMin = array[1];
		
		if(min > secondMin){
			min = array[1];
			secondMin = array[0];
		}
		for(int i=2;i<array.length;i++){
			if(array[i] < min){
				
				secondMin = min;
				min = array[i];
			}else if(array[i] < secondMin){
				
				secondMin = array[i];
			}
		}
		System.out.println("Given array is : "+Arrays.toString(array));
		System.out.println("Minimum value in the array is : "+min);
		System.out.println("Second minimum value in the array is : "+secondMin);
	}
}

