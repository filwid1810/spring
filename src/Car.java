public class Car extends Vehicle {

    public Car(String brand, String model, int year, int price, boolean rented,String id ) {
        super( brand, model, year, price, rented,id );
    }

    @Override
    String toCSV(String id, String brand, String model, int year, double price, boolean rented) {
        return "CAR" + super.toCSV(id, brand, model, year, price, rented);
    }

    @Override
    public String toString() {
        return "CAR" + super.toString();
    }
}
