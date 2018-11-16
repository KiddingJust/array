package array;
import java.util.Arrays;


public class Lotto2 {

	public static void main(String[] args) {
		
		
		int[] balls = new int[45];
		for (int i = 0; i < balls.length; i++) {
			balls[i] = i+1;
		}
		
		for (int i = 0; i < 6; i++) {
			
			int idx = (int)(Math.random()*(balls.length-i));	// balls.length=45. ������ ���� 0~44���� ����. > �̴� ��, 0~44���� -> 0~43���� -> 0~42���� -> ~~
			int value = balls[idx];
			
			balls[idx] = balls[balls.length-1 -i];				// balls[idx]���� ���� �� balls�� ������, �� balls[44], balls[43] ������
			balls[balls.length-1 -i] = value;
			
//			System.out.println(Arrays.toString(balls));
		}//for end
		
		int[] num = new int[6];
		
		for (int i = 0; i < 6; i++) {
		num[i] = balls[balls.length-1-i];
		}

		System.out.println(Arrays.toString(num));
		
	}
}
