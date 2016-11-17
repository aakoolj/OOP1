
public class Node {
	
	private int mValue; // value of each node
	private Node nextNode; // links to the next node
	
	public Node() {
		mValue = 0;
		nextNode = null;
	}
	public Node(int value) {
		mValue = value;
		nextNode = null;
	}
	
	public int getValue() {
		return this.mValue;
	}
	
	public Node getNextNode() {
		return nextNode;
	}
	
	public Node pointNextNode() {
		return (this.nextNode); // (this or n) as is value of nextNode for n
	}
	
	public void setNextNode(Node endNode) {
		nextNode = endNode;
	}	
}
	
 