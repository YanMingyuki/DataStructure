/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbtree;


/**
 *
 * @author User
 */
public class RBtree {

    private Node root;

    /**
     * @param args the command line arguments
     */
    public void insert(int key) {
        Node newNode = new Node(key);
        Node current = root;
        Node parent = null;

        while (current != null) {
            parent = current;
            if (key < current.key) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        if (parent == null) {
            root = newNode;
        } else {
            if (key < parent.key) {
                parent.left = newNode;
            } else {
                parent.right = newNode;
            }

        }
    }

    
}
