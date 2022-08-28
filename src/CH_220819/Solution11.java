package CH_220819;
// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution11 {
    public int solution11(int[] scores, int cutline) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= cutline) {
                answer += 1;
            }
        }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution11 sol = new Solution11();
        int[] scores = {80, 90, 55, 60, 59};
        int cutline = 60;
        int ret = sol.solution11(scores, cutline);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}