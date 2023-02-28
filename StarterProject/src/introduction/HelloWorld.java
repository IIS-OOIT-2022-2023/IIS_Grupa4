package introduction;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		
		int a = 5;
		int b = 6;
		
		if(a > b) {
			System.out.println("a je vece od b");
		}else if(a < b) {
			System.out.println("a je manje od b");

		}else {
			System.out.println("a i b su isti");
		}
		
		System.out.println("Hello world");
		
		for(int i=0;i<10;i++) {
				System.out.println(i);
		}
		
		//factoriel 5 while
		//5 = 5*4*3*2*1
		int factoriel = 1;
		int number = 5;
		while(number > 1) {
			factoriel*=number;
			number--;
		}
		System.out.println(factoriel);
	}

}
