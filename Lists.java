
public class Lists {
	
	private Node mHead;
	
	public Lists() {
		mHead = new Node();
	}
	public Lists(int hdVal) {
		mHead = new Node(hdVal);
	}
	
	public int getHeadValue() {
		return (mHead.getValue());
	}
	
	public int noElements() {
		int total = 0;
		Node start = mHead;
		
		while (start.pointNextNode() != null) {
			total++;
			start = start.pointNextNode();
		}
		
		return total;
	}
	
	public void addElement(int newVal) {
		Node start = mHead;
		
		while (start.pointNextNode() != null) { // now start = the last element
			start = start.pointNextNode();
		}
		
		Node endNode = new Node(newVal);
		start.setNextNode(endNode);
		
	}
	
	public int getElement(int n) { // list starts from index 0
		Node stepper = mHead;
		for (int count = 0; count < n; count++) {
			stepper = stepper.pointNextNode();
		}
		
		return stepper.getValue();
	}
	
	public void deleteElement(int n) {
		Node stepper = mHead;
		for (int count = 1; count < n; count++) {
			stepper = stepper.pointNextNode();
		} //now stepper = node before node to be deleted
		//want to change node reference to next node reference
		
		Node toDelete = stepper.pointNextNode();
		Node toAttach = toDelete.pointNextNode();
		
		stepper.setNextNode(toAttach);
	}
	
	public void print() {
		Node start = mHead;
		while (start.pointNextNode() != null) {
			System.out.println(start.getValue());
			start = start.pointNextNode();
		}
		
	}
	
	public Node getNextNode(Node n) {
		return n.pointNextNode();
	}
	
	public Node getHeadNode() {
		return mHead;
	}
	
	// ***EXERCISE 8***
	public void detectCycles() throws CycleFoundException { //none should share a pointer
		Node stepper = mHead;
		Node stepper2 = mHead.pointNextNode();
		int k = noElements() - 1;
		
		for (int i = 0; i < noElements(); i++) {
			
			for (int j = 0; j < k; j++) {
				if (stepper.pointNextNode() == stepper2.pointNextNode()) {
					throw new CycleFoundException("Have found a cycle.");
				}
				stepper2 = stepper2.pointNextNode();
			}
			stepper = stepper.pointNextNode();
			stepper2 = stepper.pointNextNode();
			k--;
		}
	}
	
	
}
