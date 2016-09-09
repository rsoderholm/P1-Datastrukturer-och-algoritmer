import javax.swing.*;
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

    public void stringToStack() {
        char currentChar;
        int index = 0;
        char node;

        String inString = JOptionPane.showInputDialog(null, "Please enter a string");

        for (int i = 0; i < inString.length(); i++) {
            currentChar = inString.charAt(i);
            if (currentChar == '{' || currentChar == '(' || currentChar == '[') {
                push(currentChar);
            }

            if (currentChar == '}' || currentChar == ')' || currentChar == ']') {

                }


            }


        }







    public String parseString() {

        return null;
    }


}


