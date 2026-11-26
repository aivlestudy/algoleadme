import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        boolean picnic=true;   // 돗자리 펼 수 있는지

        Arrays.sort(mats);
        int[] reverse_mats = new int[mats.length];

        for (int i=0; i<mats.length; i++) {
            reverse_mats[i] = mats[mats.length-1-i];     // 가장 큰 돗자리부터 탐색하도록 내림차순으로
        }

        for (int len: reverse_mats) {
            for (int row=0; row<park.length; row++) {
                if (row+len > park.length) break;   // 공원 밖까지 나감
                for (int col=0; col<park[0].length; col++) {  // 한 지점
                    if (col+len > park[0].length) break;   // 공원 밖까지 나감
                    picnic = true;
                    for (int i=0; i<len; i++) {
                        for(int j=0; j<len; j++) {      // 현재 지점에서 오른쪽&아래 방향으로 해당되는 모든 점 체크
                            if (!picnic) break;     // 다른 사람 돗자리 있으면 탐색 중단
                            if (!park[row+i][col+j].equals("-1")) picnic = false;
                        }
                        if (!picnic) break;   // 다른 사람 돗자리 있으면 탐색 중단
                    }
                    if (picnic) return len;
                }
            }
        }

        return -1;
    }
}