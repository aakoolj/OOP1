
public class UseList {

	public static void main(String[] args) throws CycleFoundException {
		Lists list = new Lists(5);
		list.addElement(4);
		list.addElement(3);
		
		list.deleteElement(1);
		
		System.out.println(list.getElement(0));
		System.out.println(list.getElement(1));
		
		list.detectCycles();

	}

}
