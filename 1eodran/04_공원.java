class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        int rows = park.length;
        int cols = park[0].length;
        int[][] cnt = new int[rows][cols];
        int max = 0;

        // 모서리에 가장 큰 수 저장
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                //park에 -1이 아닌값은 cnt에 0으로 주고 continue
                if(!park[i][j].equals("-1")){cnt[i][j]=0; continue;}

                //i==0이거나 j==0인 구간은 기본적으로 cnt 1로 주고 continue
                if(i==0||j==0){cnt[i][j]=1; continue;}

                //아니면 왼쪽,대각선,아래 확인했을 때 그중 가장 작은값+1이 자기 값
                //그리고 그 값이 max보다 크면 업데이트
                int tmp = Math.min(cnt[i-1][j-1],Math.min(cnt[i-1][j],cnt[i][j-1]))+1;
                cnt[i][j] = tmp;
                if(tmp>max) max = tmp;
            }
        }

        //mats에서 max에 가장 가까운 숫자가 정답
        int max_mat = -1;
        for(int i=0; i<mats.length; i++){
            if(max==0) break;
            else if(mats[i]>max_mat && max>=mats[i]) max_mat = mats[i];
        }
        answer = max_mat;
        return answer;
    }
}
