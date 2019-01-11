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
public class Practical7 {
    
    public static void main(String[] args) {
        
        BinaryTreeADT<Integer> t1 = new BinaryTree();
        BinaryTreeADT<Integer> t2 = new BinaryTree();
        BinaryTreeADT<Integer> t3 = new BinaryTree();
        BinaryTreeADT<Integer> t4 = new BinaryTree();
        BinaryTreeADT<Integer> leftTree = new BinaryTree();
        BinaryTreeADT<Integer> rightTree = new BinaryTree();
        BinaryTreeADT<Integer> myTree = new BinaryTree();
        
        t1.setTree(2);
        t2.setTree(4);
        t3.setTree(6);
        t4.setTree(8);
        
        leftTree.setTree(3, t1, t2);
        rightTree.setTree(7, t3, t4);
        
        myTree.setTree(5, leftTree, rightTree);
        
        System.out.println("Pre-order Traversal : ");
        System.out.println(myTree.preorderTraversal() + "\n");
        
        System.out.println("Post-order Traversal : ");
        System.out.println(myTree.postorderTraversal() + "\n");
        
        System.out.println("In-order Traversal : ");
        System.out.println(myTree.inorderTraversal());
    }
}
