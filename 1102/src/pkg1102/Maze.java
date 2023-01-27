package pkg1102;

public class Maze {
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
            return solveMaze(startX, startY);
        }
    
        private boolean solveMaze(int x, int y) {
            if (x == endX && y == endY) {
                return true;
            }
    
            if (isValidMove(x, y)) {
                visited[x][y] = true;
    
                // check north
                if (solveMaze(x - 1, y)) {
                    return true;
                }
                // check east
                if (solveMaze(x, y + 1)) {
                    return true;
                }
                // check south
                if (solveMaze(x + 1, y)) {
                    return true;
                }
                // check west
                if (solveMaze(x, y - 1)) {
                    return true;
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

