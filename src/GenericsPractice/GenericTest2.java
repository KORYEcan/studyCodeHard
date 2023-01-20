package GenericsPractice;


import java.util.ArrayList;

class Tv{}
class Audio{}
class Ac{}
public class GenericTest2 {
  public static void main(String[] args) {

    ArrayList<Tv> list= new ArrayList<Tv>();  //Tv 타입의 객체만 저장가능
//    ArrayList list= new ArrayList();  //Tv 타입의 객체만 저장가능
    list.add(new Tv());       //Tv타입이기 떄문에 가능
//    list.add(new Audio());   // Tv타입이 아니기떄문에 컴파일에러 발생
//    list.add(new Ac());     //Tv타입이 아니기떄문에 컴파일에러 발생

  Tv t =list.get(0);   //list의 반환티입이 Object이라서 (Tv)로 꼭 형변환해줘야한다., 하지만 제네릭을 사용하면 <Tv> 때문에 형변환 불필요







  }
}
