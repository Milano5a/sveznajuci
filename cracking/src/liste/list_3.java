package liste;
import liste.Node;
import liste.List;

public class list_3 {
	boolean deleteNode(Node<T> n) {
		if(n==null || n.next ==null) {
			return false;
		}
		n.data = n.next.data;
		n.next = n.next.next;
		return true;
	}
}
