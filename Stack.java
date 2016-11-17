
public class Stack { //Implementing a LIFO stack (data structure)
	
	private StackElement mHead;
	
	public Stack() {
		mHead = new StackElement();
	}
	public Stack(int val) {
		mHead = new StackElement(val);
	}
	
	public void push(int val) { // adding an element on top of the stack
		StackElement newHead = new StackElement(val);
		
		newHead.setNextElement(mHead); // set current head as reference for newHead
		
		mHead = newHead; // make newHead current head
	}
	
	public void pop() {
		mHead = mHead.getNextElement();
	}
	
	public int sizeOfStack() {
		int acc = 0;
		StackElement stepper = mHead;
		
		while (stepper.getNextElement() != null) {
			acc++;
			stepper = stepper.getNextElement();
		}
		acc++;
		return acc;
	}
	
	public void print() {
		StackElement stepper = mHead;
		
		while (stepper.getNextElement() != null); {
			System.out.println(stepper.getValue());
			stepper = stepper.getNextElement();
		} 
		
	}
}
