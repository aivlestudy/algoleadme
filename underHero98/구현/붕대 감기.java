class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int t = bandage[0]; // 시전 시간
        int x = bandage[1]; // 초당 회복량
        int y = bandage[2]; // 추가 회복량. t만큼 회복하면 추가회복

        int len = attacks.length;

        boolean[] arr = new boolean[attacks[len-1][0]+1];

        for (int i = 0; i < len; i++){
            arr[attacks[i][0]] = true; // true 넣기
        }

        int max_h = health;
        int index = 0;
        int atk_index = 0;

        for(int i = 1; i <= attacks[len-1][0]; i++){
            if(arr[i]){ // attack
                health -= attacks[atk_index][1];
                index=0;
                atk_index++;
                if(health <= 0){
                    answer = -1;
                    break;
                }
            } else{ // 안 attack
                if(health < max_h){ // 체력이 원래체력 이하면
                    health += x;
                    index++;
                }
                if(index==t){
                    health +=y;
                    index=0;
                }
                if(health>=max_h) health = max_h;
            }
            answer = health;
        }
        return answer;
        
    }
}
