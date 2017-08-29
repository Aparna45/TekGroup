
public class TypeInterface {

	public static void main(String[] args) {
		printLambda(s -> s.length());
	}
	public static void printLambda(StringLengthLambda l) {
		System.out.println(l.getLength("Advaita"));

	}

}
