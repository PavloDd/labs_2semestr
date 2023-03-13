package ua.lviv.iot.algo.part1.lab1;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Fridge {
    private String brand;
    private String model;
    private String capacity;
    private boolean isDefrosing;
    private char energyEfficiencyClass;
    private static ua.lviv.iot.algo.part1.lab1.Fridge instance;
    public void turnOnDefrosing(){
        this.isDefrosing = true;
    }

    public void turnOffDefrosing(){
        this.isDefrosing = false;
    }

    public void deleteModelInfo(){
        this.model = null;
    }

    public static ua.lviv.iot.algo.part1.lab1.Fridge getInstance(){
        if (instance == null){
            instance = new ua.lviv.iot.algo.part1.lab1.Fridge();
        }
        return instance;
    }

    public static void main(String[] args) {

        ua.lviv.iot.algo.part1.lab1.Fridge fridges[] = {new ua.lviv.iot.algo.part1.lab1.Fridge("Bosch","in132","20 l",true,'B'), new ua.lviv.iot.algo.part1.lab1.Fridge(), ua.lviv.iot.algo.part1.lab1.Fridge.getInstance(), ua.lviv.iot.algo.part1.lab1.Fridge.getInstance()};
        for (ua.lviv.iot.algo.part1.lab1.Fridge value : fridges){
            System.out.println(value.toString());
        }
    }
}