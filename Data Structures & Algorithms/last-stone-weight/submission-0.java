class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxHeap =
            new PriorityQueue<>(Collections.reverseOrder());

        // Add all stones
        for (int stone : stones) {
            maxHeap.offer(stone);
        }

        // Keep smashing the two heaviest stones
        while (maxHeap.size() > 1) {

            int x = maxHeap.poll();
            int y = maxHeap.poll();

            if (x != y) {
                maxHeap.offer(x - y);
            }
        }

        // If heap is empty, return 0
        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}