package ArtificialLife;

import java.io.PrintWriter;

public class ALifeSim {
  public static void main(String[] args) throws Exception {

    int iteration = Integer.valueOf(args[0]);

    Pair<String, Integer>[] organisms = new Pair[3];
    organisms[0] = new Pair<String, Integer>("Cooperators", Integer.valueOf(args[1]));
    organisms[1] = new Pair<String, Integer>("Defectors", Integer.valueOf(args[2]));
    organisms[2] = new Pair<String, Integer>("PartialCooperators", Integer.valueOf(args[3]));


    Population pop = new Population(organisms);

    for (int i = 0; i < iteration; i++) {
      pop.update();

    }
    PrintWriter pen = new PrintWriter(System.out, true);
    pen.println("After " + iteration + " ticks:");
    for (int i = 0; i < 3; i++) {
      Pair<String, Integer> current = pop.getPopulationCounts()[i];
      pen.println(current.getLeft() + " = " + current.getRight());
    }
    
  }

}
