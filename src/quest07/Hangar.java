package quest07;

public class Hangar {

	public static void main(String[] args) {
		Car levante = new Car("Maserati");
		Boat yachtline = new Boat("Zodiac");
		
		System.out.println(levante.doStuff());
		System.out.println(yachtline.doStuff());

	}

}
