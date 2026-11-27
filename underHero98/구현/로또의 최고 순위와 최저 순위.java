class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        boolean[] lot = new boolean[46];
        boolean[] win = new boolean[46];

        for (int num : lottos) {
            lot[num] = true;
        }
        for (int num : win_nums) {
            win[num] = true;
        }
        int index = 0;
        int cntZero = 0;

        for (int i : lottos) {
            if (i == 0) cntZero++;
        }
        for (int j = 0; j < 46; j++) {
            if ((lot[j] == true) && (win[j] == true)) {
                index++;
            }
        }
        answer[0] = func(cntZero + index);
        answer[1] = func(index);
        return answer;
    }

    static int func(int num) {
        if (num == 6) {
            return 1;
        } else if (num == 5) {
            return 2;
        } else if (num == 4) {
            return 3;
        } else if (num == 3) {
            return 4;
        } else if (num == 2) {
            return 5;
        } else {
            return 6;
        }

    }
}
