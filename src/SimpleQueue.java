public class SimpleQueue {

    SimpleLinkedList linkedList;

    public SimpleQueue(){
        linkedList = new SimpleLinkedList();
    }

    public void enqueue(String data){
        linkedList.addToTail(data);
    }

    public String dequeue(){
        return linkedList.removeFromHead();
    }

    public boolean isEmpty(){
        return linkedList.isEmpty();
    }

    @Override
    public String toString() {
        return linkedList.toString();
    }
}
