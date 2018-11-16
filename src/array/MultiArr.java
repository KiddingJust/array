package array;

import java.util.Arrays;

public class MultiArr {

	public static void main(String[] args) {
		
		int[][] arr = {{10, 10}, {20, 20}, {30, 30}};
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[0][0]);

			int[] temp = arr[0];
			System.out.println(temp[0]);
		
			
			
		// 다차원배열, 왜 쓰나? 
//		int[][] arr1 = new int[5][];
//		System.out.println(Arrays.toString(arr1));
//		// 이렇게 하면 [Null, Null ...]
		
		int[][] arr1 = new int[5][];

		int [] temp1 = {1, 3, 4, 5, 6, 8};
		int [] temp2 = {1, 3, 4, 5};
		
		arr1[0] = temp1;
		arr1[1] = temp2;									//결국 행렬은 아니다.
		
		System.out.println(Arrays.toString(arr1));
			
	}
}
