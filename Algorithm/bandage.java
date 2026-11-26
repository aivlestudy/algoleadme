class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t=bandage[0];
        int x=bandage[1];
        int y=bandage[2];

        int currenthealth=health;
        int maxhealth=health;

        int successive=0;
        int attacktime=0;

        //0,1 힐 2 공격 3 4 5 6 7 8 힐 9 공격 10 공격 11 공격
        for (int i=1;i<=attacks[attacks.length-1][0];i++){
            //공격
            if (i==attacks[attacktime][0]) {
                currenthealth-=attacks[attacktime][1];
                attacktime++;
                successive=0;

                if (currenthealth<=0) {
                    return -1;
                }
            }

            //힐
            else {
                currenthealth+=x;
                successive++;

                //연속 힐
                if (successive==t) {
                    currenthealth+=y;
                    successive=0;
                }

                //풀피
                if (currenthealth>maxhealth){
                    currenthealth=maxhealth;
                }
            }
        }
        return currenthealth;
    }
}