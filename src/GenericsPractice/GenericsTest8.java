package GenericsPractice;//package GenericsPractice;
//
//import java.util.ArrayList;
//import java.util.Objects;
//
//class Fruit8 implements Eatable {
//  @Override
//  public String toString() {
//    return "Fruit";
//  }
//}
//
//class Apple8 extends Fruit8 {
//  @Override
//  public String toString() {
//    return "Apple";
//  }
//}
//
//class Grape8 extends Fruit8 {
//  @Override
//  public String toString() {
//    return "Grape";
//  }
//}
//
//class Toy8 {
//  @Override
//  public String toString() {
//    return "Toy";
//  }
//}
//
//interface Eatable8 {
//}
//
//
//public class GenericsTest8 {
//
//  public static void main(String[] args) {
//
//
//    Box8 b = null;
//    Box8<String> bStr = null;
//
//    b = (Box8) bStr;         //Box<String> -> BOx  가능  but 경고
//    bStr = (Box8<String>) b; //Box -> Box<String>  가능 but 경고
//
//
//    FruitBox8<Fruit8> box2 = new FruitBox8<>();
//    FruitBox8<Apple8> appleBox = new FruitBox8<>();
//
//    FruitBox8<? extends Fruit8> box3 = new FruitBox8<>();
//    FruitBox8<? extends Fruit8> appleBox3 = (FruitBox8<? extends Fruit8>)  new FruitBox8<Apple8>();   //타입 불일치로 형변환 필요한데(FruitBox2<? extends Fruit2>) 생략
//
//    FruitBox8<? extends Fruit8> abox = new FruitBox8<>();
//    FruitBox8<Apple8> appleBox5 = (FruitBox8<Apple8>) abox;  //OK 경고
//
//
//  }
//}
//
//class FruitBox8<T extends Fruit8 & Eatable8> extends Box8<T> {
//}
//
//class Box8<T> {
//  ArrayList<T> list = new ArrayList<T>();
//
//  void add(T item) {
//    list.add(item);
//  }
//
//  ;
//
//  T get(int i) {
//    return list.get(i);
//  }
//
//  ;
//
//  int size() {
//    return list.size();
//  }
//
//  ;
//
//  @Override
//  public String toString() {
//    return list.toString();
//  }
//}