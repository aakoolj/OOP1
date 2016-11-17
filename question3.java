
public class question3 {

	public static void main(String[] args) {
		qu2_car p = null;
		System.out.println(p);
		
		qu2_car p2 = new qu2_car(); 
		System.out.println(p2);
		
		p=p2;
		System.out.println(p);
		
		p2 = new qu2_car(); 
		System.out.println(p2);
		
		p=null;
		System.out.println(p);


	}

}
