package outlab3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author PETER MITZEL
 */
public class LinkedList {
    private Node number, last, first;
    private Node head, tail;
    
    /**
     * Construction of header and trailer setting the boundaries of the linked list
     */
    public LinkedList(){
        head = new Node("0", "", "");
        tail = new Node("0", "", "");
        head.setPrev(null);
        tail.setNext(null);
        head.setNext(tail);
        tail.setPrev(head);
        
    }
    
    /**
     * Method to add a new node to the list in order
     * @param newNode
     */
    public void addNode(Node newNode){
        Node iterator = head.getNext();
        newNode.setPrev(head);
        newNode.setNext(tail);
        while(Integer.parseInt(newNode.getNumber()) > Integer.parseInt(iterator.getNumber()) && iterator != tail){
                iterator = iterator.getNext();
        }
        if(Integer.parseInt(newNode.getNumber()) == Integer.parseInt(iterator.getNumber())){
            int compare = newNode.getLast().compareTo(iterator.getLast());
            if(compare < 0){
                newNode.setPrev(iterator.getPrev());
                newNode.setNext(iterator);
                iterator.getPrev().setNext(newNode);
                iterator.setPrev(newNode);
            }else{
                while(compare > 0 && Integer.parseInt(newNode.getNumber()) == Integer.parseInt(iterator.getNumber()) && iterator != tail){
                    iterator = iterator.getNext();
                    compare = newNode.getLast().compareTo(iterator.getLast());
                }
                newNode.setPrev(iterator.getPrev());
                newNode.setNext(iterator);
                iterator.getPrev().setNext(newNode);
                iterator.setPrev(newNode);
            }
        }else{
            newNode.setPrev(iterator.getPrev());
            newNode.setNext(iterator);
            iterator.getPrev().setNext(newNode);
            iterator.setPrev(newNode);
        }
        
    }
    
    /**
     * Method for printing the list in order
     */
    public void caseThree(){
        Node iter = head.getNext();
        while(iter != tail){
            System.out.println(iter.getNumber() + " " + iter.getLast() + " " + iter.getFirst());
            iter = iter.getNext();
        }
    }
    
    /**
     * Method for printing the list backwards in order
     */
    public void caseFour(){
        Node iter = tail.getPrev();
        while(iter != head){
            System.out.println(iter.getNumber() + " " + iter.getLast() + " " + iter.getFirst());
            iter = iter.getPrev();
        }
    }
    
    /**
     * Method to remove a single node from the list
     * @param node
     * @return
     */
    public boolean caseFive(Node node){
        Node iterator = head.getNext();
        while(iterator.getNext() != null){
            if(iterator.getNumber().equals(node.getNumber()) && iterator.getLast().equals(node.getLast()) && iterator.getFirst().equals(node.getFirst())){
                iterator.getPrev().setNext(iterator.getNext());
                iterator.getNext().setPrev(iterator.getPrev());
                return true;
            }else{
                iterator = iterator.getNext();
            }
    }
        return false;
    }
    
    /**
     * Method to clear the entire list
     */
    public void caseSix(){
        head.setPrev(null);
        tail.setNext(null);
        head.setNext(tail);
        tail.setPrev(head);
    }
    
}
