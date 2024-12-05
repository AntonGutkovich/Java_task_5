package app;
import vehicles.ElectricCar;
import vehicles.Car;

public class TestCar {
    public static void main(String[] args) {
        Car common_car = new Car("AntonCar", "outdated", "green", 2006, "Anton", 12345, "Gasoline");
        ElectricCar common_el_car = new ElectricCar("AmogusCar", "susy", "red", 2022, "Amogus", 654321, "Electric", 220);
        common_car.setYear(207);
        common_car.setOwnerName("Anton1");
        common_el_car.setYear(2023);
        common_el_car.setOwnerName("Imposter");
        common_car.setInsuranceNumber(123457);
        common_el_car.setInsuranceNumber(654320);
        common_el_car.setBatteryCapacity(200);
        System.out.println(common_el_car.getBatteryCapacity());
        common_car.toString();
        common_el_car.toString();
    }
}
