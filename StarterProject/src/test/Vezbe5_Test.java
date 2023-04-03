package test;

import geometry.*;

public class Vezbe5_Test {
	/*
	 * Main metoda je UVEK staticka jer u trenutku pokretanja programa
	 * u operativnoj memoriji ne postoji kreirat niti jedan objekat bilo
	 * koje klase. 
	 * */
	public static void main(String[] args) {
		Donut donut = new Donut();
		System.out.println(donut.toString());
		/*
		 * Centar kreiranog donut-a nije null jer se u podrazumevanom konstruktoru klase Circle
		 * koju nasledjuje klasa Donut center inicijalizuje pozivom podrazumevanog konstruktora. 
		 * Prilikom kreiranja objekta klase Donut implicitno se poziva konstruktor natklase Circle.
		 * */
		System.out.println(donut.getCenter());
		System.out.println(donut.getRadius());
		
		/*
		 * Referenca tipa Donut je instanca tipa svih klasa koje prosiruje
		 * U Javi ne postoji visestruko nasledjivanje, odnosno jedna klasa moze eksplicito da 
		 * nasledjuje samo jednu klasu.
		 * 
		 * Kada se nad objektom pozove metoda, interpeter ce traziti implementaciju metode u 
		 * klasi cijim konstruktorom je promenljiva inicijalizovana. Ukoliko u toj klasi ne pronadje
		 * implementaciju, trazice je u natklasi (u slucaju Donut klase to je Circle), i nastaviti trazenje
		 * u hijerarhiji natklasa (poslednja klasa u hijerarhiji natklasa je uvek klasa Object).
		 * Redosled trazenja implementacije metoda je od dna ka vrhu hijerarhije nasledjivanja.
		 * 
		 * Kada se kreira objekat klase, implicitno se pozivaju konstruktori svih natklasa.
		 * Implicitno se pozivaju podrazumevani konstruktori natklasa, ukoliko ih nema u natklasi,
		 * kompajler prijavljuje gresku. Prvo se poziva konstruktor klase na vrhu hijerarhije nasledjivanja, 
		 * u slucaju promenljive koja se instancira pozivom konstruktora Donut klase, najpre se poziva
		 * konstruktor klase Object, pa Circle i na kraju Donut.  
		 * Redosled izvrsavanja konstruktora je od vrha ka dnu hijerarnije nasledjivanja.
		 * 
		 * */
		if(donut instanceof Donut) {
			System.out.println("donut je instanca tipa Donut");
		}
		if(donut instanceof Circle) {
			System.out.println("donut je instanca tipa Circle");
		}
		if(donut instanceof Object) {
			System.out.println("donut je instanca tipa Object");
		}
		
		Donut d1 = new Donut(new Point(10,10), 10, 5);
		Donut d2 = new Donut(new Point(10,10), 10, 5);
		
		if(d1.equals(d2)) {
			System.out.println("d1 i d2 su isti po vrednosti");
		}
		if(d1 == d2) {
			System.out.println("d1 i d2 ukazuju na isti objekat");
		}
		

		Point p = new Point();
		p.equals(new Point(10,10));
		Point.staticMethod();
		
	}
}
