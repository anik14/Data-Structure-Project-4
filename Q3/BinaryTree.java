/*
File: BinaryTree.java
Author: Mohammad Islam
Date: 11/10/16
HW: 4 Question 3
Description: BinaryTree class
Worked with ZJ Zhang, TJ Cui and Myat oo
*/


public class BinaryTree <T extends Comparable<T>>
{
   T data;
   BinaryTree <T> leftT;
   BinaryTree <T> rightT;
   
   public BinaryTree(T data)
   {
      this.data= data;
      leftT= null;
      rightT=null;
   }
   public BinaryTree(T data,BinaryTree<T> left,BinaryTree<T> right)
   {
      this.data = data;
      leftT= left;
      rightT= right;
   }
   public void add(T num)
   {
       if(num.compareTo(data)>0)
      {
         if(rightT==null)
            rightT=new BinaryTree<T>(num);
         else
            rightT.add(num);
      }
      
      else if(num.compareTo(data)<0)
      {
         if(leftT==null)
            leftT =new BinaryTree<T>(num);
         else
            leftT.add(num);
      }

   }
}
