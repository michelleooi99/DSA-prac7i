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
public class Node<T> {
    T data;
    Node left;
    Node right;
    
    public Node(T data) {
        this.data = data;
    }
}
