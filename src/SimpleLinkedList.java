public class SimpleLinkedList {

    Node head;

    public SimpleLinkedList(){

        head = null;

    }

    public void addToTail(String data){

        Node last = new Node(data);
        Node temp = head;

        if(head == null){
            head = last;
        }
        else{
            while (temp.next != null){
                temp = temp.next;

            }
            temp.next = last;
        }

    }

    public String removeFromHead(){

        Node temp;
        String data = head.getData();

        if(head == null){
            return "";
        }
        else{
            temp = head.next;
            head.next = null;
            head = temp;
        }
        return data;

    }

    public boolean isEmpty(){
        return head == null;

    }

    public Node get(String data){

        Node temp = head;

        if(temp.getData().equals(data)){
            return head;
        }
        else{
            while(!temp.getData().equals(data)){
                temp = temp.next;

            }
        }
        return temp;

    }

    @Override
    public String toString() {
        String s = "";
        Node temp = head;

        if(head == null){
            s = "Empty LinkedList";
        }
        else{
            int i = 1;
            while(temp != null){
                s += i + "'th Node's data = " + temp.getData() + "\n";
                temp = temp.getNext();
                i++;
            }
        }
        return s;

    }
}
