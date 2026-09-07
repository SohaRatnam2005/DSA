/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}
*/

class Solution {
    public Node construct(int[][] grid) {
        return helper(grid, 0, 0, grid.length);
    }

    private Node helper(int[][] grid, int row, int col, int size) {

        // Check if the entire square has the same value
        boolean same = true;

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (grid[i][j] != grid[row][col]) {
                    same = false;
                    break;
                }
            }
        }

        // If all values are same, create a leaf
        if (same) {
            return new Node(grid[row][col] == 1, true);
        }

        // Divide into 4 parts
        int half = size / 2;

        Node topLeft = helper(grid, row, col, half);
        Node topRight = helper(grid, row, col + half, half);
        Node bottomLeft = helper(grid, row + half, col, half);
        Node bottomRight = helper(grid, row + half, col + half, half);

        // Current node is not a leaf
        return new Node(
            true,
            false,
            topLeft,
            topRight,
            bottomLeft,
            bottomRight
        );
    }
}