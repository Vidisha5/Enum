
public enum Coffeeee {

	BIG(8),HUGE(10),OVERWHELMING(15){
		public String getLidCode() {
			return "A";
			
		}
	};
	
	
	private int ounces;

	Coffeeee(int i) {
		this.ounces=i;
	}

	public int getOunces() {
		return ounces;
	}
	
	public String getLidCode() {
		return "B";
		
	}
	
	
	public static void main(String[] args) {
		Coffeeeetest coffeeeetest=new Coffeeeetest();
		
		coffeeeetest.coffeeee=Coffeeee.BIG;
		System.out.println(coffeeeetest.coffeeee.getLidCode());
	}
}
class Coffeeeetest{
	Coffeeee coffeeee;
}

