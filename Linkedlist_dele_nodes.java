   class Node{
    int data;
    Node next;
    
    Node(int data1){
        this.data= data1;
        this.next = null;
    }
    Node(int data1,Node next1){
        this.data = data1;
        this.next = next1;
    }
}
class Linkedlist_dele_nodes {
    static Node convertArrayToLinkedlist(int[] arr){
        Node head = new Node(arr[0]);
        Node current = head;
        for(int i =1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            current.next = temp;
            current = temp;
        }
        return head;
    }
    static Node deleteHead(Node head){
        Node temp = head;
        head = temp.next;
        temp.next = null;
        return head;
    }
    static Node deleteTail(Node head){
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
        
        return head;
    }
    static Node deleteNthNode(Node head,int n){
        Node temp = head;
        Node prev = null;
        int c=1;
        
        while(temp!=null){
            if(c==n){
                prev.next = temp.next;
                temp.next = null;
            }
            prev = temp;
            temp=temp.next;
            c++;
        }
        return head;
    }
    static Node deleteByValue(Node head,int val){
        Node temp = head;
        Node prev = null;

        while(temp!=null){
            if(temp.data == val){
                prev.next = temp.next;
                temp.next = null;
            }
            prev = temp;
            temp=temp.next;
        }
        return head;
    }
   
    static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + ((temp.next!= null) ? "->" :"->null"));
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,9,8,7,6};
        Node head = convertArrayToLinkedlist(arr);
        print(head);
        head = deleteHead(head);
        print(head);

        head = deleteTail(head);
        print(head);

        head = deleteNthNode(head, 4);
        print(head);

        head = deleteByValue(head, 7);
        print(head);
}
}
    

