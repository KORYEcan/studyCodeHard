package GenericsPractice;


import java.util.ArrayList;

class Fruit4  { public String toString() {return "Fruit";} }
class Apple4 extends Fruit4{ @Override public String toString() {return "Apple";} }
class Grape4 extends Fruit4 { public String toString() {return "Grape";}}

class Juice {
  String name;
  public Juice(String name) {
    this.name = name+"Juice";
  }
  @Override
  public String toString() {
    return name;
  }
}

class Juicer {
  static  Juice makeJuice(FruitBox4<? extends Fruit4> box4) {
    String tmp="";
    for (Fruit4 f: box4.getList())
      tmp+= f+"";
    return new Juice(tmp);
  }
}

public class GenericsTest7 {

  public static void main(String[] args) {
    FruitBox4<Fruit4> fruitBox= new FruitBox4<Fruit4>();
    FruitBox4<Apple4> appleBox= new FruitBox4<Apple4>();
    fruitBox.add(new Apple4());
    fruitBox.add(new Grape4());
    appleBox.add(new Apple4());
    appleBox.add(new Apple4());

    System.out.println(Juicer.makeJuice(fruitBox));
    System.out.println(Juicer.makeJuice(appleBox));

  }
}

class FruitBox4 <T extends  Fruit4> extends Box4<T> {}

class Box4<T> {
  ArrayList<T> list= new ArrayList<>();
  void add(T item) {list.add(item);};
  T get(int i) {return list.get(i);};
  int size() {return list.size();};
  public String toString() { return  list.toString();};
  ArrayList<T> getList() {return list;}
}
