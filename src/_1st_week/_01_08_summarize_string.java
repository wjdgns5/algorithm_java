package _1st_week;

public class _01_08_summarize_string {

    public static String summarize_string(String input_str) {

        // 알파벳 a ~ z의 등장 횟수를 저장하는 배열
        int[] char_array = new int[26];

        // 최종 결과를 저장하는 문자열
        String result = "";

        // STEP 1. 각 알파벳의 등장 횟수 계산
        for (char i : input_str.toCharArray()) {

            // 문자를 배열 인덱스로 변환
            int index = i - 'a';

            // 해당 알파벳의 등장 횟수 증가
            char_array[index]++;
        }

        // STEP 2. 알파벳과 등장 횟수를 문자열로 합치기
        for (int i = 0; i < char_array.length; i++) {

            // 한 번 이상 등장한 알파벳만 처리
            if (char_array[i] > 0) {

                // 배열 인덱스를 문자로 변환
                char alphabet = (char) (i + 'a');

                // 알파벳 + 등장 횟수 연결
                result += alphabet + String.valueOf(char_array[i]);
            }
        }

        // STEP 3. 최종 문자열 반환
        return result;
    }

    public static void main(String[] args) {

        String input_str = "acccdeee";

        System.out.println(summarize_string(input_str));
    }
}
