package ua.lviv.iot.algo.part1.lab2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class FridgeCamera extends Fridge {
    private int numberOfEntrances = 1;
    private String typeOfTapeDrive;
    private int maxTapeSpeedInMetersPerSec;
    private int maxWeightTapeCanWithstand;
    private static int VOLUME_PER_KILOGRAM = 2;

    @Override
    public int getMaxUsableCapacity() {
        int capacity = this.maxWeightTapeCanWithstand / VOLUME_PER_KILOGRAM;
        return capacity;
    }

    public FridgeCamera(String brand, String model, String capacity, boolean isDefrosing, char energyEfficiencyClass, int numberOfEntrances, String typeOfTapeDrive, int maxTapeSpeedInMetersPerSec, int maxWeightTapeCanWithstand) {
        super(brand, model, capacity, isDefrosing, energyEfficiencyClass);
        this.numberOfEntrances = numberOfEntrances;
        this.typeOfTapeDrive = typeOfTapeDrive;
        this.maxTapeSpeedInMetersPerSec = maxTapeSpeedInMetersPerSec;
        this.maxWeightTapeCanWithstand = maxWeightTapeCanWithstand;
    }

    @Override
    public String toString() {
        return "FridgeCamera{"
                + "numberOfEntrances="
                + numberOfEntrances
                + ", typeOfTapeDrive='"
                + typeOfTapeDrive
                + '\''
                + ", maxTapeSpeedInMetersPerSec="
                + maxTapeSpeedInMetersPerSec
                + ", maxWeightTapeCanWithstand="
                + maxWeightTapeCanWithstand
                + ", brand='" + brand
                + '\''
                + ", model='" + model
                + '\''
                + ", capacity='"
                + capacity
                + '\''
                + ", isDefrosing="
                + isDefrosing
                + ", energyEfficiencyClass="
                + energyEfficiencyClass
                + '}';
    }
}
