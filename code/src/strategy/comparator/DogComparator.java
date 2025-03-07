package strategy.comparator;

import strategy.IComparable;
import strategy.comparable_instance.Dog;

public class DogComparator implements IComparable<Dog> {
  
  public int compareTo(Dog d1, Dog d2) {
    if (d1.food < d2.food)
      return -1;
    else if (d1.food > d2.food)
      return 1;
    return 0;
  }

}
