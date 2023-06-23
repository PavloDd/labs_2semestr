package ua.lviv.iot.algo.part1.lab2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class FridgeCamera extends Fridge {
    private final int numberOfEntrances;
    private final String typeOfTapeDrive;
    private final int maxTapeSpeedInMetersPerSec;
    private final int maxWeightTapeCanWithstand;
    private static int VOLUME_PER_KILOGRAM = 2;

    @Override
    public int getMaxUsableCapacity() {
        int capacity = this.maxWeightTapeCanWithstand / VOLUME_PER_KILOGRAM;
        return capacity;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ','
                + "numberOfEntrances" + ','
                + "typeOfTapeDrive" + ','
                + "maxTapeSpeedInMetersPerSec" + ','
                + "maxWeightTapeCanWithstand";
    }

    @Override
    public String getCSV() {
        return super.getCSV() + ','
                + getNumberOfEntrances() + ','
                + getTypeOfTapeDrive() + ','
                + getMaxTapeSpeedInMetersPerSec() + ','
                + getMaxWeightTapeCanWithstand();
    }

    public FridgeCamera(final String brand, final String model,
                        final String capacity, final boolean isDefrosing,
                        final char energyEfficiencyClass, final int numberOfEntrances,
                        final String typeOfTapeDrive, final int maxTapeSpeedInMetersPerSec,
                        final int maxWeightTapeCanWithstand) {
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
                + getNumberOfEntrances()
                + ", typeOfTapeDrive='"
                + getTypeOfTapeDrive()
                + '\''
                + ", maxTapeSpeedInMetersPerSec="
                + getMaxTapeSpeedInMetersPerSec()
                + ", maxWeightTapeCanWithstand="
                + getMaxWeightTapeCanWithstand()
                + ", brand='"
                + getBrand()
                + '\''
                + ", model='"
                + getModel()
                + '\''
                + ", capacity='"
                + getCapacity()
                + '\''
                + ", isDefrosing="
                + getIsDefrosing()
                + ", energyEfficiencyClass="
                + getEnergyEfficiencyClass()
                + '}';
    }
}
