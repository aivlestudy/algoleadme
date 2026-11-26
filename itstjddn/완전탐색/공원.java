import java.util.*;

class Solution {
public int solution(int[] mats, String[][] park) {
    int result = -1;


    // 돗자리 길이를 각각 뽑기
    for(int m = 0; m < mats.length; m++){
        int len = mats[m];

        // 공원 크기 가져오기 (돗자리 크기 빼기)
        for(int i = 0; i <= park.length - len; i++){
            for(int j = 0; j <= park[i].length - len; j++){
                boolean ok = true;

                // 돗자리 사이즈가 공원에 들어가는지 비교
                for(int a = i; a < i + len; a++){
                    for(int b = j; b < j + len; b++){
                        // boolean 활용 부족 (도움받음) -> 한칸만 비교하여 결과도출 로직을 구현했지만 , boolean을 활용하여 true면 돗자리 사이즈 출력 false면 -1 출력
                        if(!park[a][b].equals("-1")){
                            ok = false;
                            break;
                        }
                    }
                }
                // result = len; 까지만 생각했음, Math.max 활용하여 공원에 들어갈수있는 가장 큰 돗사리 크기 넣기 (도움받음)
                if(ok){
                    result = Math.max(result, len);
                }
            }
        }
    }

    return result;
    }
}