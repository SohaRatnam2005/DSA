class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<asteroids.length; i++) {
            if (asteroids[i] > 0) {
                stack.push(asteroids[i]);
            } else {
                boolean alive = true;
                while (!stack.isEmpty() && stack.peek() > 0) {
                    int recent = stack.peek();
                    if (Math.abs(asteroids[i]) > recent) {
                        stack.pop();
                    } else if (Math.abs(asteroids[i]) == recent) {
                        stack.pop();
                        alive = false;
                        break;
                    } else {
                        alive = false;
                        break;
                    }
                }
                if (alive) stack.push(asteroids[i]);
            }
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}