package ArtificialLife;

public class PartialCooperator extends Organism {


  // +--------+-------------------------------------------------------
  // | Fields |
  // +--------+

  private String type;
  private double probability;


  // +--------------+-------------------------------------------------
  // | Constructors |
  // +--------------+

  public PartialCooperator() {
    super();
    this.type = "PartialCooperator";
    this.probability = .5;
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
      return new Defector();
    } else if (random > 0.95) {
      return new Cooperator();
    }
    return new PartialCooperator();
  }

  @Override
  public double getCooperationProbability() {
    return this.probability;
  }

  /**
   * returns true if this cooperates
   * 
   * @return boolean (50% false, 50% true)
   */
  @Override
  public boolean cooperates() {
    return this.probability > Math.random();
  }
}
