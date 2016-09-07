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

    public Object getData() {
        return data;

    }

}
