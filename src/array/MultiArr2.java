package array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArr2 {

	public static void main(String[] args) {
		
		int[][] arr = new int[123][];
		
		int value = 1;
		
		for(int i = 0; i < arr.length; i++) {
			int[] temp = new int[i+1];
			
			for(int j=0; j< temp.length; j++) {
				temp[j] = value++;
			}//end for
			arr[i] = temp;
		}//end for
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���.: ");
		int oper = scan.nextInt();
		
		int userFloor = 0;
		int usernum = 0;
		for(int i=0; i< arr.length; i++) {
			
			if(oper > arr[i][0]) {
				continue;} 
			else {
			userFloor = i;
			usernum = oper + 1 - arr[i-1][0];
			break;
			}
		}	
		System.out.println(userFloor + "�� �Դϴ�.\nȣ���� " + usernum + "ȣ �Դϴ�.");	
			

		for (int[] tempArr : arr) {
			
			System.out.println(Arrays.toString(tempArr));
		}//end for
		
	}
}
