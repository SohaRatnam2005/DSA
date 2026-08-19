class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Deque<Integer> stack = new ArrayDeque<>();

        for (int asteroid : asteroids) {

            boolean destroyed = false;

            // Collision can happen only when:
            // stack top is moving right (+)
            // current asteroid is moving left (-)
            while (!stack.isEmpty() && stack.peek() > 0 && asteroid < 0) {

                int top = stack.peek();

                if (Math.abs(top) < Math.abs(asteroid)) {
                    // Top asteroid is smaller -> destroy it
                    stack.pop();
                }
                else if (Math.abs(top) == Math.abs(asteroid)) {
                    // Both are destroyed
                    stack.pop();
                    destroyed = true;
                    break;
                }
                else {
                    // Current asteroid is smaller -> destroy current
                    destroyed = true;
                    break;
                }
            }

            // Current asteroid survived all collisions
            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        // Convert stack to array
        int[] result = new int[stack.size()];

        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}