public class Test {

    public static void main(String[] args){

        SimpleLinkedList list = new SimpleLinkedList();
        list.addToTail("Thrall");
        list.addToTail("Sylvanas");
        list.addToTail("Jaina");
        System.out.println(list.removeFromHead());
        System.out.println(list);
        System.out.println("************************************");


        System.out.println("SimpleStackWithQueue tester: ");
        SimpleStackWithQueue qstack = new SimpleStackWithQueue();

        qstack.push("Thrall");
        qstack.push("Sylvanas");
        qstack.push("Jaina");
        qstack.push("Nathanos");
        qstack.push("Garrosh");

        System.out.println(qstack);

        System.out.println("Popped element = " + qstack.pop());
        System.out.println(qstack.pop());

        System.out.println(qstack);
    }
}
