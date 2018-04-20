import java.util.*;

/** This is the parent Chromosome population
 * each parent has a number, set of DNA, fitness score, percentChance (that it is a "good fit" for MF),
 * and the probability it will be chosen from the wheel.
 */
public class Chromosome {
    public ArrayList<Double> parentDNA = new ArrayList<>();
    public int parentNumber = 0;
    public double fitness = 0;
    public double percentChance = 0;
    public double probability = 0;
    public int mate = 0;

    public Chromosome(){
        parentDNA = new ArrayList<>();
        parentNumber = 0;
        fitness = 0.0;
        percentChance = 0.0;
        probability = 0.0;
        mate = 0;


    }
    public Chromosome(ArrayList DNA, int pn){
        parentDNA = DNA;
        parentNumber = pn;
        fitness = 0.0;
        percentChance = 0.0;
        probability = 0.0;
        mate = 0;



    }
    public void incPN (){ parentNumber++;}
    public int getParentNumber() { return parentNumber; }


}
