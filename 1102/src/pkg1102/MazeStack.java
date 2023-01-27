package pkg1102;

import java.util.Stack;

class Maze {
    private int[][] maze;
    private boolean[][] visited;
    private int startX, startY;
    private int endX, endY;

    public Maze(int[][] maze, int startX, int startY, int endX, int endY) {
        this.maze = maze;
        this.visited = new boolean[maze.length][maze[0].length];
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public boolean solveMaze() {
        Stack<Coordinate> stack = new Stack<Coordinate>();
        stack.push(new Coordinate(startX, startY));
        visited[startX][startY] = true;

        while (!stack.isEmpty()) {
            Coordinate current = stack.pop();
            int x = current.getX();
            int y = current.getY();

            if (x == endX && y == endY) {
                return true;
            }

            // check north
            if (isValidMove(x - 1, y)) {
                stack.push(new Coordinate(x - 1, y));
                visited[x - 1][y] = true;
            }
            // check east
            if (isValidMove(x, y + 1)) {
                stack.push(new Coordinate(x, y + 1));
                visited[x][y + 1] = true;
            }
            // check south
            if (isValidMove(x + 1, y)) {
                stack.push(new Coordinate(x + 1, y));
                visited[x + 1][y] = true;
            }
            // check west
            if (isValidMove(x, y - 1)) {
                stack.push(new Coordinate(x, y - 1));
                visited[x][y - 1] = true;
            }
        }

        return false;
    }

    private boolean isValidMove(int x, int y) {
        if (x < 0 || y < 0 || x >= maze.length || y >= maze[0].length) {
            return false;
        }
        if (visited[x][y] || maze[x][y] == 1) {
            return false;
        }
        return true;
    }
}

class Coordinate {
    private int x, y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
