/**
 * Created by Robin on 2016-09-07.
 */
public class ListNode {

    private ListNode next;
    private Object data;


    public ListNode(Object DataValue, ListNode nextNode) {
        data = DataValue;
        next = nextNode;

    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;

    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getNext() {
        return next;
    }
}


