package cwiczenie1;

public class Car {
	
	String brand;
	boolean isNew;
	int milleage;
	double price;

	public static void main(String[] args) {
		
		Car car = new Car();
		car.brand = "Prosche";
		car.isNew = true;
		car.milleage = 100;
		car.price = 1000000;
		
		car.daneauta();
		
	}
	void daneauta(){
		System.out.println("Marka:" + brand);
		System.out.println("Nowy:" + isNew);
		System.out.println("Przebieg:" + milleage);
		System.out.println("Cena:" + price);
	}

}
