
public class LinkedList1<T> {
	private class Node<T> {
		private T data;
		private Node<T> link;

		@SuppressWarnings("unused")
		public Node() {
			data = null;
			link = null;
		}

		public Node(T newData, Node<T> linkValue) {
			this.data = newData;
			this.link = linkValue;
		}
	}// End of Node<T> inner class

	private Node<T> head;

	public LinkedList1() {
		head = null;

	}

	/**
	 * Adds a node at the start of the list with the specified data. The added
	 * node will be the first node in the list.
	 */
	public void addToStart(T itemData) {
		head = new Node<T>(itemData, head);
	}

	/**
	 * Removes the head node and returns true if the list contains at least one
	 * node. Returns false if the list is empty.
	 */
	public boolean deleteHeadNode() {
		if (head != null) {
			head = head.link;
			return true;
		} else
			return false;
	}

	/**
	 * Returns the number of nodes in the list.
	 */
	public int size() {
		int count = 0;
		Node<T> position = head;
		while (position != null) {
			count++;
			position = position.link;
		}
		return count;
	}

	public boolean contains(T item) {
		return (find(item) != null);
	}

	/**
	 * Finds the first node containing the target item, and returns a reference
	 * to that node. If target is not in the list, null is returned.
	 */
	private Node<T> find(T target) {
		Node<T> position = head;
		T itemAtPosition;
		while (position != null) {
			itemAtPosition = position.data;
			if (itemAtPosition.equals(target))
				return position;
			position = position.link;
		}
		return null; // target was not found
	}

	/**
	 * Finds the first node containing the target and returns a reference to the
	 * data in that node. If target is not in the list, null is returned.
	 */
	public T findData(T target) {
		return find(target).data;
	}

	public void outputList() {
		Node<T> position = head;
		while (position != null) {
			System.out.print(position.data);
			position = position.link;

		}
		System.out.println();
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public void clear() {
		head = null;
	}

	/*
	 * For two lists to be equal they must contain the same data items in the
	 * same order. The equals method of T is used to compare data items.
	 */
	public boolean equals(Object otherObject) {
		if (otherObject == null)
			return false;
		else if (getClass() != otherObject.getClass())
			return false;
		else {
			LinkedList1<T> otherList = (LinkedList1<T>) otherObject;
			if (size() != otherList.size())
				return false;
			Node<T> position = head;
			Node<T> otherPosition = otherList.head;
			while (position != null) {
				if (!(position.data.equals(otherPosition.data)))
					return false;
				position = position.link;
				otherPosition = otherPosition.link;
			}
			return true; // no mismatch was not found
		}
	}

	private Node<T> suitorMethod() {
		Node<T> holder = head;
		int i = 0;

		while (holder != null) {
			i++;
			if (i % 2 == 0) {
				holder.link = holder.link.link;
			}
			holder = holder.link;
		}
		return head;
	}

	public static void main(String[] args) {
		LinkedList1 list = new LinkedList1();
		list.addToStart(6);
		list.addToStart(5);
		list.addToStart(4);
		list.addToStart(3);
		list.addToStart(2);
		list.addToStart(1);

		list.outputList();
		list.suitorMethod();
		list.outputList();
		list.suitorMethod();
		list.outputList();

		/*
		 * OUTPUT: 123456 1245 125
		 */
	}
}
