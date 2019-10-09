/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outlab3;

/**
 *
 * @author PETER MITZEL
 */
public class Node {
    private String number;
    private String last;
    private String first;
    private Node next;
    private Node prev;
    
    /**
     * Constructor for three items in each node
     * @param number
     * @param last
     * @param first
     */
    public Node(String number, String last, String first){
        this.number = number;
        this.last = last;
        this.first = first;
    }
    
    /**
     * Getter for previous
     * @return
     */
    public Node getPrev(){
        return prev;
    }
    
    /**
     * Setter for previous
     * @param prev
     */
    public void setPrev(Node prev){
        this.prev = prev;
    }
    
    /**
     * Setter for next
     * @param next
     */
    public void setNext(Node next){
        this.next = next;
    }
    
    /**
     * Getter for next
     * @return
     */
    public Node getNext(){
        return next;
    }
    
    /**
     * Getter for ID number
     * @return
     */
    public String getNumber(){
        return number;
    }
    
    /**
     * Getter for last name
     * @return
     */
    public String getLast(){
        return last;
    }
    
    /**
     * Getter for first name
     * @return
     */
    public String getFirst(){
        return first;
    }
    
}
