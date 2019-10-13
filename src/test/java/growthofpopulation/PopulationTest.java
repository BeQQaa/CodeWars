package growthofpopulation;

import org.junit.Test;

import static org.junit.Assert.*;

public class PopulationTest {

    private Population population = new Population();
    @Test
    public void nbPopulation() {
        assertEquals(population.nbPopulation(1500, 5,100, 5000), 15);
        assertEquals(population.nbPopulation(1500000, 2.5,10000, 2000000), 10);
        assertEquals(population.nbPopulation(1500000, 0.25,1000, 2000000), 94);
    }
}