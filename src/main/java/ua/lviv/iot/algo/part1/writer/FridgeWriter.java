package ua.lviv.iot.algo.part1.writer;

import ua.lviv.iot.algo.part1.lab2.Fridge;
import ua.lviv.iot.algo.part1.lab2.FridgeCamera;
import ua.lviv.iot.algo.part1.lab2.MedicalRefrigerator;
import ua.lviv.iot.algo.part1.lab2.WineFridge;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class FridgeWriter {
    public static String write(List<Fridge> fridges) {
        String defaultFileName = "result.csv";
        if (fridges == null || fridges.isEmpty()) {
            return null;
        }
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(defaultFileName));
            for (Fridge fridge : fridges) {
                writer.write(fridge.getHeaders() + "\n");
                writer.write(fridge.getCSV() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return defaultFileName;
    }
        public static void main(String[] args)  {
        List <Fridge> fridges = new LinkedList<>();
        Fridge fridge0 = new WineFridge("Bosch","AA12","22l",false,'A',10, 3);
        Fridge fridge1 = new WineFridge("Samsung","BB12","23l",false,'B',11, 2);
        Fridge fridge2 = new FridgeCamera ("bosch","aa","22l", false, 'A',2, "mechanic", 2, 4);
        Fridge fridge3 = new MedicalRefrigerator("EmFridge", "LK52", "25l", false, 'A', 200, 50 );
        Fridge fridge4 = new FridgeCamera ("bosch","aa","22l", false, 'A',2, "mechanic", 2, 4);

        fridges.add(fridge0);
        fridges.add(fridge1);
        fridges.add(fridge2);
        fridges.add(fridge3);
        fridges.add(fridge4);
        write(fridges);

        }

//        String defaultFileName = "result.csv";
//        try (FileWriter writer = new FileWriter(defaultFileName);) {
//            for (Fridge fridge : fridges) {
//                try {
//                    writer.write(fridge.getHeaders());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            return defaultFileName;
//    }
//    }
}
