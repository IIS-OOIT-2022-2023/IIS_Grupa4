package test;
import geometry.Line;
import geometry.Point;

public class TestGeometry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*implicitna konverzija je moguca sa kompatibilnim tipovima podataka
		kada se vrednost manjeg tipa podatka smesta u promenljivu veceg tipa podatka
		jer u ovom slucaju ne dolazi do gubitka informacija*/
		int intVar = 3;
		double doubleVar = 0.98;
		
		doubleVar = intVar;
		intVar = (int)doubleVar;

		String s = "1";
		int d = Integer.parseInt(s);

		boolean trueBool = true;
		boolean falseBool = false;

		//logicki operatori
		System.out.println(trueBool && falseBool); //false
		System.out.println(trueBool && !falseBool); //true
		System.out.println(trueBool || falseBool); //true
		System.out.println(trueBool ^ falseBool); //true
		
		//konkatenacija stringova
		String string1 = "ime ";
		String string2 = "prezime";
		System.out.println(string1+string2);

		/*objekat je instanca klase i ima sve osnobine i ponasanja koja su definisana u klasi
		modeluje objekat (entitet) realnog sistema
		predstavlja pojavu klase cijim je konstruktorom kreiran 
		objekat se instancira pozivom konstruktora klase (oprator new + poziv konstruktora)*/
		Point point = new Point(); 
		/*promenljiva point ukazuje na kreiran objekat, odnosno predstavlja referencu na objekat klase Point
		kada metodi za ispis prosledimo referencu dobijamo ispis
		<nazivPaketa>.<nazivKlase>@<hexAdresa>*/
		System.out.println(point); 

		/*direktan pristup atributu x promenljive point koja je tipa Point nije moguc jer atribut 
		x ove klase Point ima private specifikator pristupa*/
		//System.out.println(point.x);

		/*nakon instanciranja objekta, atributi primarnih tipova podataka kojima nije eksplicitno dodeljena vrednost
		implicitno dobijaju podrazumevane vrednosti za odgovarajuci tip podatka*/
		System.out.println(point.getX()); //podrazumevana vrednost za int je 0
		System.out.println(point.isSelected());// podrazumevana vrednost za boolean je false
		
		
		//get i set metode omogucavaju pristup privatnim atributima klase
		point.setX(10);
		System.out.println(point.getX());
		
		Point point2 = new Point(10,10);
		System.out.println("point2 iz main metode: " +point2);
		System.out.println("x=" + point2.getX() + ", y=" + point2.getY());
		
		Point point1 = new Point(20,20);
		System.out.println(point2.distance(point1));
		
		Line line = new Line();
		System.out.println(line);
		System.out.println(line.getStartPoint());
		
		System.out.println(line.length());
		
	}

}
