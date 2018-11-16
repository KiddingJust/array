package array;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] arr = {3, 2, 214, 32, 4, 43};
		int[] arr2 = arr;
		
		System.out.println(arr);
		System.out.println(arr2);
		
		System.out.println(arr == arr2);

		arr[0] = 100;
		
		System.out.println(arr2[0]);
		
		System.out.println(arr.length);
		
		System.out.println(Arrays.toString(arr));
		
//		arr2 = null;
//		
//		System.out.println(arr2[0]);
		
		//1
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
		//2
//		for(int i = 0, len = arr.length; i < len; i++) {			// 접근 시 마다 매번 arr.length에 접근하지 않고 len이라는 변수를 잡아둠. 성능이 더 빠르다
//			System.out.println(arr[i]);
//		}
//		//3
//		for (int i : arr2) {
//			System.out.println(i);
//		//4	
//		Arrays.stream(arr).forEach(x -> System.out.println(x));
		
	
		}
		
		
	}

