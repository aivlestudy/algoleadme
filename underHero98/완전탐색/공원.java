import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        Integer[] mats2 = new Integer[mats.length];
        int answer = -1;
        for (int i = 0; i < mats.length; i++) {
            mats2[i] = mats[i];
        }
        Arrays.sort(mats2, Collections.reverseOrder());

        outer:
        for (int mat : mats2) {    // mats
            for (int x = 0; x < park.length; x++) {   // x
                for (int y = 0; y < park[0].length; y++) {   // y
                    if ((x + mat <= park.length) && (y + mat <= park[0].length)) {   // ArrayIndexOutofBounds Exception
                        int index = 0;
                        for (int i = 0; i < mat; i++) {
                            for (int j = 0; j < mat; j++) {
                                if (park[i + x][j + y].equals("-1")) {
                                    index++;
                                }
                            }
                        }
                        if (index == (mat * mat)) {
                            answer = mat;
                            break outer;
                        }
                    }
                }
            }
        }
        return answer;
    }
}
