package ua.lviv.iot.algo.part1.lab2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public abstract class Fridge {
    protected String brand;
    protected String model;
    protected String capacity;
    protected boolean isDefrosing;
    protected char energyEfficiencyClass;

    public int getMaxUsableCapacity(){
        return 0;
    };

    public void turnOnDefrosing(){
        this.isDefrosing = true;
    };

    public void turnOffDefrosing(){
        this.isDefrosing = false;
    };

    public void deleteModelInfo(){
        this.model = null;
    };

    public String toString() {
        return "Fridge(brand=" + this.getBrand() + ", model=" + this.getModel() + ", capacity=" + this.getCapacity() + ", isDefrosing=" + this.isDefrosing() + ", energyEfficiencyClass=" + this.getEnergyEfficiencyClass() + ")";
    }
}