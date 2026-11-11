package _1st_week;

public class _01_07_find_count_to_turn_out_to_all_zero_or_all_one {
	
	public static int find_count_to_turn_out_to_all_zero_or_all_one(String str) {
		
		int zero_group = 0; // 0 일때
		int one_group = 0; // 1 일때
		
		if(str.charAt(0) == '0') {
			zero_group++;
		} else if(str.charAt(0) == '1') {
            one_group++;
        }
		
		   // STEP 2. 인덱스 1부터 마지막까지 반복
        for (int i = 1; i < str.length(); i++) {

            // 현재 문자와 이전 문자가 다른지 확인
            if (str.charAt(i) != str.charAt(i - 1)) {

                // 현재 문자가 0이라면
                if (str.charAt(i) == '0') {
                    zero_group++;
                } else {
                    one_group++;
                }
            }
        }

        // STEP 3. 두 그룹 중 작은 값 반환
        return Math.min(zero_group, one_group);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "011110111101111";

	        int result = find_count_to_turn_out_to_all_zero_or_all_one(input);

	        System.out.println(result);

	}

}
