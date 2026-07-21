public class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        int n = wall.size();
        int m = 0;
        for (int brick : wall.get(0)) {
            m += brick;
        }

        List<List<Integer>> gaps = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            gaps.add(new ArrayList<>());
            int gap = 0;
            for (int brick : wall.get(i)) {
                gap += brick;
                gaps.get(i).add(gap);
            }
        }

        int res = n;
        for (int line = 1; line < m; line++) {
            int cuts = 0;
            for (int i = 0; i < n; i++) {
                if (!gaps.get(i).contains(line)) {
                    cuts++;
                }
            }
            res = Math.min(res, cuts);
        }

        return res;
    }
}
