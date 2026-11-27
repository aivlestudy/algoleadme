import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Deque<Integer> stack = new ArrayDeque<>();
        int answer = 0;

        for (int mov : moves) {
            // 뽑기,
            for (int i = 0; i < board.length; i++) {
                // 인형 있
                if (board[i][mov - 1] != 0) {
                    stack.push(board[i][mov - 1]);
                    board[i][mov - 1] = 0;
                    break; // 바구니로 옮기고 탈출
                }
            }
            // 바구니에 2개 이상 쌓이고, 연속 숫자 같으면 터트리기
            if (stack.size() >= 2) {
                int last = stack.pop(); // stack에서 뒤에 2개 꺼내고 제거
                int last1 = stack.pop();
                if (last != last1) {    // 꺼낸거 2개 다르면 다시넣기
                    stack.push(last1);
                    stack.push(last);
                } else {
                    answer++;   // 같으면 answer++
                }
            }
        }
        return answer*2;
    }
}
