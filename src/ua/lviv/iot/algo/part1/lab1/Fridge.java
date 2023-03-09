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
    private static Fridge instance;

    public void turnOnDefrosing(){
        this.isDefrosing = true;
        System.out.println(getModel()+" is defrosing");
    }

    public void turnOffDefrosing(){
        this.isDefrosing = false;
        System.out.println(getModel()+" isn`t defrosing");
    }

    public void deleteModelInfo(){
        this.model = null;
    }
    public static Fridge getInstance(){
        if (instance == null){
            instance = new Fridge();
        }
        return instance;
    }

    public static void main(String[] args) {
        Fridge fridges[] = new Fridge[4];
        fridges[0] = new Fridge("Bosch","in132","20 l",true,'B');
        fridges[1] = new Fridge();
        fridges[2] = Fridge.getInstance();
        fridges[3] = Fridge.getInstance();
        int i = 0;
        while ( i < fridges.length) {
            System.out.println(fridges[i].toString());
            i += 1;
        }
    }
}