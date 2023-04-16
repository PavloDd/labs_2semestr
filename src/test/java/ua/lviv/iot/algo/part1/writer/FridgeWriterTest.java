package ua.lviv.iot.algo.part1.writer;

import org.junit.jupiter.api.*;
import ua.lviv.iot.algo.part1.lab2.Fridge;
import ua.lviv.iot.algo.part1.lab2.FridgeCamera;
import ua.lviv.iot.algo.part1.lab2.MedicalRefrigerator;
import ua.lviv.iot.algo.part1.lab2.WineFridge;

import java.io.IOException;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;


class FridgeWriterTest {
    private FridgeWriter writer;
    private List <Fridge> fridges;
    public static final String RESULT_FILENAME = "C:\\Users\\Lenovo\\labs_2semestr\\labs_2semestr\\result.csv";
    public static final String EXPECTED_FILENAME = "C:\\Users\\Lenovo\\labs_2semestr\\labs_2semestr\\expected.csv";
    private File actual;
    private final File expected = new File (EXPECTED_FILENAME);


    @BeforeEach
    public void setUp() {
        writer = new FridgeWriter();
        fridges = new LinkedList<>();
        File actual = new File(RESULT_FILENAME);
        Fridge fridge0 = new WineFridge("Bosch","AA12","22l",false,'A',10, 3);
        Fridge fridge1 = new WineFridge("Samsung","BB12","23l",false,'B',11, 2);
        Fridge fridge2 = new FridgeCamera("bosch","aa","22l", false, 'A',2, "mechanic", 2, 4);
        Fridge fridge3 = new MedicalRefrigerator("EmFridge", "LK52", "25l", false, 'A', 200, 50 );
        Fridge fridge4 = new FridgeCamera ("bosch","aa","22l", false, 'A',2, "mechanic", 2, 4);
        fridges.add(fridge0);
        fridges.add(fridge1);
        fridges.add(fridge2);
        fridges.add(fridge3);
        fridges.add(fridge4);
  }
   @Test
   void testEmptyWrite() {
        File file = new File(RESULT_FILENAME);
        writer.write(fridges);
        Assertions.assertTrue(file.exists());
   }

   @Test
   void testWriteListOfFridges() throws IOException {
       Path expected = new File(RESULT_FILENAME).toPath();
       Path actual = new File (EXPECTED_FILENAME).toPath();
       var mismatchResult = Files.mismatch(actual, expected);
       Assertions.assertEquals(-1L, mismatchResult);
   }
//    @AfterAll
//    public static void tearDown() throws IOException {
//        Files.deleteIfExists(Path.of(EXPECTED_FILENAME));
//  }
}