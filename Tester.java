public class Tester{
  public static void main(String[] args) {
    MyLinkedList testing= new MyLinkedList();
        //Add nodes to the list
        testing.add("0");
        testing.add("1");
        testing.add("2");
        testing.add("3");
        testing.add("4");
    System.out.println(testing.size());
    System.out.println(testing.toString());
    /*[0,1,2,3,4]*/
    System.out.println(testing.toStringReversed());
    /*[4,3,2,1,0]*/
    System.out.println(testing.set(2,"b"));
    System.out.println(testing.get(2));
    /*[0,1,b,3,4]*/
        testing.add(3,"a");
    System.out.println(testing.size());
    System.out.println(testing.toString());
    /*[0,1,b,a,3,4];*/
    System.out.println(testing.remove(3));
    //[0,1,b,3,4]
    System.out.println(testing.size());
    /*5*/
    System.out.println(testing.toString());
    testing.remove(4);
    System.out.println(testing.size());
    System.out.println(testing.toString());
    testing.remove(0);
    System.out.println(testing.size());
    System.out.println(testing.toString());
    testing.remove(0);
    testing.remove(1);
    testing.remove(0);
    System.out.println(testing.size());
    System.out.println(testing.toString());
  }
}
