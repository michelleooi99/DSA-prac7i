/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical7;

/**
 *
 * @author Tarc
 */
public class BinaryTree<T> implements BinaryTreeADT<T> {
    
    Node root;
    
    public Node getRoot() {
        return root;
    }
    
    public void setTree(T data) {
        root = new Node(data);
    }
    
    public void setTree(T data, BinaryTreeADT leftTree, BinaryTreeADT rightTree) {
        root = new Node(data);
        
        if(leftTree != null) {
            root.left = leftTree.getRoot();
        }
        
        if(rightTree != null) {
            root.right = rightTree.getRoot();
        }
    }
    
    public String preorderTraversal() {
        return preorder(root);
    }
    
    private String preorder(Node root) {
        String str = "";
        
        if (root != null) {
            str += root.data + " ";
            str += preorder(root.left);
            str += preorder(root.right);
        }
        
        return str;
    }
    
    public String postorderTraversal() {
        return postorder(root);
    }
    
    private String postorder(Node root) {
        String str = "";
        
        if (root != null) {
            str += postorder(root.left);
            str += postorder(root.right);
            str += root.data + " ";
        }
        
        return str;
    }
    
    public String inorderTraversal() {
        return inorder(root);
    }
    
    private String inorder(Node root) {
        String str = "";
        
        if (root != null) {
            str += inorder(root.left);
            str += root.data + " ";
            str += inorder(root.right);
        }
        
        return str;
    }
} 
