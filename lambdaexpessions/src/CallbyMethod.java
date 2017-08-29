import java.util.Arrays;
import java.util.List;

public class CallbyMethod {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		values.forEach(CallbyMethod::doubleit);
	}

	private static void doubleit(Integer i) {
	
		System.out.println(i*2);	
	}
	


	}
