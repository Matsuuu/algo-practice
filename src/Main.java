import DataRandomizer.Randomizer;
import Graphics.BarGraph;
import InsertionSort.InsertionSorter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> randomData = Randomizer.getRandomData(100);

        BarGraph graph = new BarGraph();
        System.out.println(randomData);
        InsertionSorter sorter = new InsertionSorter(graph, randomData);
        sorter.sortData();

    }
}
