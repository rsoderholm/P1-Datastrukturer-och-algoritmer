/**
 * Created by rsoderholm on 2016-09-08.
 */
public interface StackerFace <T> {

    public void push (T Element);
    public T pop();
    public T peek();
    public int size();
}
