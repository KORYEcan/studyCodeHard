package GenericsPractice;

import java.util.ArrayList;

// 컴파일 시 타입을 체크해주는 기능(Compile-time type check)-JDK 1.5
public class GenericTest1 {     //객체의 타입 안정성을 높이고 형변환의 번거로움을 줄여줌
  public static void main(String[] args) {
    ArrayList<Integer> list= new ArrayList();
//    ArrayList<Objects> list1= new ArrayList();    JDK1.5이후 . 지네릭스써줘야됨
//    ArrayList list= new ArrayList();  //JDK1.5이전 가능


    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);//String을 추가 ,하지만 지네릭 타입을 Integer넣어주면서 컴파일시 Integer타입이 아닌걸 잡아주는 역할
    Integer i1= (Integer) list.get(3);   // 컴파일 OK  (컴파일러의 한계) 형변환 에러-실행 시 발생에러
                                       // 컴파일러 에러 -> 낫다 ->실행시 발생에러 보다
    System.out.println(list);          //형변환 생략가능 ,왜냐 지네릭에서 타입을 Integer로 정해줬기 때문에

                                      // 지네릭스의 장점: 1. 타입 안정성을 제공한다.
                                      //                  2. 타입 체크와 형변환을 생략, 코드 간결
                                      //ClassCastException (형변환에러) 실행중 에러 프로그램이 죽음  -> 컴파일 타임 끌고 와서
                                      //
  }
}
