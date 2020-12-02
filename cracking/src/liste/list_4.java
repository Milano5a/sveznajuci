package liste;
import liste.Node;

public class list_4 {
	public Node<Integer> partition(Node<Integer> node, int x){
		Node<Integer> beforeStar = null;
		Node<Integer> beforeEnd = null;
		Node<Integer> afterStart = null;
		Node<Integer> afterEnd = null;
		
		while(node != null) {
			Node<Integer> next = node;
			node.next = null;
			
			if(node.data < x) {
				if(beforeStar == null) {
					beforeStar = node;
					beforeEnd = node;
				}else {
					beforeEnd.next = node;
					beforeEnd = beforeEnd.next;
				}
			}else {
				if(afterStart == null) {
					afterStart = node;
					afterEnd = node;
				}else {
					afterEnd.next = node;
					afterEnd = afterEnd.next;
				}
			}
			
			if(beforeStar == null) {
				return afterStart;
			}
			beforeEnd.next = afterStart;
			return beforeStar;
		}
	}
	
	public Node<Integer> partition_1(Node<Integer> node, int x){
		Node<Integer> tail = node;
		Node<Integer> head = node;
		while(node != null) {
			Node<Integer> next = node.next;
			if(node.data < x) {
				node.next = head;
				head = node;
			}else {
				tail.next = node;
				tail = node;
			}
			node = next;
		}
		tail.next = null;
		return head;
	}
}
