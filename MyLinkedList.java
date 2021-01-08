public class MyLinkedList{
 private int size;
 private Node start,end;
 public MyLinkedList(){
   start=null;
   end =null;
 }
 public int size(){
   return size;
 }
 public boolean add(String value){
   Node NewNode= new Node(value);
   if (start== null){
     start = end = NewNode;
     size++;
   }
   return true;
 }
 public boolean add(int index, String value){
   return true;
 }
 public String get(int index){
   return "";
 }
 public String set(int index, String value){
   return "";
 }
 public String toString(){
   return "";
 }
 //Any helper method that returns a Node object MUST BE PRIVATE!
}
