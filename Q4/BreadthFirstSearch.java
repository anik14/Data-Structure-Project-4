/*
File: BreadthFirstSearch.java
Author: Mohammad Islam
Date: 11/10/16
HW: 4 Question 4
Description: BreadthFirstSearch class
Worked with ZJ Zhang, TJ Cui and Myat oo
*/

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch<E> {
       
      
      public String breadthFirstTraverse(BinaryTree<E> root) {
      
      Queue <BinaryTree<E>> abs = new LinkedList<BinaryTree<E>>();
      
      int current = 1;
      int first = 0;
      int next = 0;
      
      if (root.getData() == null) 
      {
         return null;
      }
      abs.add(root);
      
      StringBuilder bow = new StringBuilder();

      while (!abs.isEmpty()) 
      {
         BinaryTree<E> bTree = abs.remove();
         current--;
         
         for (int i = 0; i <= first; i++) {
            bow.append("  ");    
         }
         
         if (bTree != null) {
        
            bow.append(bTree.getData().toString() + "\n");
            
              if (bTree.getLeftSubtree() != null) {
               abs.add(bTree.getLeftSubtree());
               next++;
            }
            if (bTree.getRightSubtree() != null) {
               abs.add(bTree.getRightSubtree());                    
               next++;
            } 
         }
         if (current == 0) {
            first++;
            current = next;
            next = 0;
         }
      }
      
      return bow.toString();
   }
   
      public static void main(String[] args) {
      
      System.out.println("Integer Test:");

      BinarySearchTree<Integer> bsTree = new BinarySearchTree<Integer>();
      bsTree.add(20); 
      for (Integer i = 1; i < 20; i++) {
         bsTree.add((int)(Math.random()*40 + 1));
      }
      BreadthFirstSearch<Integer> bfTree = new BreadthFirstSearch<Integer>();
      System.out.println(bfTree.breadthFirstTraverse(bsTree));

      
      BinaryTree<String> aLev = new BinaryTree<String>("leftLeft", null, null);
      BinaryTree<String> bLev = new BinaryTree<String>("LeftRight", null, null);
      BinaryTree<String> cLev = new BinaryTree<String>("RightLeft", null, null);
      BinaryTree<String> dLev = new BinaryTree<String>("RightRight", null, null);

      BinaryTree<String> eLev = new BinaryTree<String>("Left", aLev, bLev);
      BinaryTree<String> fLev = new BinaryTree<String>("Right", cLev, dLev);

      BinaryTree<String> tres = new BinaryTree<String>("root", eLev, fLev);
      
      BreadthFirstSearch<String> trev = new BreadthFirstSearch<String>();
      System.out.println("String Test:\n" + trev.breadthFirstTraverse(tres));
     
    	
   	    	
    String[] stringArray = {"I", "J", "K", "L", "M", "N", "O", "P"};
      
      System.out.println("Stark Test:");
      BinarySearchTree<String> numbTree = new BinarySearchTree<String>();
      for (String numb : stringArray) {
         numbTree.add(numb);
      }
      System.out.println(trev.breadthFirstTraverse(numbTree));

            
      
   
      
        }
}
