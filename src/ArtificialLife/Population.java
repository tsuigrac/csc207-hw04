package ArtificialLife;

import java.util.ArrayList;

public class Population {
  private Pair<String, Integer>[] pairs;
  private ArrayList<Organism> organisms;

  public Population(Pair<String, Integer>[] counts) throws IllegalArgumentException {
    this.pairs = counts;
    System.out.println("Adding organisms");
    organisms = new ArrayList<Organism>();

    // Store info of organisms in ArrayList organisms
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

      // Bonus constructing a grid of 10 * 10 organisms
      // Construct an array of index of organisms in the grid around the current organism

      int topIndex = (i + 90) % 100;
      int topLeftIndex = (topIndex + 9) % 10 + topIndex / 10 * 10;
      int topRightIndex = (topIndex + 11) % 10 + topIndex / 10 * 10;
      int bottomIndex = (i + 110) % 100;
      int bottomLeftIndex = (bottomIndex + 9) % 10 + bottomIndex / 10 * 10;
      int bottomRightIndex = (bottomIndex + 11) % 10 + bottomIndex / 10 * 10;
      int leftIndex = (i + 9) % 10 + i / 10 * 10;
      int rightIndex = (i + 11) % 10 + i / 10 * 10;
      int[] gridIndex = {topIndex, topLeftIndex, topRightIndex, bottomIndex, bottomLeftIndex,
          bottomRightIndex, leftIndex, rightIndex};

      if (current.cooperates()) {

        // Bonus cooperation costs-benefits
        // Setting 1
        // for (int k = 0; k < current.getEnergy(); k++) {
        // current.decrementEnergy();
        // for (int j = 0; j < 8; j++) {
        // int random = (int) (Math.random() * organisms.size());
        // organisms.get(random).incrementEnergy();
        // }
        // } // EndSetting 1

        // Setting 2
        // current.decrementEnergy();
        // int reps = (int) (Math.random() * 3);
        // for (int j = 0; j < 8 - reps; j++) {
        // int random = (int) (Math.random() * organisms.size());
        // organisms.get(random).incrementEnergy();
        // } // EndSetting 2
        // }

        current.decrementEnergy();


        for (int j = 0; j < 8; j++) {
          organisms.get(gridIndex[j]).incrementEnergy();
        }
      }

      // checks if Organism can reproduce and if so, reproduce
      if (current.getEnergy() >= 10) {
        /*
         * int random = (int) (Math.random() * organisms.size()); Organism removed =
         * organisms.get(random);
         */
        current.resetEnergy();
        Organism removed = organisms.get(0);
        int indexRemoved = 0;
        // Check to find the lowest energy organism in the grid
        for (int j = 0; j < 8; j++) {
          if (removed.getEnergy() > organisms.get(gridIndex[j]).getEnergy()) {
            removed = organisms.get(gridIndex[j]);
            indexRemoved = gridIndex[j];
          } // endif

        } // endfor (determined which organism to remove)

        // Increment offspring organism count
        Organism offspring = current.reproduce();
        if (offspring.getType().equals("Cooperator")) {
          pairs[0].right++;
        } else if (offspring.getType().equals("Defector")) {
          pairs[1].right++;
        } else {
          pairs[2].right++;
        }

        // Decrement removed organism count
        if (removed.getType().equals("Cooperator")) {
          pairs[0].right--;
        } else if (removed.getType().equals("Defector")) {
          pairs[1].right--;
        } else {
          pairs[2].right--;
        } // endif
        
        // Replace the lowest energy organism with offspring
        organisms.set(indexRemoved, offspring);

      } // endif
    } //endfor
  } // update


  /**
   * iterates through organisms and takes the average of all cooperation probabilities
   * 
   * @return average cooperation mean of all organisms
   */
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
