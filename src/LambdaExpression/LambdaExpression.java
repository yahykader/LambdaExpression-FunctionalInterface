package LambdaExpression;


interface Calculator{
	// void calculer();
	 //void sum(int input);
	int substraction(int a,int b);
}
public class LambdaExpression {

	public static void main(String[] args) {
		/*
		Calculator calculator=() -> System.out.println("Lambda Expression .......");
		calculator.calculer();
		*/
		/*
		Calculator calculator2=(input)-> System.out.println("sum ... Lambda Expression."+input);
		calculator2.sum(5);
		*/
		/*Calculator addition=(a,b)-> { 
			return a+b;
		};*/
		Calculator addition=(a,b)->{
			if(b<a) {
				throw new RuntimeException("B inferieur a A");
			}else {
				return a-b;
			}
		};
		System.out.println(addition.substraction(8, 47));

	}	
  /* LAMBDA EXPRESSION
   * ()->{body}
   * 
   */
}
