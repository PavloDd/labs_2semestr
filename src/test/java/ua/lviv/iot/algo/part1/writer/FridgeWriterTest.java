package ua.lviv.iot.algo.part1.writer;

import org.junit.jupiter.api.*;
import ua.lviv.iot.algo.part1.lab2.*;

import java.io.IOException;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import java.nio.file.Paths;

class FridgeWriterTest {

    private FridgeManager fridgeManager = new FridgeManager();
    private FridgeWriter writer = new FridgeWriter();
    private List<Fridge> fridgesNonSorted;
    private List<Fridge> fridges;
    public static final String RESULT_FILENAME = "result.csv";
    public static final String EXPECTED_FILENAME = "expected.csv";
    private final File actual = new File(RESULT_FILENAME);

    @BeforeEach
    public void setUp() {
        writer = new FridgeWriter();
        fridgesNonSorted = new LinkedList<>(
                List.of(
                        new WineFridge("Bosch", "AA12", "22l", false, 'A', 10, 3),
                        new WineFridge("Samsung", "BB12", "23l", false, 'B', 11, 2),
                        new FridgeCamera("bosch", "aa", "22l", false, 'A', 2, "mechanic", 2, 4),
                        new MedicalRefrigerator("EmFridge", "LK52", "25l", false, 'A', 200, 50),
                        new FridgeCamera("bosch", "aa", "22l", false, 'A', 2, "mechanic", 2, 4)
                )
        );
        fridgeManager.sortFridgesByClass(fridgesNonSorted);
    }

    @AfterAll
    public static void tearDown() throws IOException {
        Files.deleteIfExists(Path.of(RESULT_FILENAME));
    }

    @Test
    public void testListIsNull() {
        FridgeWriter.write(null, RESULT_FILENAME);
        Assertions.assertFalse(actual.exists());
    }

    @Test
    public void testListIsEmpty(){
        fridges = new LinkedList<>();
        FridgeWriter.write(fridges, RESULT_FILENAME);
        Assertions.assertFalse(actual.exists());
    }

    @Test
    public void testWriteListOfFridgesForSorted() throws IOException {

        FridgeWriter.write(fridges, RESULT_FILENAME);
        List<String> actualLines = Files.readAllLines(Paths.get(RESULT_FILENAME));
        List<String> expectedLines = Files.readAllLines(Paths.get(EXPECTED_FILENAME));

        Assertions.assertEquals(expectedLines, actualLines);
    }

}