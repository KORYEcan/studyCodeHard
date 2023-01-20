package HashSetTest;

import java.text.CollationElementIterator;
import java.util.*;

public class HashSetTest2 {
  public static void main(String[] args) {

    Set set= new HashSet();
   //set의 크기가 6보다 작은 동안 1~45사이의 난수를 저장
    for (int i=0;set.size()<6;i++){
      int num=(int)(Math.random()*45)+1;
//      set.add(new Integer(num));
      set.add(num);
    }
    System.out.println(set);   //정렬이란건 순서유지가 되어야되는 set은 정렬불가해서 그래서 set의 모든요소를 List에저장
    List list= new LinkedList<>(set);
    Collections.sort(list);  ///List로 정렬
    System.out.println(list); //list로 출력
  }
}
