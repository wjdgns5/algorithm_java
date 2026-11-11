package _1st_week;

public class _01_02_find_max_occurred_alphabet {
	
	public static char find_max_occurred_alphabet(String alpha) {
		
		int[] character_array = new int[26];
		int max_index = 0;
		int max_count = 0;
		
		 for (int i = 0; i < alpha.length(); i++) {
			 
			 char compare_char = alpha.charAt(i);
			 
			 if (!Character.isLetter(compare_char)) {
	                continue;
	            }
			 
			 int index = compare_char - 'a';
			 character_array[index]++; 
		 }
		 
		 // STEP 2. 가장 많이 등장한 알파벳 찾기
	        for (int i = 0; i < character_array.length; i++) {

	            if (character_array[i] > max_count) {

	                max_index = i;
	                max_count = character_array[i];
	            }
	        }
	        
	    return (char) (max_index + 'a');
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("정답 = i / 현재 풀이 값 = "
	                + find_max_occurred_alphabet("hello my name is dingcodingco"));

	        System.out.println("정답 = e / 현재 풀이 값 = "
	                + find_max_occurred_alphabet("we love algorithm"));

	        System.out.println("정답 = b / 현재 풀이 값 = "
	                + find_max_occurred_alphabet("best of best youtube"));
	}

}
