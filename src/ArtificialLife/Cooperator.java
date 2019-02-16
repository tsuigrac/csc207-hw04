package ArtificialLife;

public class Cooperator extends Organism {
  private String type;
  private double probability;

  public Cooperator() {
    super();
    this.type = "Cooperator";
    this.probability = 1;
  }

  @Override
  public String getType() {
    return this.type;
  }

  @Override
  public Organism reproduce() {
    return new Cooperator();
  }

  @Override
  public double getCooperationProbability() {
    return this.probability;
  }

  @Override
  public boolean cooperates() {
    return true;
  }
}
