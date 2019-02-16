package ArtificialLife;

import java.util.ArrayList;

public class Population {
  private Pair<String, Integer>[] pairs;
  private ArrayList<Organism> organisms;

  public Population(Pair<String, Integer>[] counts) throws IllegalArgumentException {
    this.pairs = counts;
    System.out.println("Adding organisms");
    organisms = new ArrayList<Organism>();
    
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < pairs[i].getRight(); j++) {
        if (i == 0) {
          organisms.add(new Cooperator());
        } else if (i == 1) {
          organisms.add(new Defector());
        } else {
          organisms.add(new PartialCooperator());
        }
      }
    }
  }

  public void update() throws Exception {
    for (int i = 0; i < organisms.size(); i++) {
      Organism current = organisms.get(i);
      current.update();
      if (current.cooperates()) {
        current.decrementEnergy();
        for (int j = 0; j < 8; j++) {
          int random = (int) (Math.random() * organisms.size());
          organisms.get(random).incrementEnergy();
        }
      }
      if (current.getEnergy() >= 10) {
        int random = (int) (Math.random() * organisms.size());
        current.resetEnergy();
        Organism removed = organisms.get(random);
        Organism offspring = current.reproduce();
        if (offspring.getType().equals("Cooperator")) {
          pairs[0].right++;
        } else if (offspring.getType().equals("Defector")) {
          pairs[1].right++;
        } else {
          pairs[2].right++;
        }

        if (removed.getType().equals("Cooperator")) {
          pairs[0].right--;
        } else if (removed.getType().equals("Defector")) {
          pairs[1].right--;
        } else {
          pairs[2].right--;
        }
        organisms.remove(random);
        organisms.add(random, current.reproduce());
      }
    }
  }

  public double calculateCooperationMean() {
    double total = 0;
    for (int i = 0; i < organisms.size(); i++) {
      total += organisms.get(i).getCooperationProbability();
    }
    return total / organisms.size();
  }

  public Pair<String, Integer>[] getPopulationCounts() {
    return pairs;
  }


}
