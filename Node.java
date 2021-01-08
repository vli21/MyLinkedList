public class Node{
 private String data;
 private Node next,prev;

 public Node(String value){
   data=value;
   next=null;
   prev=null;
 }

 public String getData(){
   return data;
 }

 public Node Next(){
   return next;
 }

 public Node Prev(){
   return prev;
 }

 //write get/set methods for all three instance variables.
}
