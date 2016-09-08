import java.util.Scanner;

/**
 * Created by Robin on 2016-09-07.
 */
public class Stack implements StackerFace {
    int count;
    private ListNode firstNode;
    private int size = 0;


    public void push(Object dataIn) {
        firstNode = new ListNode(dataIn, firstNode);
        size++;

    }


    public Object pop() {

        if (size == 0) {
            return null;
        }
        Object data = firstNode.getData();
        ListNode node = firstNode.getNext();
        firstNode = node;
        size--;
        return data;
    }


    public Object peek() {
        if (firstNode == null) {
            return null;
        } else {
            return firstNode.getData();
        }


    }

    public int size() {
        return size;
    }

    public void setSize() {
        this.size = size;
    }

    public void enterString() {
        String inString;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a String");
        inString = in.nextLine();
        System.out.println("You entered: " + inString );





    }


}


