

public interface Calc{
	public int calculate(int num1,int num2);
}
public enum Calculator implements Calc{
	
	ADD{
		@Override
		public int calculate(int num1, int num2) {
			// TODO Auto-generated method stub
			return num1 + num2;
		}
	},
	
	SUBSTRACT{
		@Override
		public int calculate(int num1, int num2) {
			// TODO Auto-generated method stub
			return num1 - num2;
		}
	};
	

	public static void main(String[] args) {
		System.out.println(Calculator.ADD.calculate(2, 3));
		System.out.println(Calculator.SUBSTRACT.calculate(3, 2));
	}
	
}