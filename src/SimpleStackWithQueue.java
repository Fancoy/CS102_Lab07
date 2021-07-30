public class SimpleStackWithQueue {

    private SimpleQueue que1;
    private SimpleQueue que2;



    public SimpleStackWithQueue(){
        que1 = new SimpleQueue();
        que2 = new SimpleQueue();
    }

    public void push(String data){

        que1.enqueue(data);

    }

    public String pop(){
        String data = "";
        SimpleQueue temp;

        if(que1.isEmpty()){
            data = "Nothing to remove";
        }
        while (!que1.isEmpty()) {
            data = que1.dequeue();

            if (!que1.isEmpty()) {
                que2.enqueue(data);
            }
            else{
                que1.enqueue(data);
                break;
            }
        }

        String s = que1.dequeue();
       temp = que2;
       que2 = que1;
       que1 = temp;

        return s;
    }

    @Override
    public String toString() {
        return que1.toString();
    }
}
