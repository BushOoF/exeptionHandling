public class Node {
    int val;
    Node next;

    Node() {
        this.val = 1;
        this.next = null;
    }

    Node(int val) {
        this.val = val;
        this.next = null;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    public static class Queue{
        private int queueFront;
        private int queueRear;
        private int maxQueueSize;
        private int count;
        private SingleLinkedList<Integer> list;
        public void queueType(int maxQueueSize){
            if(maxQueueSize<=0){
                System.out.println("Node.Queue size cannot be less or equal to 0, it is set to 100 by default now");
                this.maxQueueSize=100;
            }else{
                this.maxQueueSize=maxQueueSize;
                queueFront=0;
                queueRear=maxQueueSize-1;
                count=0;
                list=new SingleLinkedList<Integer>();
            }
        }
        public boolean isEmpty(){
            return count==0;
        }
        public boolean isFull(){
            return count==maxQueueSize;
        }
        public void addQueue(int newElement){
            if(isFull()){
                System.out.println("Cannot add to full queue");
            }else{
                queueRear=(queueRear+1)%maxQueueSize;
                list.add(newElement);
                count++;
            }
        }
        public void deQueue(int position){
            if(isEmpty()){
                System.out.println("Cannot delete from empty queue");
            }else{
                list.get(position);
            }
        }
    }
}
