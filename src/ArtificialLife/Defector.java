package ArtificialLife;

public class Defector extends Organism {

  // +--------+-------------------------------------------------------
  // | Fields |
  // +--------+

  private String type;
  private double probability;


  // +--------------+-------------------------------------------------
  // | Constructors |
  // +--------------+

  public Defector() {
    super();
    this.type = "Defector";
    this.probability = 0;
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
      return new Cooperator();
    }
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
