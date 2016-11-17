
public class question6 {
	
	public static int[] vectorAdd(int x,int y,int dx, int dy) { 
		int[] vectors = new int[2]; //as only x and y
		x=x+dx;
		y=y+dy;
		
		vectors[0] = x;
		vectors[1] = y;
		
		return vectors;
	}
	
	public static void main(String[] args) { 
		int a=0;
		int b=2;
		
		int[] vectors = vectorAdd(a,b,1,1); //now vectorAdd() returns so have to assign it
		
		a = vectors[0]; //update the values of a and b
		b = vectors[1];
		
		System.out.println(a+" "+b); // (a,b) is still (0,2)
	}

}
