class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        //bandage: [시전 시간, 초당 회복량, 추가 회복량]
        // health : 체력
        // attacks:  [[공격 시간, 피해량], [,]]
        int max_health = health;
        int cnt = 0; //연속 성공
        boolean attack = false;

        //1부터 마지막 공격시간까지
        for(int i=0; i<=attacks[attacks.length-1][0]; i++){
            attack = false;
            if(health<=0) break;

            //공격
            for(int j=0; j<attacks.length; j++){
                if(i==attacks[j][0]){
                    attack = true;
                    health-=attacks[j][1];
                    cnt = 0; //연속 회복 초기화
                }
            }

            //회복 (공격을 안받고, 체력이 닳았을 때) + **max_health 넘으면 안됨
            if(attack==false && health<max_health){
                health+=bandage[1];
                cnt++;
                if(cnt==bandage[0]){ //t초 연속회복 성공 시
                    health+=bandage[2];
                    cnt = 0;
                }

                //max_health 안넘게
                if(health>max_health) health = max_health;
            }

        }

        if(health<=0) answer=-1;
        else answer = health;

        return answer;
    }
}
