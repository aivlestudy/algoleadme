/*
int   -2^31 ~ 2^31-1
long  -2^63 ~ 2^63-1
30! 대비해서 long 사용 필요
*/

class Solution {
    public int solution(int balls, int share) {
        /*
        long num= 1;
        long den = 1;

        for (int i=0;i<share;i++){
            num*=balls-i;
            den*=share-i;
        }
        return (int)(num/den);
        */

        long answer=1;

        for (int i=1;i<=share;i++){
            answer=answer*(balls-i+1)/i;
        }
        return (int)answer;
    }
}