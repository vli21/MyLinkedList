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
     end.setPrev(newNode);
     size++;
   }
   return true;
 }

 private Node getNode(int index)throws IndexOutOfBoundsException{
   if (index<0 || index>size){
     throw new IndexOutOfBoundsException ("Index"+index+"is out of bounds!");
   }
     Node thisNode=start;
     for (int i= 0; i<index;i++){
       thisNode=thisNode.getNext();
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
     Node oldHere= getNode(index);
     Node oldPrev= getNode(index-1);
     oldHere.setPrev(newNode);
     oldPrev.setNext(newNode);
     newNode.setPrev(oldPrev);
     newNode.setNext(oldHere);
   }
   size ++;
 }

 public String get(int index){
   return getNode(index).getData();
 }

 public String set(int index, String value){
   String previous=getNode(index).getData();
   getNode(index).setData(value);
   return previous;
 }

 public String remove(int index)throws IndexOutOfBoundsException {
   if (index < 0 || index >= size()){
     throw new IndexOutOfBoundsException("Index"+index+"is out of bounds!");
   }

   String before= getNode(index).getData();

   if (size==1){
     start=null;
     end=null;
     size --;
     return before;
   }
   if(index==0){
     start = start.getNext();
		 start.getPrev().setNext(null);
		 start.setPrev(null);
     size --;
     return before;
   }
   if (index==size-1){
      end = end.getPrev();
			end.getNext().setPrev(null);
			end.setNext(null);
     size --;
     return before;
   }
     Node Prev= getNode(index-1);
     Node After=getNode(index+1);
     Node Removed=getNode(index);
     Prev.setNext(After);
     After.setPrev(Prev);
     Removed.setNext(null);
     Removed.setPrev(null);
     size --;
     return before;

 }

 public void extend(MyLinkedList other){
   if (start == null) {
     start = other.start;
     end = other.end;
     other.start = null;
     other.end = null;
     other.size = 0;
   }
   else{
     end.setNext(other.start);
     end = other.end;
     other.start.setPrev(end);
     size += other.size();
     other.start = null;
     other.end = null;
     other.size = 0;
   }
 }

 public String toString(){
   String printedList= "[";
   Node tobePrinted=start;
   for(int i=0;i<size;i++){
     if (tobePrinted==null){
       printedList+="";
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

 public String toStringReversed(){
   String printedList= "[";
   Node tobePrinted=end;
   for(int i=size-1;i>=0;i--){
     if (tobePrinted==null){
       printedList+="";
     }
     else if (i==0){
       printedList+=tobePrinted.getData();
     }
     else{
       printedList+=tobePrinted.getData() + ",";
     }
     tobePrinted=tobePrinted.getPrev();
   }
   return printedList +"]";
 }
 //Any helper method that returns a Node object MUST BE PRIVATE!
}
