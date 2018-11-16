package array;
import java.util.Arrays;


public class Lotto2 {

	public static void main(String[] args) {
		
		
		int[] balls = new int[45];
		for (int i = 0; i < balls.length; i++) {
			balls[i] = i+1;
		}
		
		for (int i = 0; i < 6; i++) {
			
			int idx = (int)(Math.random()*(balls.length-i));	// balls.length=45. 랜덤에 의해 0~44까지 생성. > 뽑는 건, 0~44까지 -> 0~43까지 -> 0~42까지 -> ~~
			int value = balls[idx];
			
			balls[idx] = balls[balls.length-1 -i];				// balls[idx]에서 뽑은 건 balls의 마지막, 즉 balls[44], balls[43] 등으로
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
