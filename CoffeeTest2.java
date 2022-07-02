
class CoffeeTest2 
{
	
	Coffee2 coffee2;
	
	public static void main(String[] args) {
		CoffeeTest2 coffeeTest2=new CoffeeTest2();
		coffeeTest2.coffee2=Coffee2.BIG;
		System.out.println(coffeeTest2.coffee2.getOunces());
	}
}
