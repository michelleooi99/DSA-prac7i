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
        
        //normal way
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
        
        System.out.println("Build tree : ");
        System.out.print("1. Pre-order Traversal : ");
        System.out.println(myTree.preorderTraversal());
        System.out.print("2. Post-order Traversal : ");
        System.out.println(myTree.postorderTraversal());
        System.out.print("3. In-order Traversal : ");
        System.out.println(myTree.inorderTraversal() + "\n");
        
        //using array
        BinaryTreeADT<Integer> newTree = new BinaryTree();
        int[] a = { 5, 3, 7, 2, 4, 6, 8 };
        
        for (int i = 0; i < a.length; i++) {
            newTree.add(a[i]);
        }
        
        System.out.println("Build tree (array) : ");
        System.out.print("1. Pre-order Traversal : ");
        System.out.println(newTree.preorderTraversal());
        System.out.print("2. Post-order Traversal : ");
        System.out.println(newTree.postorderTraversal());
        System.out.print("3. In-order Traversal : ");
        System.out.println(newTree.inorderTraversal() + "\n");
        
        
        //search
        System.out.println("Search results : ");
        System.out.println(newTree.search(0));
        System.out.println(newTree.search(2));

    }
}
