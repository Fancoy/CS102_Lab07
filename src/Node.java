public class Node {
    String data;
    Node next;

    public Node(String data) {

        this.data = data;
        this.next = null;
    }

    public Node(String data, Node next){

        this.data = data;
        this.next = next;
    }

    public Node getNext(){
        return this.next;
    }

    public String getData(){
        return this.data;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public void setData(String data){
        this.data = data;
    }
}
