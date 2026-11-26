class Solution {
    static boolean search(park, mats, int i, int j){

        전달 받은 park[i,j]위치와, mats 범위를 기준으로 반복문 돌려서 탐색(단 범위를 넘을 때 제한을 둬야함)
                -1이 아닌 값이 있으면 return false
                전체가 -1이면 return true
    }

    public int solution(int[] mats, String[][] park) {
        int answer = 0;

        mats 값 지정 반복문
            park 배열 전체도는 반복문
                search함수로 가능한지 확인
                if true이고 현재 answer<mats[]이면 answer 변경



        return answer;
    }
}
