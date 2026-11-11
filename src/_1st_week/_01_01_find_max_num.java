package _1st_week;

public class _01_01_find_max_num {
	
	public static int find_max_num(int[] number) {
		
		int max_number = number[0];
		
		for(int i=1; i<number.length; i++) {
			
			if (max_number < number[i]) {
				max_number = number[i];
			} 
		}
		
		return max_number;
	} // end of find_max_num
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("정답 = 6 / 현재 풀이 값 = " + find_max_num(new int[] {3, 5, 6, 1, 2, 4} ) );
		System.out.println("정답 = 6 / 현재 풀이 값 = " + find_max_num(new int[] {6, 6, 6}));
		System.out.println("정답 = 1888 / 현재 풀이 값 = " + find_max_num(new int[] {6, 9, 2, 7, 1888}));
	}

}
