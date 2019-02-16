package ArtificialLife;

public class PartialCooperator extends Organism {
  private String type;
  private double probability;

  public PartialCooperator() {
    super();
    this.type = "PartialCooperator";
    this.probability = .5;
  }

  @Override
  public String getType() {
    return this.type;
  }

  @Override
  public Organism reproduce() {
    return new PartialCooperator();
  }

  @Override
  public double getCooperationProbability() {
    return this.probability;
  }

  @Override
  public boolean cooperates() {
    double random = Math.random();
    if (this.probability > random) {
      return true;
    }
    return false;
  }
}
