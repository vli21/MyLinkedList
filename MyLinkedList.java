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
   Node newNode= new Node(value);
   if (size==0){
     start = newNode;
     end = newNode;
     start.setPrev(null);
     end.setNext(null);
     size++;
   }
   else{
     Node temp= end;
     end.setNext(newNode);
     end=newNode;
     newNode=temp;
     end.setNext(null);
     size++;
   }
   return true;
 }

 private Node getNode(int index){
   Node thisNode=new Node("");
   if (index<0 || index>size){
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
   if (size==0){
     this.add(value);
   }
   else if (index == 0){
     Node temp= start;
     start.setPrev(newNode);
     start=newNode;
     newNode=temp;
     start.setPrev(null);

   }
   else if (index == size){
     this.add(value);
   }
   {
     Node oldPrev= getNode(index).getPrev();
     oldPrev.setNext(newNode);
     getNode(index).setPrev(newNode);
   }
   size ++;
 }
 public String get(int index){
   return getNode(index).getData();
 }
 public String set(int index, String value){
   getNode(index).setData(value);
   return getNode(index).getData();
 }
 public String toString(){
   String printedList= "[";
   Node tobePrinted=start;
   for(int i=0;i<size;i++){
     if (tobePrinted==null){
       printedList+="null";
     }
     else if (i== size-1){
       printedList+=tobePrinted.getData();
     }
     else{
       printedList+=tobePrinted.getData() + ",";
     }
     tobePrinted=tobePrinted.getNext();
   }
   return printedList +"]";
 }
 //Any helper method that returns a Node object MUST BE PRIVATE!
}
