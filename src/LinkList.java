public class LinkList {
    public int data;
    public LinkList next;

    public LinkList (int data){
        this.data = data;
    }
}
 class Node{
    private LinkList head;

    public Node (){
        head = null;
    }

    public void add (int data){
       LinkList tmp = new LinkList(data);
       tmp.next = head;
       head = tmp;
    }
    public void print(){
        LinkList tmp = head;

        while (tmp != null){
            System.out.println(tmp.data);
            tmp = tmp.next;
        }

    }
     public int size(){
         int count = 0;
         LinkList sz = head;
         while (sz != null){
             count++;
             sz = sz.next;
         }
         return count;
     }
}