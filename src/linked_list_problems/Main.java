package linked_list_problems;


import java.util.HashSet;

public class Main {
    static class  Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }

        Node head=null,tail=null;
        public void InsertAtfront(int data){
            Node nn=new Node(data);
            nn.next=head;
            head=nn;

        }
        public void display(){
            Node temp=head;
            while (temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    public boolean detectLoop(Node h)
    {
        HashSet<Node> s = new HashSet<Node>();
        while (h != null) {
            // If we have already has this node
            // in hashmap it means their is a cycle
            // (Because you we encountering the
            // node second time).
            if (s.contains(h))
                return true;

            // If we are seeing the node for
            // the first time, insert it in hash
            s.add(h);

            h = h.next;
        }

        return false;
    }
    static int countLoop(Node h){
            int res=1;
            Node temp=h;
            while(temp.next!=h){
                res++;
                temp=temp.next;
            }
            return res;
    }


    public static void main(String[] args) {
        Main m=new Main();
        m.InsertAtfront(10);
        m.InsertAtfront(20);
        m.InsertAtfront(30);
        m.display();
        m.head.next.next.next=m.head;
        if(m.detectLoop(m.head)){
            System.out.println("loop");
        }else{
            System.out.println("No loop");
        }
        System.out.println(countLoop(m.head));
    }

}
