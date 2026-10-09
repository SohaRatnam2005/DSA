
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(
                distance(points[a]), distance(points[b])
            )
        );

        int[][] res = new int[k][2];

        for (int i = 0; i < points.length; i++) {
            pq.offer(i);
        }

        for (int i = 0; i < k; i++) {
            res[i] = points[pq.poll()];
        }

        return res;
    }

    double distance(int[] point) {
        int x = point[0];
        int y = point[1];
        return (double) x * x + (double) y * y;
    }
}
