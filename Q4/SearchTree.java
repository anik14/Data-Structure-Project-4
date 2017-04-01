/*
File: SearchTree.java
Author: Mohammad Islam
Date: 11/10/16
HW: 4 Question 4
Description: SearchTree class
Worked with ZJ Zhang, TJ Cui and Myat oo
*/

public interface SearchTree<E>{
   boolean add(E obj);
     boolean contains(E obj); 
   E find(E obj) ;
      E delete(E obj) ;
   boolean remove(E obj);
}

