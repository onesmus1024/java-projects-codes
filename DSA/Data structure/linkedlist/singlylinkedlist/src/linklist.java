class linklist{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next=null;
    }

}




    public static void main(String[] args) throws Exception {
        System.out.println("<<<<<<<<LINKED LIST DATA STRUCTURE>>>>>>>>>> ");

        linklist linkedlist = new linklist();
        linkedlist.head=new Node(20);
        Node nodetwo = new Node(30);
        Node nodethree = new Node(40);
        linkedlist.head.next=nodetwo;
        nodetwo.next = nodethree;

        while (linkedlist.head!=null)
        {
            System.out.print(linkedlist.head.data);
            System.out.print("=>");
            linkedlist.head = linkedlist.head.next;
        }

    }
}


