package fr.ilyess.classes;


public class Main {
	
	public static void main(String[] args) {
		Human ilyess = new Human();
		Human aymen = new Human(16,80,"Vitry");
		System.out.println(ilyess.age + aymen.age);
		ilyess.marche();
		
	}
}
