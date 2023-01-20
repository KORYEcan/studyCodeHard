package ArraysList;

import java.util.*;
import java.util.Arrays;

public class EX11_1 {

  static void print(ArrayList list1,ArrayList list2){
    System.out.println();
    System.out.println("list1="+list1);
    System.out.println("list2="+list2);
  }


  public static void main(String[] args) {
    // 기본 길이(용량인 10인) ArrayList를 생성
    ArrayList list1= new ArrayList(10 );

    //ArrayList에는 객체만 저장가능
    //Autoboxing에 의해 기본형이 참조형으로 자동 변환
    list1.add(new Integer(5));
    list1.add(new Integer(4));
    list1.add(new Integer(3));
    list1.add(new Integer(2));
    list1.add(new Integer(1));



    ArrayList list2= new ArrayList(list1.subList(1,4)); //읽기 전용
    System.out.println("list1="+list1);
    System.out.println("list2="+list2);

    System.out.println();               //Collection은 인터페이스, Collections는 유틸 클래스
    Collections.sort(list1);    //list1 과 list2를 오름차순으로 정렬
    Collections.sort(list2);
    System.out.println("list1="+list1);
    System.out.println("list2="+list2);
    System.out.println();

    System.out.println("list1.containsAll(list2)="+list1.containsAll(list2));  //list1의 값을 list2가 다 포함하고있는지 확인



    list2.add("B");
    list2.add("C");
    list2.add(3,"A");
     print(list1,list2);


    list2.set(3,"AA");
    System.out.println(list2);

     list1.add(0,"1");
      print(list1,list2);

     // indexOf()는 지정된 객체의 위치(인덱스)를 알려준다.
    System.out.println(list1.indexOf("1"));
    System.out.println(list1.indexOf(new Integer(1)));

    list1.remove(new Integer(5));
    print(list1,list2);

      //list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
    System.out.println("list1.retainAll(list2)="+list1.retainAll(list2));
    print(list1,list2);



  }
}
