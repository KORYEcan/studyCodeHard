package HashSetTest;


//HashSet은 객체를 저장하기전에 기존에 같은 객체가 있는지 확인
//같은 객체가 없으면 저장하고, 있으면 저장하지 않는다.
//boolean add(Object o)는 저장할 객체의 equals()와 hashCode()를 호출
//equals()와 hashCode()가 오버라이딩 되어 있어야함

import java.util.HashSet;
import java.util.Objects;

public class HashSetTest3 {
  public static void main(String[] args) {

    HashSet set = new HashSet();
    set.add("abc");
    set.add("abc");
    set.add(new Person("David", 10));
    set.add(new Person("David", 10));
    System.out.println(set);
  }
}

class Person {
  String name;
  int age;


  //equals()와 hashCode()를 오버라이딩해야 HashSet이 바르게 동작
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }


  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Person)) return false;
    Person p=(Person) o;   //형변환을 하지 않으면 컴파일에러가 남
    //나지신(this)의 이름과 나이를 p와 비교(이유: Object객체는 name이라는 변수가 없음 그래서 형변환을 해주는거임)
    return this.name.equals(p.name) && this.age== p.age;
  }

  @Override
  public int hashCode() {
    //int hash(Object...values) 가변인자
    return Objects.hash(name, age);
  }

  @Override
  public String toString() {
    return name+":"+age;
  }
}



