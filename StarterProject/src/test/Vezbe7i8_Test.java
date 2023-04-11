package test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

import geometry.*;

public class Vezbe7i8_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape point = new Point();
		
		/*INTERFEJS
		 - mehanizam za postizanje potpune apstrakcije i "visestrukog nasledjivanja"
		 - ugovor o ponasanju objekata klase koja ga implementira (kako komunicirati sa objektom) 
		 - nemaju konstruktore i ne mogu se instancirati, ali se mogu deklarisati
		 promenljive tipa interfejsa
		*/

		/*deklaracija promenljive tipom interfejsa (za instanciranje se koristi konstruktor
		klase koja implementira interfejs):*/
		Moveable movePoint = new Point();
		
		/*KOLEKCIJE 
		- skladistenje vise podataka istog tipa u memoriji
		- mogu biti:
		STATICKE -> velicina kolekcije je fiksna i unapred poznata
		DINAMICKE -> dinamicki se alocira memorija, promenljiva velicina kolekcije
		*/

		/*NIZOVI
		- staticke kolekcije -> prilikom inicijalizacije potrebno je definisati duzinu niza
		i jednom definisana duzina se ne moze promeniti
		*/
		Point[] points = new Point[5];
		points[0] = new Point(40, 40);
		points[1] = new Point(20, 20);
		points[2] = new Point(10, 10);
		points[3] = new Point(50, 50);
		points[4] = new Point(30, 30);

		System.out.println("Ispis nesortiranog niza:");
		for(int i=0; i<points.length; i++) {
			System.out.println(points[i]);
		}


		/*SORTIRANJE KOLEKCIJE
		- Arrays klasa je Java klasa util paketa i poseduje STATICKU metodu sort koja sortira kolekciju
		- u kolekciji koja se sortira MORAJU da se nalaze podaci tipa koji MORA da implementira
		java Comparable interfejs, odnosno compareTo metodu
		- poziv sort metode u pozadini poziva compareTo metodu
		*/
		Arrays.sort(points);

		System.out.println("Ispis sortiranog niza:");
		for(int i=0; i<points.length; i++) {
			System.out.println(points[i]);
		}

		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Point(10,10));
		shapes.add(new Circle(new Point(20,20),20));
		shapes.add(new Line(new Point(30,30), new Point(40,40)));
		shapes.add(new Rectangle(new Point(25,25), 20, 20));
		
		Iterator<Shape> it = shapes.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		//REFERENTNI TIPOVI 
		Point center = new Point(10,10);
		Circle circle = new Circle(center, 20);
		center.setX(50);
		System.out.println(circle.getCenter().getX());

		changeReferenceType(center);
		System.out.println(center.getY());

		changeValueType(center.getY());
		System.out.println(center.getY());
		
		//HASH MAPE
		
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("it17", "natalija");
		hashMap.put("it18", "aleksandar");
		
		System.out.println(hashMap.get("it18"));
		hashMap.put("it18", "petar");
		System.out.println(hashMap.get("it18"));
		hashMap.remove("it18");
		System.out.println(hashMap.get("it18"));
		
		Circle null_center = new Circle(null, 10);
		Shape[] shapesArray = new Shape[1];
		
		try {
			Integer.parseInt("pet");
			System.out.println(shapesArray[2]);
			System.out.println(null_center.getCenter().getX());
			System.out.println("Ispis u try bloku nakon izuzetka");
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException");
		}catch(NullPointerException e) {
			System.out.println("NullPointerException");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		finally {
			System.out.println("Ispis u finally bloku");
		}
		System.out.println("Ispis nakon izuzetka");
		
		
		Circle c = new Circle(new Point(10,10), 30);
		try {
			c.setRadius(-2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Ispis nakon circle izuzetka");
		
		
		//SWITCH

		String day = "5";

		switch(day) {
		case "1":
			System.out.println("Monday");
			break;
		case "2":
			System.out.println("Tuesday");
			break;
		case "3":
			System.out.println("Wednesday");
			break;
		case "4":
			System.out.println("Thursday");
			break;
		default:
			System.out.println("Default case");
		}
		
		for(int i=0; i<10; i++) {
			if(i % 2 == 0)
				continue;
			System.out.println(i);
			if(i > 5)
				break;
		}
		
		
	}
	
	public static void changeReferenceType(Point p) {
		p.setY(50);
	}

	public static void changeValueType(int y) {
		y = 10;
	}

}
