//package array;
//
//public class Swap {
//
//		public static void main(String[] args) {
//			
//			int num1 = 10;
//			int num2 = 5;
//			
//			int temp = num1;				//load - copy - store //swap 위해 빈 변수 활용
//			
//			num1 = num2;
//			num2 = temp;
//			
//			System.out.println(num1);
//			System.out.println(num2);
//			
//		}//main end
//}//main Swap

package array;

import java.util.Arrays;

public class Swap {

//	public static void Swap(int num1, int num2) {
//		
//		int temp = num1;			
//		num1 = num2;
//		num2 = temp;
//		return;
//		
//	}
	public static void main(String[] args) {

		int[] arr = { 52, 48, 22, 36, 16 };

		for (int j = 0; j < 4; j++) {

			for (int i = 0; i < arr.length-(j+1) ; i++) {

				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}

			} // for end
			System.out.println(Arrays.toString(arr));

		}

	}

}
