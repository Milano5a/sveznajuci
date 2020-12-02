package liste;
import liste.Node;

public class List<T> {
	public int kap;
	public Node<T> head;
	public List(T[] init_array) {
		Node<T> n = new Node<T>(init_array[0]);
		for(int i=1; i < init_array.length; i++) {
			n.appandToTail(init_array[i]);
		}
		kap = init_array.length;
		head = n;
	}
	
	public void printList() {
		Node<T> n = head;
		while(n!=null) {
			System.out.print(n.data.toString() + ' ');
			n=n.next;
		}
		System.out.println();
	}
	
	public void invertList() {
		Node<T> p = head;
		Node<T> q = null;
		Node<T> r = null;
		while(p!=null) {
			r=q;
			q=p;
			p=p.next;
			q.next=r;
		}
		head=q;
	}
	
	public static void main(String args[]) {
		Integer array[] = {1, 2, 3, 4, 5};
		List<Integer> l = new List<Integer>(array);
		l.printList();
		l.invertList();
		l.printList();
	}
}
