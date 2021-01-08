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
   else{
     end.setNext(NewNode);
     NewNode.setPrev(end);
     end.setNext(null);
     size++;
   }
   return true;
 }
 public void add(int index, String value){
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
