/*
File: LinkedListRec.java
Author: Mohammad Islam
Date: 11/10/16
HW: 4 Question 1
Description: implemented recursive methods such as size, empty,
insertBefore, insertAfter, addAtHead, addAtEnd, remove, replace, peekFront,
peekEnd, removeFront, removeEnd, toString
Worked with ZJ Zhang, TJ Cui and Myat oo
*/


public class LinkedListRec<E> {
   private Node<E> head;
   private Node<E> tail;
    private int size = 0;
   
private static class Node < E > {
   
    private E data;

       private Node next;

        private Node(E dataItem) {
      data = dataItem;
      next = null;
    }

        private Node(E dataItem, Node < E > nodeRef) {
      data = dataItem;
      next = nodeRef;
    }
  }   
   private int size(Node<E> head) {
      if(head == null)
         return 0;
      else
         return 1+size(head.next);
      }
      
      public int size() {
       return size(head);
       }
       
       private String toString(Node<E> head) {
         if(head == null)
            return "";
         else 
            return head.data + "\n" + toString(head.next);
        }
        
        public String toString() {
         return toString(head);
         }
         
         private void replace(Node<E> head, E oldObj, E newObj) {
            if(head != null) 
               {
                  if(oldObj.equals(head.data))
                     head.data = newObj;
                     replace(head.next, oldObj, newObj);
                }
             }
             
          public void replace (E oldObj, E newObj){
            replace (head, oldObj, newObj);
           }
           
         private void add(Node<E> head, E data) {
            if(head.next == null)
               head.next = new Node<E>(data);
            else
               add(head.next, data);
            }
            
            public void add(E data) {
               if(head == null)
                  head = new Node<E>(data);
               else
                  add(head, data);
               }
               
             private boolean remove(Node<E> head, Node<E> pred, E outData) {
               
                  if(head == null)
                     return false;
                  else if(head.data.equals(outData)) {
                     pred.next = head.next;
                     return true;
                    } else
                    return remove(head.next, head, outData);
                   }
                 
               public boolean remove(E outData) 
               {
                 if( head == null)
                  return false;
                   else if(head.data.equals(outData)){
                     head = head.next;
                     return true;
                     }
                     else
                     return remove(head.next, head, outData);
                  }
                  
      public void addAtHead(Object data)
	{
		Node temp = head;
		head = new Node(data);
		head.next = temp;
		size++;
    
	}
                 
      public void addAtEnd(Object data)
	{
		Node temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		
		temp.next = new Node(data);
		size++;
	} 
   

                  
 
  
   public void insertAfter( Node<E> node, E target, E inData)
    {
      if(head == null)
      {
         head = new Node<E>(target, null);
         return;
      }
      if(head.data.equals(target)){
         head.next = new Node<E>( inData, head.next);
         return;
        }
        insertAfter(head.next, target, inData);
       }
       
     public void insertAfter(E target, E inData)
     {
      insertAfter(head, target, inData);
     }
       
      




   private E removeFirst() {
      Node<E> temp = head;
      if (head != null) {
         head = head.next;
      }
      if (temp != null) {
         size--;
         return temp.data;
      } 
      else {
         return null;
      }
   }


   public E peekEnd()
   {
      return peekEnd(head);
   }
   private E peekEnd(Node<E> head)
   {
      if(head.next!=null)
      return peekEnd(head.next);
      return head.data;
   }
    
   public E peekFront()
   {
      if(head!=null)
      return head.data;
      return null;
   }
      
      
   
    public void insertBefore(E target, E inData)
    {
      if(head == null)
      {
         head = new Node<E>(target, null);
         return;
      }
      if(head.data.equals(target)){
         head = new Node<E>(inData, head);
         return;
        }
        insertBefore(target, inData, head);
       }
       
       private void insertBefore(E target, E inData, Node<E> node) {
         if(node.next == null) {
            node.next = new Node<E>(inData, node.next);
            return;
            }
            if(target.equals(node.next.data)){
               node.next = new Node<E>(inData, node.next);
               return;
            }
            insertBefore(target, inData, node.next);
           }
          


                  
     public static void main (String [] arguments) 
     {
    LinkedListRec<String> ab = new LinkedListRec<String>();
   
    ab.add("foo");
   
    ab.add("bar");
   
    ab.add("baz");

    ab.add("hello");
   
    ab.add("world");
    
    ab.remove ("foo");     
   
    ab.remove ("hello");   

    ab.addAtHead("sdoiu"); 
      
    System.out.println (ab);
    ab.removeFirst();
    ab.insertBefore("bar", "Megh");
    ab.insertAfter("Megh", "Tom");
    ab.addAtEnd("8");
    ab.peekFront();
    ab.peekEnd();
    System.out.println (ab);
    
  }

                  
                  
         }
           
           
        