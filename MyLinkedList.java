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

 private Node getNode(int index){
   Node thisNode=new Node("");
   if (index<0 || index>=size){
     throw new IndexOutOfBoundsException ("Index"+index+"is out of bounds!");
   }
   if (Math.abs(size-index) > Math.abs(0-index)){

     for (int i= size-1; i>=index; i--){
       thisNode=end.getPrev();
     }
   }
   else{
     for (int i= 0; i<=index;i++){
       thisNode=start.getNext();
     }
   }
   return thisNode;
 }

 public void add(int index, String value){
   Node newNode= new Node(value);
   Node oldPrev= getNode(index).getPrev();
   oldPrev.setNext(newNode);
   getNode(index).setPrev(newNode);
 }
 public String get(int index){
   return getNode(index).getData();
 }
 public String set(int index, String value){
   return "";
 }
 public String toString(){
   return "";
 }
 //Any helper method that returns a Node object MUST BE PRIVATE!
}
