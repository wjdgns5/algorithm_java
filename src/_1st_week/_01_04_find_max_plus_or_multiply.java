package _1st_week;

public class _01_04_find_max_plus_or_multiply {
	
	public static int find_max_plus_or_multiply(int[] number) {
		
		int max_number = number[0];
		
		for(int i=1; i<number.length; i++) {
			
			if (max_number <= 1 || number[i] <= 1) {
				max_number += number[i];
			} else {
				max_number *= number[i];
			}
			
		}
	
		return max_number;
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정답 = 728 현재 풀이 값 = "
		        + find_max_plus_or_multiply(new int[]{0, 3, 5, 6, 1, 2, 4}));

		System.out.println("정답 = 8820 현재 풀이 값 = "
		        + find_max_plus_or_multiply(new int[]{3, 2, 1, 5, 9, 7, 4}));

		System.out.println("정답 = 270 현재 풀이 값 = "
		        + find_max_plus_or_multiply(new int[]{1, 1, 1, 3, 3, 2, 5}));
		
	}

}
