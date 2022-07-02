public class CoffeeSize {

	//enum Coffee{ BIG,HUGE,OVERWHELMING};
	
    //Coffee coffeeSize;
	
	public static void main(String[] args) {
		CoffeeTest coffeeSize=new CoffeeTest();
		coffeeSize.coffeeSize=CoffeeTest.Coffee.BIG;
		System.out.println(coffeeSize.coffeeSize);
	}
}
//enum Coffee{ BIG,HUGE,OVERWHELMING};

class CoffeeTest{
	enum Coffee{ BIG,HUGE,OVERWHELMING};
	
	Coffee coffeeSize;
}

