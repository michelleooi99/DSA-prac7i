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
public interface BinaryTreeADT<T> {
    public Node getRoot();
    public void setTree(T data);
    public void setTree(T data, BinaryTreeADT leftTree, BinaryTreeADT rightTree);
    public String preorderTraversal();
    public String postorderTraversal();
    public String inorderTraversal();
}
