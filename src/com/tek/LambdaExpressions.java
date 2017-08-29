 package com.tek;

public class LambdaExpressions {
		public void greet(Greeting greeting) {
			greeting.perform();
		}
		public static void main(String[] args) {
			LambdaExpressions lambdaExpressions = new LambdaExpressions();
		Greeting myLambdaFunction = () -> System.out.print("Hei people");
		myLambdaFunction.perform();
		}

}
