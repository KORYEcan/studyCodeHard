package TreeSetPractice;


//범위 탐색, 정렬
// 이진 탐색 트리(binary search tree)로 구현. 범위 탐색과 정렬에 유리
//이진 트리는 모든 노드가 최대 2개의 하위 노드를 갖음.
//각요소(node)가 나무 (tree)형태로 연결(LinkedList의 변형)



// 이진 탐색 트리(binary search tree) - 부모보다 작은 값은 왼쪽 /큰값은 오른쪽에 저장
// 이진 탐색 트리 단점: 데이터가 많아질수록 추가 ,삭제에 시간이 더 걸림 ( 비교횟수에 증가)


//TreeSet: 데이터 저장과정 boolean add(Object o)  중복 X TreeSet에

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
  public static void main(String[] args) {

    Set set= new TreeSet();  // 범위검색, 정렬, 정렬이 있어서 정렬필요없음
//    Set set1 = new HashSet();//

//    for (int i=0; set.size()<6;i++){
//      int num= (int)(Math.random()*45)+1;
//      set.add(num);  //set.add(new Integer(num));
        set.add(new Test());
        set.add(new Test());
        set.add(new Test());
//    }
    System.out.println(set);


  }
}
class  Test implements Comparable {  //정렬기준이 없으면 set으로 나타내지못해서 정렬기준의가지고 있는 Comparable 인터페이스를 구현해야지  Test대한 객체를 가지고 set에 활용할수있다.
  @Override
  public int compareTo(Object o) {
    return -1;
  }
}  // 비교 기준이 없음 위에 Test 클래스에 정렬기준(Comparable)이 없을때 사용했지만 이제 Test클래스
class TestComp implements Comparator {

  @Override
  public int compare(Object o1, Object o2) {
    return -1;
  }
}