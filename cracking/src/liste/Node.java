package liste;

public class Node<T> {
	Node<T> next = null;
	T data;
	
	public Node(T d){
		data = d;
	}
	
	void appandToTail(T d) {
		Node<T> end = new Node<T>(d);
		Node<T> n = this;
		while(n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
}
