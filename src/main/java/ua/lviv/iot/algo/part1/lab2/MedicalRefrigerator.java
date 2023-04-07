package ua.lviv.iot.algo.part1.lab2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter



public class MedicalRefrigerator extends Fridge {
    private int capacityInTestTubes;
    private int capacityOfTestTubeInMl;

    @Override
    public int getMaxUsableCapacity() {
        int capacity = this.capacityInTestTubes * this.capacityOfTestTubeInMl;
        return capacity;
    }

    public MedicalRefrigerator(String brand, String model, String capacity, boolean isDefrosing, char energyEfficiencyClass, int capacityInTestTubes, int capacityOfTestTubeInMl) {
        super(brand, model, capacity, isDefrosing, energyEfficiencyClass);
        this.capacityInTestTubes = capacityInTestTubes;
        this.capacityOfTestTubeInMl = capacityOfTestTubeInMl;
    }

    @Override
    public String toString() {
        return "MedicalRefrigerator{" +
                "capacityInTestTubes=" + capacityInTestTubes +
                ", capacityOfTestTubeInMl=" + capacityOfTestTubeInMl +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", capacity='" + capacity + '\'' +
                ", isDefrosing=" + isDefrosing +
                ", energyEfficiencyClass=" + energyEfficiencyClass +
                '}';
    }
}
