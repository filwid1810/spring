public class Motorcycle extends Vehicle {
    String category;

    public Motorcycle( String id,String brand, String model, int year, Double price, boolean rented, String category) {
        super(brand, model, year, price, rented, id);
        this.category = category;
    }

    @Override
    String toCSV(String id, String brand, String model, int year, double price, boolean rented) {
        return "MOTORCYCLE" + super.toCSV(id, brand, model, year, price, rented)+ category;
    }

    @Override
    public String toString() {
        return "MOTORCYCLE" + super.toString()+ category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
