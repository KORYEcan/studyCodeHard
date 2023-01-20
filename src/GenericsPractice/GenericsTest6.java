package GenericsPractice;


import javax.swing.*;
import java.util.ArrayList;

class Fruit implements Eatable {
  public String toString() {return "Fruit";}
}

class Apple extends Fruit{public String toString(){return "Apple";}}
class Grape extends Fruit{public String toString(){return "Grape";}}
class Toy {public String toString(){return "Toy";}}


interface Eatable {}


class FruitBox<T extends  Fruit& Eatable> extends Box<T> {}

class Box<T> {
  ArrayList<T> list= new ArrayList<>();
  void add(T item) {list.add(item);};
  T get(int i) {return list.get(i);};
  int size() {return list.size();};
  public String toString() { return  list.toString();};
}





public class GenericsTest6 {
  public static void main(String[] args) {
    FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
    FruitBox<Apple> AppleBox = new FruitBox<Apple>();
    FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//    FruitBox<Grape> GrapeBox = new FruitBox<Apple>(); //에러 . 불일치
//    FruitBox<Grape> GrapeBox = new FruitBox<Apple>();// 에러 .타입불일치
    Box<Toy> toyBox2 =  new Box<Toy>();

fruitBox.add(new Fruit());
fruitBox.add(new Apple());
fruitBox.add(new Grape());
AppleBox.add(new Apple());
grapeBox.add(new Grape());
//grapeBox.add(new Apple()); //에러 . Apple는 Grape의 자손이 아님.



  }
}
