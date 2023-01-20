package CollectionComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

//객체를 정렬에 필요한 메서드(정렬기준 제공)를 정의한 인터페이스
//Comparable : 기본정렬 기준을 구현하는데 사용
//Comparator : 기본 정렬 기준 외에 다른 기준으로 정렬하고자 할때 사용
//compare() 와 compareTo() 는 두객체의 비교결과를 반환하도록 작성 같으면 0, 오른쪽이 크면 음수(-) 작으면 양수(+)

public class CTest1 {
  public static void main(String[] args) {
    String[] strArr={"cart","Dog","lion","tiger"};

    Arrays.sort(strArr);                              //String의 Comparable구현에 의한 정렬   class String implements Comparable(기본정렬기준: 사전순 abc순으로) 기본적인 정렬기준이 있어서 sort 사용시 정렬기준을 안정해줘도 된다.
    System.out.println("strArr="+Arrays.toString(strArr));

    Arrays.sort(strArr,String.CASE_INSENSITIVE_ORDER);  //기본적으로 주어지는 정렬기준을 쓰지않고 , 정렬기준을 바꿔서 쓰는경우(대소문자 구분안함)
    System.out.println("strArr="+Arrays.toString(strArr));

    Arrays.sort(strArr,new Descending());   //역순으로 정렬
    System.out.println("strArr="+Arrays.toString(strArr));


      }

}


class Descending implements Comparator {


  @Override
  public int compare(Object o1, Object o2) {


    if (o1 instanceof  Comparable && o2 instanceof  Comparable){
      Comparable c1= (Comparable) o1;
      Comparable c2= (Comparable) o2;
      //return c2.compareTo(c1);  아래 코드랑 결과는 똑같은 코드
      return c1.compareTo(c2)*-1;
    }
    return -1;
  }
}