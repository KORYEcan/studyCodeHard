package CollectionMethodStudy;



//컬렉션 채우기, 복사, 정렬, 검색 -fill() , copy() , sort() , binarySearch()
//컬렉션의 동기화 - synchronizedXXX()
//변경불가(readOnly) 컬렉션 만들기-unmodifiable
//싱글톤 컬렉션 만들기 -singletonXXX()
//한 종류의 객체만 저장하는 컬렉션 만들기-checkedXXX() JDK1.5이후 제네릭으로 대체할수있다.




//컬렉션 클래스 정리 & 요약(1/2)
//ArrayList/Vector -> stack
//ArrayList 단점(추가, 삭제기능)을 보완한 ->LinkedList ->Queue
//검색기능 향상 ArrayList+ LinkedList =HashMap(old version = HashTable) key,value
//HashMap에 Key부분가지고 만든게 HashSet -->순서가 필요하면 LinkedHashSet
//LinkedList에서 검색 ,범위 검색 ,정렬 기능 향상 TreeMap -->TreeSet
//HashMap에 String String 파일에 읽기와 쓰기가 용이한 Properties
//순서필요한 HashMap을 사용하고싶은 경우 ,LinkedHashMap을 사용하면 된다.



import java.util.*;
import static java.util.Collections.*;   //Collections 를 생략가능하게 해준다.

public class CollectionsStudy {
    public static void main(String[] args) {
        List list=  new ArrayList();
        System.out.println(list);

        Collections.addAll(list,1,2,3,4,5);
        System.out.println(list);

        rotate(list,2);// 오른쪽으로 두칸씩 이동;
        System.out.println(list);

        swap(list,0,2); //첫 번째와 세 번째를 교환(swap)
        System.out.println(list);

        shuffle(list);   //저장된 요소의 위치를 임의로 변경
        System.out.println(list);

        sort(list,reverseOrder()); //역순 정렬 reverse(list);와동일
        System.out.println(list);

        sort(list); //정렬
        System.out.println(list);
        //binarySearch를 하기전에는 먼저 정렬부터 해줘야된다.
        int idx= binarySearch(list,3);  //3이 저장된 위치(index)를 반환




    }




}
