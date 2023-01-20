package HashSetTest;


//순서 X 중복 X ,
//HashSet: Set인터페이스를 구현한 대표적인 컬렉션 클래스 , 순서를 유지하려면 LinkedHashSet클래스를 사용하면 된다.
//TreeSet: 범위 검색과 정렬에 유리한 컬렉션 클래스, HashSet보다 데이터추가,삭제에 시간이 더걸림

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class HashTest1 {

  public static void main(String[] args) {
    Object[] objArr=  {"1",new Integer(1), "2" , "2" , "3" , "3" , "4" , "4" ,"4"};
    Set set= new HashSet();

    for (int i=0; i< objArr.length;i++){   //HashSet에 ObjArr의 요소들을 저장한다.
      set.add(objArr[i]);
    }
   //HashSet에 저장된 요소들을 출력한다.
    System.out.println(set);
    //HashSetdp 저장된 요소들을 출력한다.(Iterator 이용)
    Iterator it= set.iterator();

   while (it.hasNext()){  //읽어올 요소를 있는지 확인   --요소 하나 꺼내오기
     System.out.println(it.next());
   }

  }
}
