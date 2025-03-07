package strategy;

import java.util.Arrays;
import strategy.comparable_instance.Cat;
import strategy.comparable_instance.Dog;
import strategy.comparator.CatComparator;
import strategy.comparator.DogComparator;

public class Main {
  public static void main(String[] args) {
    Dog[] a = { new Dog(1), new Dog(3), new Dog(2) };
    Cat[] b = { new Cat(5, 7), new Cat(3, 8), new Cat(2, 9) };
    Sorter<Dog> sorter1 = new Sorter<Dog>();
    Sorter<Cat> sorter2 = new Sorter<Cat>();
    sorter1.sort(a, new DogComparator());
    sorter2.sort(b, new CatComparator());
    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));
  }

}
