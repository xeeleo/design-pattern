package strategy.comparator;

import strategy.IComparable;
import strategy.comparable_instance.Cat;

public class CatComparator implements IComparable<Cat> {

  public int compareTo(Cat c1, Cat c2) {
    if (c1.weight < c2.weight)
      return -1;
    else if (c1.weight > c2.weight)
      return 1;
    return 0;
  }

}
