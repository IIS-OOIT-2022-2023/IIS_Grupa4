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
	
	/*konstruktor - posebna metoda klase koja sluzi za instanciranje objekata
	poziv konstruktora vrsi kreiranje objekta na heap-u
	naziv konstruktora mora biti isti kao naziv klase u kojoj je definisan
	konstruktor nema specifiran tip povratne vrednosti (ni void)*/
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("this iz konstruktora: " +this);
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

}
