package ArtificialLife;

public class Cooperator extends Organism {


  // +--------+-------------------------------------------------------
  // | Fields |
  // +--------+

  private String type;
  private double probability;


  // +--------------+-------------------------------------------------
  // | Constructors |
  // +--------------+

  public Cooperator() {
    super();
    this.type = "Cooperator";
    this.probability = 1;
  }

  // +---------+------------------------------------------------------
  // | Methods |
  // +---------+

  @Override
  public String getType() {
    return this.type;
  }

  /**
   * return new Organism with a 10% possibility of mutation
   * 
   * @return new Organism
   */
  @Override
  public Organism reproduce() {
    double random = Math.random();
    if (random < 0.05) {
      return new PartialCooperator();
    } else if (random > 0.95) {
      return new Defector();
    }
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
