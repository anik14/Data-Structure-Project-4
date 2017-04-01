/*
File: MainDriver.java
Author: Mohammad Islam
Date: 11/10/16
HW: 4 Question 3
Description: ClassTree class
Worked with ZJ Zhang, TJ Cui and Myat oo
*/

import java.util.*;
public class MainDriver{

 public static BinaryTree<String> readBinaryTree (Scanner scan){
   
      String data = scan.next();
      if (data.equals("null")){
         return null;
      } 
      else {
         BinaryTree<String> leftT = readBinaryTree(scan);
         BinaryTree<String> rightT = readBinaryTree (scan);
         return new BinaryTree (data, leftT, rightT);
      }
   }   

public static void main(String args[]){
   
      Scanner t = new Scanner(System.in);
      System.out.println("Insert the elements of tree");
      classTree cls = new classTree(readBinaryTree(t));
      System.out.println(cls.evalExp(cls.tree));
      System.out.println();
   }
}