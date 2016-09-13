/**
 * Created by rsoderholm on 2016-09-08.
 */
interface Stackable<T> {

    void push(T Element);

    T pop();

    T peek();

    int size();
}
