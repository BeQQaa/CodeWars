package growthofpopulation;

class Population {

    int nbPopulation(int p0, double percent, int aug, int p){
        int years = 0;
        while (p > p0){
            p0 = (int) (p0 + (p0 / 100 * percent) + aug);
            years++;
        }
        return years;
    }
}
