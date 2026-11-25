import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        Map<String, Integer> map = new HashMap<>();
        map.put("code",0);
        map.put("date",1);
        map.put("maximum",2);
        map.put("remain",3);
        
        ArrayList<int[]> list = new ArrayList<>();

        for(int i = 0; i < data.length; i++) {
            if (val_ext > data[i][map.get(ext)]) {
                list.add(data[i]);
            }
        }
        answer = list.toArray(new int[0][]);
        Arrays.sort(answer, (a,b) -> Integer.compare(a[map.get(sort_by)],b[map.get(sort_by)]));
        return answer;
    }
}
