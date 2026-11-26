class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = 0;
        int rows = park.length;
        int cols = park[0].length;
        int[][] count = new int[rows][cols];
        int max = 0;

        //DP 동적 계획법 (모서리에 가장 큰 수 저장)
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                //park에 -1이 아닌값은 dp에 0으로 주고 continue
                //i==0이거나 j==0인 구간은 기본적으로 1로 주고 continue

                //아니면 왼쪽,대각선,아래 확인했을 때 0이 없으면 그중 가장 작은값+1이 자기 값
                //그리고 그 값이 max보다 크면 업데이트
            }
        }

        //mats에서 max에 가장 가까운 숫자가 정답


        return answer;
    }
}
