//package circularLinkedList.practice;
//
//public class circular_linkedList {
//
//    public void delete(int val){
//        Node node = head;
//        if(node == null){
//            return;
//        }
//        if(node.val == val){
//            head = head.next;
//            tail = head;
//            return;
//        }
//        do{
//            Node n = node.next;
//            if(n.val == val){
//                node.next = n.next;
//                break;
//            }
//            node = node.next;
//        }while(node != head);
//    }
//
//    private void Node(){
//
//    }
//
//}
