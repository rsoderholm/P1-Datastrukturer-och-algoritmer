/**
 * Created by Robin on 2016-09-07.
 */
public class Stack {
    private int countElements;
    private ListNode firstNode = null;
    private ListNode newNode;
    private Object dataIn;



    public void push (Object dataIn){
        if(firstNode == null) {
            newNode = new ListNode(dataIn, firstNode);

        }


    }


    public Object pop() {
        if(firstNode == null) {
            return -1;
        } else {
            Object dataIn = 
        }

    }

    public void peek() {

    }
}

