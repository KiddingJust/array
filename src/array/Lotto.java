package array;

import java.util.Arrays;

public class Lotto {
	
	public static boolean checkArray(int[] arr, int target ) {
		
		boolean result = false;							
		
//		for (int i = 0, len = arr.length; i < len; i++) {
//			if(arr[i] == target) {
//				result = true;
//			}
//		}
//		
		for (int i : arr) {											// 근데 여기서 for 돌릴거면, 아래서 이중 for문 쓰면 되지 않나? 그 방법으로도 체크
			if (i == target) {
				result = true;
				break;												// 앞에서 같은 값이면 멈추면 되니 break;
			}
		}
		
		return result;												// boolean 오류 안 나게 하기 위해 boolean 하나 잡고 return

		
	}

	public static void main(String[] args) {
		
	
		int[] result = new int[6];
		
		for(int i = 0, len = result.length; i < len; i++) {
			
			int value = (int)(Math.random()*45) + 1;					// 성능 면에서는 바깥쪽에 두는 게 낫지만, 안정성을 생각하면 루프문 안쪽에 변수 선언하는 편이 낫다
			
			System.out.println(value);
			
			//중복 체크 필요 
//			LottoEx.checkArray(arr, target) // 원래는 이건데 CheckArray랑 main이 같은 동네이므로 LotteEx 생략 가능
			boolean duplicated = checkArray(result, value);
			
			if(duplicated) {					//duplicated 자체가 boolean임.
				i--;							//i가 증가했으므로 빼주어야 함.
				continue;
			}
			result[i] = value;		
		} // for 끝
		System.out.println(Arrays.toString(result));
	}
}
