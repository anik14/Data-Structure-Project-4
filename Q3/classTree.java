/*
File: classTree.java
Author: Mohammad Islam
Date: 11/10/16
HW: 4 Question 3
Description: ClassTree class
Worked with ZJ Zhang, TJ Cui and Myat oo
*/

import java.util.*;
public class classTree {

   BinaryTree<String> tree;
   private static final String OPERATORS = "+-*/";
   int output=0;

   public classTree(BinaryTree<String> tree)
   {
      this.tree= tree;
   }
   
   public int evalExp(BinaryTree<String> cls)
   {
   
    if(numberTree(cls.data.charAt(0)))
      {
         output = Integer.parseInt(cls.data);
      }
      else
      {
         int numLeft = evalExp(cls.leftT);
         int numRight = evalExp(cls.rightT);
        
         switch(cls.data.charAt(0))
         {
            case '+':
            output=numLeft+numRight;
               break;
               
            case '-':
            output=numLeft-numRight;
               break;
               
            case '*':
            output=numLeft*numRight;
               break;
            case '/':
            output=numLeft/numRight;
               break;
         }           
      }
      return output;
   }
   
   
   public static boolean numberTree(char res)
   {
    
      return res=='9'||res=='8'||res=='7'||res=='6'||res=='5'||res=='4'||res=='3'||res=='2'||res=='1'||res=='0';
   }
   
   

   
   
  
}