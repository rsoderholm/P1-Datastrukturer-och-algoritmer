import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Robin on 2016-09-07.
 */
public class Stack implements Stackable {

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

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public void setSize() {
        this.size = size;
    }


    public void stringToStack() {

        char currentChar;
        Stack stack = new Stack();
        String inString;


        inString = JOptionPane.showInputDialog(null, "Please enter a string");

        System.out.print("String to be parsed: " + inString);
        for (int i = 0; i < inString.length(); i++) {
            currentChar = inString.charAt(i);


            if (currentChar == '(') {
                stack.push(currentChar);

            } else if (currentChar == '[') {
                stack.push(currentChar);

            } else if (currentChar == '{') {
                stack.push(currentChar);


            } else if (currentChar == ')') {
                stack.pop();
                if (!stack.pop().equals('(')) {
                    System.out.println("Parentheses do not match");

                }


            } else if (currentChar == '}') {
                if (stack.isEmpty())

                    if (!stack.pop().equals('{'))
                        System.out.println("Braces do no match");


            } else if (currentChar == ']') {
                if (stack.isEmpty())

                    if (!stack.pop().equals('['))
                        System.out.println("Brackets do not match");


            }
        }


    }


}


//            else if (currentChar == '{' || currentChar == '(' || currentChar == '[') {
//                stack.push(currentChar);
//            } else if (currentChar == '}' || currentChar == ')' || currentChar == ']') {
//                stack.pop();


//    }
//            }













