class Solution {
    public long solution(int balls, int share) {
        long answer = 0;

        answer = cal(balls, share);
        return answer;
    }

    long cal(long n, long m){
        long res = 1;
        for(int i=0; i<m; i++){
            res = res*(n-i)/(i+1);
        }
        return res;
    }

}
