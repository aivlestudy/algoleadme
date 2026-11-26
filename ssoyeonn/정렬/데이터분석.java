import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        ArrayList<int[]> arr_list = new ArrayList<>(0);
        int where;
        int order;

        if (ext.equals("code")) where = 0;
        else if (ext.equals("date")) where = 1;
        else if (ext.equals("maximum")) where = 2;
        else where = 3;

        if (sort_by.equals("code")) order = 0;
        else if (sort_by.equals("date")) order = 1;
        else if (sort_by.equals("maximum")) order = 2;
        else order = 3;

        for (int[] d: data) {
            if (d[where] < val_ext) {
                arr_list.add(d);
            }
        }

        int[][] answer = arr_list.toArray(new int[0][]);

        Arrays.sort(answer, (a,b) -> a[order]-b[order]);

        return answer;
    }
}