// ***EXERCISE 4***
public class question4 {

	public static void main(String[] args) {
		//set up test array 'a'
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}
		
		
		System.out.println(sum(a));
		
		int[] cumulative = cumsum(a);
		for (int i = 0; i < cumsum(a).length; i++) {
			System.out.println(cumulative[i]);
		}
		
		int[] positiveList = positives(a);
		for (int i1 = 0; i1 < positiveList.length; i1++) {
			System.out.println(positiveList[i1]);
		}
		
	}
	
	public static int[] cumsum(int[] a) {
		int[] cumulative = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= i; j++) {
				cumulative[i] = cumulative[i] + a[j];
			}
		}
		
		return cumulative;
	}
	
	
	public static int[] positives(int[] a) {
		int noPositives = 0; // to define length of returned list
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				noPositives++;
			}
		}
		
		int[] positiveList = new int[noPositives];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				positiveList[index] = a[i];
				index++;
			}
		}

		return positiveList;
	}

	
	public static int sum(int[] a) {
		int tot = 0;
		
		for (int i = 0; i < a.length; i++) {
			tot = tot + a[i];
		}
		return tot;
	}
	
	
}
