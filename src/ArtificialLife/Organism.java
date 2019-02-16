package ArtificialLife;

public class Organism {

  // fields
  private int energy;

  // constructor
  public Organism() {
    this.energy = 0;
  }

  // methods
  public void update() {
    this.energy++;
  }

  public int getEnergy() {
    return this.energy;
  }

  public void incrementEnergy() {
    this.energy++;
  }

  public void decrementEnergy() throws Exception {
    if (this.energy <= 0) {
      throw new Exception("Energy cannot be negative: " + this.energy);
    }
    this.energy--;
  }

  public String getType() {
    return null;
  }

  public Organism reproduce() {
    return null;
  }

  public double getCooperationProbability() {
    return 0;
  }

  public boolean cooperates() {
    return false;
  }

  public void resetEnergy() {
    this.energy = 0;
  }
}
