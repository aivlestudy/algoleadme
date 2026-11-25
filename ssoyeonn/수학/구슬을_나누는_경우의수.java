class Solution {
    public int solution(int balls, int share) {
        long answer = 1;

        for (int i=0;i<share; i++) {
            answer = answer * (balls-i) / (i+1);
        }

        return (int) answer;
    }
}


// nCr = n(n-1)...(n-r+1) / r(r-1)...1