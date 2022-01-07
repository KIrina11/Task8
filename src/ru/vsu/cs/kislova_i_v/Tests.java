package ru.vsu.cs.kislova_i_v;

import org.junit.*;
import ru.vsu.cs.util.ArrayUtils;

public class Tests {
    @BeforeClass
    public static void reportAboutStartOfTests() {
        System.out.println("Testing of the program begins...");
        System.out.println();
    }

    @Before
    public void reportOnTestOperation() {
        System.out.print("Test is running...");
    }

    @Test
    public void testWithIdenticalIntegers() {
        double[][] arrayInitial = ArrayUtils.readDoubleArray2FromFile("C:\\Users\\Ирина\\IdeaProjects"
                + "\\Task8_num18\\inputForTests\\testWithIdenticalIntegers.txt");
        int[][] arrayModified = SearchForNeighbors.searchForNeighborsAndFormModifiedArray(arrayInitial);
        int[][] resultArray = ArrayUtils.readIntArray2FromFile("C:\\Users\\Ирина\\IdeaProjects"
                + "\\Task8_num18\\outputForTests\\testWithIdenticalIntegers.txt");
        Assert.assertArrayEquals(arrayModified, resultArray);
    }

    @Test
    public void testWithIdenticalNonIntegers() {
        double[][] arrayInitial = ArrayUtils.readDoubleArray2FromFile("C:\\Users\\Ирина\\IdeaProjects"
                + "\\Task8_num18\\inputForTests\\testWithIdenticalNonIntegers.txt");
        int[][] arrayModified = SearchForNeighbors.searchForNeighborsAndFormModifiedArray(arrayInitial);
        int[][] resultArray = ArrayUtils.readIntArray2FromFile("C:\\Users\\Ирина\\IdeaProjects"
                + "\\Task8_num18\\outputForTests\\testWithIdenticalNonIntegers.txt");
        Assert.assertArrayEquals(arrayModified, resultArray);
    }

    @Test
    public void testWithNegativeDifferentNumbers() {
        double[][] arrayInitial = ArrayUtils.readDoubleArray2FromFile("C:\\Users\\Ирина\\IdeaProjects"
                + "\\Task8_num18\\inputForTests\\testWithNegativeDifferentNumbers.txt");
        int[][] arrayModified = SearchForNeighbors.searchForNeighborsAndFormModifiedArray(arrayInitial);
        int[][] resultArray = ArrayUtils.readIntArray2FromFile("C:\\Users\\Ирина\\IdeaProjects"
                + "\\Task8_num18\\outputForTests\\testWithNegativeDifferentNumbers.txt");
        Assert.assertArrayEquals(arrayModified, resultArray);
    }

    @Test
    public void testWithMinimumNumberOfDifferentElements() {
        double[][] arrayInitial = ArrayUtils.readDoubleArray2FromFile("C:\\Users\\Ирина\\IdeaProjects"
                + "\\Task8_num18\\inputForTests\\testWithMinimumNumberOfDifferentElements.txt");
        int[][] arrayModified = SearchForNeighbors.searchForNeighborsAndFormModifiedArray(arrayInitial);
        int[][] resultArray = ArrayUtils.readIntArray2FromFile("C:\\Users\\Ирина\\IdeaProjects"
                + "\\Task8_num18\\outputForTests\\testWithMinimumNumberOfDifferentElements.txt");
        Assert.assertArrayEquals(arrayModified, resultArray);
    }

    @Test
    public void testConsistingOfNonIntegersAndIntegersThatConsistOfSameDigit() {
        double[][] arrayInitial = ArrayUtils.readDoubleArray2FromFile("C:\\Users\\Ирина\\IdeaProjects"
                + "\\Task8_num18\\inputForTests"
                + "\\testConsistingOfNonIntegersAndIntegersThatConsistOfSameDigit.txt");
        int[][] arrayModified = SearchForNeighbors.searchForNeighborsAndFormModifiedArray(arrayInitial);
        int[][] resultArray = ArrayUtils.readIntArray2FromFile("C:\\Users\\Ирина\\IdeaProjects"
                + "\\Task8_num18\\outputForTests"
                + "\\testConsistingOfNonIntegersAndIntegersThatConsistOfSameDigit.txt");
        Assert.assertArrayEquals(arrayModified, resultArray);
    }

    @After
    public void reportCompletionOfTest() {
        System.out.println("Test execution completed");
    }

    @AfterClass
    public static void reportAboutEndOfTests() {
        System.out.println();
        System.out.print("Testing of the program is completed");
    }
}
