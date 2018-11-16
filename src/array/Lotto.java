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
		for (int i : arr) {											// �ٵ� ���⼭ for �����Ÿ�, �Ʒ��� ���� for�� ���� ���� �ʳ�? �� ������ε� üũ
			if (i == target) {
				result = true;
				break;												// �տ��� ���� ���̸� ���߸� �Ǵ� break;
			}
		}
		
		return result;												// boolean ���� �� ���� �ϱ� ���� boolean �ϳ� ��� return

		
	}

	public static void main(String[] args) {
		
	
		int[] result = new int[6];
		
		for(int i = 0, len = result.length; i < len; i++) {
			
			int value = (int)(Math.random()*45) + 1;					// ���� �鿡���� �ٱ��ʿ� �δ� �� ������, �������� �����ϸ� ������ ���ʿ� ���� �����ϴ� ���� ����
			
			System.out.println(value);
			
			//�ߺ� üũ �ʿ� 
//			LottoEx.checkArray(arr, target) // ������ �̰ǵ� CheckArray�� main�� ���� �����̹Ƿ� LotteEx ���� ����
			boolean duplicated = checkArray(result, value);
			
			if(duplicated) {					//duplicated ��ü�� boolean��.
				i--;							//i�� ���������Ƿ� ���־�� ��.
				continue;
			}
			result[i] = value;		
		} // for ��
		System.out.println(Arrays.toString(result));
	}
}
