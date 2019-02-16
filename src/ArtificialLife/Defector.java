package ArtificialLife;

public class Defector extends Organism {
  private String type;
  private double probability;

  public Defector() {
    super();
    this.type = "Defector";
    this.probability = 0;
  }

  @Override
  public String getType() {
    return this.type;
  }

  @Override
  public Organism reproduce() {
    return new Defector();
  }

  @Override
  public double getCooperationProbability() {
    return this.probability;
  }

  @Override
  public boolean cooperates() {
    return false;
  }

}
