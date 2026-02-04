package singlyLinkedList.practice;

public class by_my_own {

    private Node_1 head;
    private Node_1 tail;

    public int size;

    public by_my_own(){
        this.size = size;
    }

    public void insert_first(int val){
        Node_1 obj = new Node_1(val);
        obj.next = head;
        head = obj;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void insert_last(int val){
        if(tail == null){
            insert_first(val);
            return;
        }
        Node_1 obj = new Node_1(val);
        tail.next = obj;
        tail = obj;
        size++;

    }

    public int remove_first(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size --;
        return val;
    }

    public int remove_last(){
        if(size == 1){
            return remove_first();
        }

        Node_1 temp = head;
        for(int i = 1 ; i<size-1 ; i++){
            temp = temp.next;
        }
        int val = temp.next.value;
        temp.next = null;
        tail = temp;
        size --;
        return val;
    }

    public int remove_atRandom(int index){
        if(size == 1){
            return remove_first();
        } else if (index == size-1 ) {
            return remove_last();
        } else if (index == 1) {
            return remove_first();
        } else{
            Node_1 temp = head;

            for(int i = 1; i<index; i++){
                temp = temp.next;
            }
            int val = temp.next.value;
            temp.next = temp.next.next;
            size--;
            return val;
        }
    }

    //no deltetion or insertion just finding
    public int find_byValue(int val){
        Node_1 node = head;
        while(node != null){
            if(node.value == val){
                return node.value;
            }
            node = node.next;
        }
        return 0;
    }

    public void display(){
        Node_1 temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node_1{
        private int value;
        private Node_1 next;

        private Node_1(int value){
            this.value=value;
        }

        private Node_1(int value, Node_1 next){
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args){
        by_my_own obj = new by_my_own();
        obj.insert_first(10);
        obj.insert_first(2);
        obj.insert_first(7);
        obj.insert_last(3);
        obj.insert_last(33);
        System.out.println("original array is : ");
        obj.display();
//        System.out.println("the value deleted by remove_first is : " + obj.remove_first());
//        obj.display();
//        System.out.println("the value deleted by remove_last is : " + obj.remove_last());
//        obj.display();
        System.out.println("the value deleted by remove_atRandom is : " + obj.remove_atRandom(2));
        obj.display();
    }

}
