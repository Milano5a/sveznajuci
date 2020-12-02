package liste;
import liste.Node;

public class list_2<T> {
	public Node<T> nthToLast(Node<T> head, int k){
		Node<T> p1 = head;
		Node<T> p2 = head;
		
		for(int i = 0; i<k; i++) {
			if(p1 == null) return null;
			p1 = p1.next;
		}
		
		while(p1!=null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
	}
	
	int printKthToLast(Node<T> head, int k) {
		if(head==null) return 0;
		int index = printKthToLast(head.next, k) + 1;
		if(index == k) {
			System.out.println(k + "th to last node is" + head.data);
		}
		return index;
	}
	
	class Index {
		public int value = 0;
	}
	
	public Node<T> nthToLast_r(Node<T> head, int k){
		Index idx = new Index();
		return nthToLast_r(head,k,idx);
	}
	
	public Node<T> nthToLast_r(Node<T> head, int k, Index idx){
		if(head==null) {
			return null;
		}
		Node<T> node = nthToLast_r(head.next, k, idx);
		idx.value = idx.value + 1;
		if(idx.value == k) {
			return head;
		}
		return node;
	}
	
}
