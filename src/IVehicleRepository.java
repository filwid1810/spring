import java.util.List;

public interface IVehicleRepository {
    boolean rentVehicle(String id);
    boolean returnVehicle(String id);
    List<Vehicle> getVehicles();
    void save(String filePath);
    void load(String filePath);

}
