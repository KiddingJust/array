// �迭�� ũ�� ���̱�
// �ζ� ������ Ȱ�� ���� (�� 45�� > �� 44�� > �� 43�� ... )

package array;

import java.util.Arrays;

public class EX04 {

	public static void main(String[] args) {
		
		int[] a1 = {1, 2, 3, 4, 5};
		
		int[] temp = new int [4];
		
		System.arraycopy(a1, 0, temp, 0, 4);
		System.out.println(Arrays.toString(temp));
		
		a1 = temp;
		
		System.out.println(Arrays.toString(a1));
		
		
	}
}
