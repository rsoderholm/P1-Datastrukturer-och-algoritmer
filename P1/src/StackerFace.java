/**
 * Created by rsoderholm on 2016-09-08.
 */
interface StackerFace<T> {

    void push(T Element);

    T pop();

    T peek();

    int size();
}
