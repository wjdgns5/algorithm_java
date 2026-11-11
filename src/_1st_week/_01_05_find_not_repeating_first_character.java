package _1st_week;

public class _01_05_find_not_repeating_first_character {
	
	public static char find_not_repeating_first_character(String str) {
		
		int[] char_list = new int[26];
		
		for (char i : str.toCharArray()) {
			int value = i - 'a';
			char_list[value] += 1;
		}
		
		for(char i : str.toCharArray()) {
			
			 int value = i - 'a';
			 
			// 등장 횟수가 1이면 즉시 반환
	        if (char_list[value] == 1) {
	        	return i;
	         }
		}
		
		return '_';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("정답 = d 현재 풀이 값 = "
	                + find_not_repeating_first_character("abadabac"));

	        System.out.println("정답 = c 현재 풀이 값 = "
	                + find_not_repeating_first_character("aabbcddd"));

	        System.out.println("정답 = _ 현재 풀이 값 = "
	                + find_not_repeating_first_character("aaaaaaaa"));
	    }

	}


