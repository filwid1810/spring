import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

    IVehicleRepositoryImpl vehicleRepository = new IVehicleRepositoryImpl();
    vehicleRepository.read("vehicles.txt");

    }
}