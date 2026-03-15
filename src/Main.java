import java.util.List;

public class Main {
    public static void main(String[] args) {

        IVehicleRepository repo = new VehicleRepositoryImpl();

        System.out.println("Stan początkowy:\n");

        displayVehicles(repo.getVehicles());

        List<Vehicle> currentVehicles = repo.getVehicles();


        String testId = currentVehicles.getFirst().getId();

        boolean rentResult = repo.rentVehicle(testId);
        if (rentResult) {
            System.out.println("Pojazd został wypożyczony");
        } else {
            System.out.println("Nie udało się wypożyczyć pojazdu");
        }

        System.out.println("Stan po wypożyczeniu:");
        displayVehicles(repo.getVehicles());

        boolean returnResult = repo.returnVehicle(testId);
        if (returnResult) {
            System.out.println("Pojazd został zwrócony");
        } else {
            System.out.println("Nie udało się zwrócić pojazdu");
        }

        System.out.println("Stan po zwrocie:");
        displayVehicles(repo.getVehicles());

    }

    private static void displayVehicles(List<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            System.out.println(v.toString());
        }
    }
}