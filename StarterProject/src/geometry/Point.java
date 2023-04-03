package geometry;

/*klasa u Java programu jedinstveno odredjena specifikacijom koja sadrzi
naziv paketa i naziv klase geometry.Point
klasa - koncept o-o programskih jezika putem kojeg se modeluje klasa objekata realnog sistema
modeluje stanja i ponasanja objekata koji pripadaju datoj klasi objekata realnog sistema
sablon za kreiranje objekata
slozen tip podatka
*/
public class Point {
	/*atributi klase - modeluju stanje objekata
	inkapsulacija - skrivanje sadrzaja klase (od drugih klasa), ostvaruje se putem specifikatora pristupa
	specifikatori pristupa: private, protected, public*/
	private int x;
	private int y;
	private boolean selected; //getSelected -> isSelected
	/**
	 * Staticka polja koriste se da cuvaju vrednosti nekog obelezja koje je zajednicko za sve objekte
	 * te klase. Statickim metodama koja nisu javna pristupa se koriscenjem statickih metoda pristupa.
	 */
	private static int maxX  = 500;

	public static int getMaxX() {
		return maxX;
	}
	

	
	/*konstruktor - posebna metoda klase koja sluzi za instanciranje objekata
	poziv konstruktora vrsi kreiranje objekta na heap-u
	naziv konstruktora mora biti isti kao naziv klase u kojoj je definisan
	konstruktor nema specifiran tip povratne vrednosti (ni void)*/
	//Point []
	public Point() {
		
	}
	
	/*OVERLOADING - preklapanje naziva metoda, pridruzivanje istog naziva razlicitim metodama
	- metode se razlikuju po POTPISU
	POTPIS METODE = naziv + niz tipova podataka koji su pridruzeni parametrima metode
	- preklopljene metode moraju se razlikovati ili po broju parametara ili 
	po redosledu tipova podataka koji su pridruzeni parametrima, tj. razlikuju se po potpisu
	*/
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		//System.out.println("this iz konstruktora: " +this);
	}
	
	//this() - poziv konstruktora klase, MORA biti prva linija koda unutar konstruktora 
	public Point(int x, int y, boolean selected) {
		this(x, y);
		this.selected = selected;
	}
	
	/*metode klase - modeluju ponasanje objekata
	get i set metode obezbedjuju pristup privatnim obelezjima klase*/
	public void setX(int xCoord) {
		if(xCoord < 0) {
			System.out.println("Value must be positive");
		}else {
			this.x = xCoord;
		}
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public boolean isSelected() {
		return this.selected;
	}
	
	public double distance(Point point) {
		//dy dx -> dx*dx + dy*dy -> sqrt
		int dx = this.x - point.x;
		int dy = this.y - point.y;
		double result = Math.sqrt(dx*dx + dy*dy);
		return result;
	}
	
	public double distance(int x, int y) {
		//dy dx -> dx*dx + dy*dy -> sqrt
		int dx = this.x - x;
		int dy = this.y - y;
		double result = Math.sqrt(dx*dx + dy*dy);
		return result;
	}
	
	public boolean contains(int x, int y) {
		return this.distance(new Point(x, y)) <= 2;
	}
	
	public boolean contains(Point click) {
		return this.distance(click) <= 2;
	}
	
	/*overriding - redefinisanje metoda 
	- toString i equals metode definisane su u klasi Object, redefinisemo ih za objekte klase Point
	*/
	@Override //anotacija u Javi, nije obavezna, ali je dobra praksa navoditi je kada se vrsi redefinisanje
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			//downcast - kastovanje objekta iz objekta natklase u objekat potklase
			Point pom = (Point)obj;
			return (this.x == pom.x && this.y == pom.y);
		}else {
			return false;
		}
	}
	
	/*
	 * Staticke metode se pozivaju nad klasom, nije potrebno kreirati objekat.
	 * Primer staticke metode je metoda sqrt klase Math.
	 * */
	public static void staticMethod() {
		System.out.println("Staticka metoda");
	}
	

}
