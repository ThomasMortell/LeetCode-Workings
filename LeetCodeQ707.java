public class LeetCodeQ707{
    class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }

    class myLinkedList{
        int size;
        ListNode head;
        public myLinkedList(){
            size = 0;
            head = new ListNode(0);
        }

        public int getIndex(int index){
            if(index < 0|| index >= size){
                return -1;
            }

            ListNode curr = head;
            for(int i= 0; i < index + 1; i++){
                curr = curr.next;
            }
            return curr.val;
        }

        public void addAtIndex(int index, int val){
            if(index < 0 || index > size){
                return;
            }

            size = size + 1;

            ListNode prev = head;

            for(int i = 0; i < index; i++){
                prev = prev.next;
            }
            ListNode toAdd = new ListNode(val);
            toAdd.next = prev.next;
            prev.next = toAdd;
        }

        public void deleteAtIndex(int index, int val){
            if(index < 0 || index >= size){
                return;
            }
            size = size - 1;

            ListNode prev = head;
            for(int i = 0; i < index; i++){
                prev = prev.next;
            }

            prev = prev.next.next;
        }

        public void addAtHead(int val){
            addAtIndex(0, val);;
        }

        public void addatTail(int val){
            addAtIndex(size,val);
        }
    }
}
}