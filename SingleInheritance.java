 class Car{
	public void display() {
		System.out.println("bmw");
	}
}
class Bike extends Car {
	public void brand() {
		System.out.println("hero");
	}

}
public class SingleInheritance {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.display();
		b.brand();
		

	}

}
