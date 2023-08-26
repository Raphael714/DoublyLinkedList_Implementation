public class DoublyLinkedList<T> {
        Node head;
        Node tail;

        class Node{
            T data;
            Node prev;
            Node next;
            Node(T val){
                data=val;
                next=null;
                prev=null;
            }
        }
        DoublyLinkedList(){
            head=null;
            tail=null;
        }

        public void insertAtBeginning(T val){
            Node newnode = new Node(val);
            if(head==null){
                head=newnode;
                tail=newnode;
            }
            else{
                head.prev=newnode;
                newnode.next=head;
                head=newnode;
            }

        }

        public void display(){
            Node temp = head;
            while(temp != null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }

    public void displayReverse(){
        Node temp = tail;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
    }

        public void insertAtPos(int pos,T val){
            if(pos==0){
                insertAtBeginning(val);
                return;
            }
            Node newnode = new Node(val);
            Node temp = head;
            for(int i=1;i<=pos-1;i++){
                temp = temp.next;
                if(temp==null){
                    throw new IllegalArgumentException("Invalid pos"+pos);
                }
            }

            newnode.next=temp.next;
            newnode.prev=temp;
            if(temp==tail)
                tail=newnode;
            else
                temp.next.prev=newnode;
            temp.next=newnode;
            }






        public void deleteAtPos(int pos){
            if(head==null){
                throw new IndexOutOfBoundsException("Deletion attempted on empty list");
            }
            if(pos==0){
                head=head.next;
                if(head==null)
                    tail=null;
                else
                    head.prev=null;
                return;
            }
            Node temp = head;
            Node prev = null;
            for(int i=1;i<=pos;i++){
                prev=temp;
                temp=temp.next;
                if(temp==null)
                    throw new IndexOutOfBoundsException("Deletion attempted on empty list");
            }
            prev.next=temp.next;
            if(temp.next==null)
                tail=prev;
            else
                temp.next.prev=prev;
        }

        public void getIndex(T val){
            Node temp=head;
            int got=0;
            int count=0;
            while(got==0){
                if(temp.data==val)
                {
                    got++;
                    System.out.print(count);
                }
                else{
                    temp=temp.next;
                    count++;
                }

            }

        }

        public void update(int pos,T val){
            Node temp = head;
            for(int i=1;i<=pos;i++){
                temp=temp.next;
            }
            temp.data=val;
        }



        public int getLength(){
            int count=0;
            Node temp=head;
            while(temp!=null){
                count++;
                temp=temp.next;

            }
            return count;
        }


        




    }


