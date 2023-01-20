package GenericsPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class GenericsTest5 {
  public static void main(String[] args) {
    HashMap<String,Student1> map= new HashMap<>() ; //JDK 1.7부터 생성자에 타입지정 생략가능

map.put("자바왕", new Student1("자바왕",1,1,100,100,100));


// public V get(Object Key) {   ---> public Student get( Object key)
//  Student1 s=(Student1) map.get("자바왕");
    Student1 s= map.get("자바왕");

    System.out.println(map.get("자바왕").name);
    System.out.println(map.get("자바왕").ban);
    System.out.println(map.get("자바왕"). eng);
    System.out.println(map.get("자바왕").kor  );
    System.out.println(map.get("자바왕").math  );




    }



  }

class Student1 {
  String name = "";
  int ban;
  int no;
  int kor;
  int eng;
  int math;

  public Student1(String name, int ban, int no, int kor, int eng, int math) {
    this.name = name;
    this.ban = ban;
    this.no = no;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }
}