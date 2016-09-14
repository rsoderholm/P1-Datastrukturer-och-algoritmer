import javax.swing.*;

/**
 * Created by Robin on 2016-09-13.
 */
public class testCharacter {
    public boolean stringToStack(String inString) {


        char currentChar;
        Stack stack = new Stack();


        for (int i = 0; i < inString.length(); i++) {
            currentChar = inString.charAt(i);


            switch (currentChar) {
                case '}':
                    if (stack.isEmpty() || !stack.pop().equals('{'))
                        return false;
                    break;

                case ')':
                    if (stack.isEmpty() || !stack.pop().equals('('))
                        return false;
                    break;
                case ']':
                    if (stack.isEmpty() || !stack.pop().equals('['))


                        return false;


                    break;

                default:

                    if (currentChar == '{' || currentChar == '(' || currentChar == '[')
                        stack.push(currentChar);

            }

        }

        return stack.isEmpty();
    }

    /**
     * @param inString
     */
    public void printResult(String inString) {
        testCharacter tc = new testCharacter();
        if (tc.stringToStack(inString) == false) {
            System.out.println("Brackets don't match in the following sentence: " + inString);
            System.out.println("Finished parsing!");
        } else {
            System.out.println("Everything matches in: " + inString);
            System.out.println("Finished parsing!");

        }

    }


    public static void main(String[] args) {

        testCharacter tc = new testCharacter();

        String inString = JOptionPane.showInputDialog("Ange ord");
        JOptionPane.showMessageDialog(null, tc.stringToStack(inString));

        System.out.println("Text to parse: " + inString);
        System.out.println("Parsing, please wait..... ");
        tc.printResult(inString);


    }
}



