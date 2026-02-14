package doublyLinkedList.practice;

public class doubly_linked_list {

    Node head;
    Node tail;
    int size = 0;

    public void insert_first(int val){
        Node na = new Node(val);
        if(head == null){
            head = na;
            tail = na;
        }else{
            na.next = head;
            na.prev = null;
            head.prev = na;
            head = na;
        }
        size++;
    }


    // the below code is also if we dont know tail
    public void insertLast(int val) {
        if (size == 0) {
            insert_first(val);
            return;
        }

        Node na = new Node(val);
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = na;
        na.prev = temp;
        size++;
    }


    //below code is good if u know the tail
//    public void insertLast(int val) {
//        Node node = new Node(val);
//
//        if (head == null) {        // empty list
//            head = node;
//            tail = node;
//        } else {
//            tail.next = node;
//            node.prev = tail;
//            tail = node;
//        }
//        size++;
//    }

    public void insertRand(int val, int index){
        if(index == 0){
            insert_first(val);
            return;
        } else if (index == size) {
            insertLast(val);
            return;
        } else{
            Node temp = head;
            for(int i=1;i<index;i++){
                temp = temp.next;
            }
            Node obj = new Node(val,temp.next,temp);
            temp.next.prev = obj;
            temp.next = obj;
            size++;
        }
    }


    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.value+ " --> ");
            temp = temp.next;
        }
        System.out.print("END");

    }

    public void displayRev(){
        Node temp = head;
        Node tempR = null;

        while(temp != null){
            tempR = temp;
            temp = temp.next;
        }
        while(tempR != null){
            System.out.print(tempR.value + "-->");
            tempR = tempR.prev;
        }

        System.out.print("END");

    }

    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int val){
            this.value = val;
        }

        public Node(int val,Node next, Node prev){
            this.value = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args){
        doubly_linked_list obj = new doubly_linked_list();
//        obj.insert_first(10);
//        obj.insert_first(20);
//        obj.insert_first(30);
//        obj.insert_first(40);
//        obj.display();
//        System.out.println("\nthe same list in reverse order display is as follow : ");
//        obj.displayRev();
        obj.insertLast(1);
        obj.insertLast(2);
        obj.insertLast(3);
        obj.insertRand(90,2);
        obj.display();


    }
}



