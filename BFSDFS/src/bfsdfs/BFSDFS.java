/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfsdfs;
import java.util.*;

/**
 *
 * @author User
 */
public class BFSDFS {

    /**
     * @param args the command line arguments
     */
// BFS
        public void bfs(Node root) {
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                Node node = queue.poll();
                System.out.print(node.val + " ");
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        // DFS
        public void dfs(Node root) {
            Stack<Node> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                Node node = stack.pop();
                System.out.print(node.val + " ");
                if (node.right != null) {
                    stack.push(node.right);
                }
                if (node.left != null) {
                    stack.push(node.left);
                }
            }
        }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
