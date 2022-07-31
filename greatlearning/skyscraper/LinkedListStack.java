package com.greatlearning.skyscraper;

import java.util.*;

public class LinkedListStack {
	 private Node headNode; // the first node

     private int stackSize;

     // nest class to define LinkedList node

     private class Node {

             int value;
             Node next;
     }
     public LinkedListStack() {

             headNode = null;
             stackSize = 0;
     }

     // Add value to the beginning of the list for demonstrating behaviour of stack

     public void push(int value) {
         
           Node oldHead = headNode;
     
           headNode = new Node();

           headNode.value = value;

           headNode.next = oldHead;
        
           stackSize++;
     }

     public int peek() throws Exception {
     
           if (headNode == null) throw new EmptyStackException();

           else return headNode.value;
     }

     public boolean size() {
     
           return stackSize == 0;
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedListStack mystack = new LinkedListStack(Day1,Day2,Day3);

         Day1 = mystack.push(3); //a
         
         Day1 = mystack.push(8);

         Day2 = mystack.push(0); //b

         Day3 = mystack.push(9); //c

         System.out.println("floors at the Day1 is :" + mystack.peek());//a

         System.out.println("floors at the Day2 is :" + mystack.peek());//b

         System.out.println("floors at the Day3 is :" + mystack.peek());//c
         
         System.out.print("The sequencial matter in order of size of the floors of stack is :" + mystack.size());

	}

}
