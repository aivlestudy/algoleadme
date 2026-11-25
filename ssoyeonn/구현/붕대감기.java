class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int heal = bandage[1];    // 초당 회복량
        int extra_heal = bandage[2];   // 추가 회복량
        int hp = health;

        for (int i=0; i < attacks.length; i++) {
            int time = attacks[i][0];   // 지금 공격 시간
            hp -= attacks[i][1];

            if (hp <= 0) return -1;

            if (i==attacks.length-1) break;  // 마지막 공격 후엔 break

            // 회복
            time += 1;
            int next_attack = attacks[i+1][0];   // 다음 공격 시간
            int duration = 0;

            while (time < next_attack) {
                duration += 1;

                if (hp >= health) {
                    hp = health;
                    break;
                }
                hp += heal;

                if (duration == bandage[0]) {
                    hp += extra_heal;
                    duration = 0;
                }

                hp = hp > health ? health : hp;

                time += 1;
            }
        }

        return hp;
    }
}