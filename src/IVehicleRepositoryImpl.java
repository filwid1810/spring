import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class IVehicleRepositoryImpl implements IVehicleRepository {
    List<Vehicle> vehicles;

    @Override
    public boolean rentVehicle(String id) {
        return false;
    }

    @Override
    public boolean returnVehicle(String id) {
        return false;
    }

    @Override
    public final List<Vehicle> getVehicles() {
        return List.of();
    }

    @Override
    public void save(String filePath) {

    }

    @Override
    public void load(String filePath) {
        try{
            File file = new File(filePath);
            Scanner scannerf = new Scanner(file);

            while (scannerf.hasNextLine()){
                String line = scannerf.nextLine();
                System.out.println(line);
            }
            String line = scannerf.nextLine();
            String[] split = line.split(";");
            String type = split[0];
            Vehicle cur;

            if(type.equals("MOTORCYCLE")){
                cur = new Motorcycle(split[1], split[2],split[3],Integer.parseInt(split[4]) , Double.parseDouble(split[5]), Boolean.parseBoolean(split[6]), split[7]);
            vehicles.add(cur);
            }
            else if(type.equals("CAR")){
               // cur = new Car(split[1],split[2],split[3])
            }
            scannerf.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }

}
