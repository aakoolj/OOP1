
public class StackElement {

	private int mValue; //stack of only numbers
	private StackElement mNext; //next element in stack 
	
	public StackElement() {
		mValue = 0; //defaults to 0
		mNext = null;
	}
	public StackElement(int val) {
		mValue = val;
		mNext = null;
	}
	
	public StackElement getNextElement() {
		return mNext;
	}
	
	public int getValue() {
		return mValue;
	}
	
	public void setNextElement(StackElement e) {
		mNext = e;
	}
	
	
}
