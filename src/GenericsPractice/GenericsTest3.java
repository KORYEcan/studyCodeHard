package GenericsPractice;

import java.util.ArrayList;
import java.util.List;


class Product{}
class Tv1 extends Product {}
class Audio1 extends Product{}

public class GenericsTest3 {
  public static void main(String[] args) {
    ArrayList<Product> productlist= new ArrayList<Product>();
    ArrayList<Tv> tvList= new ArrayList<Tv>();
//    ArrayList< Product> tvList= new ArrayList<Tv>();  //에러 타입불일치
//    List<Tv>  tvList= new ArrayList<Tv>(); //  Ok 다형성

    productlist.add(new Tv1()  );   // public boolean  add (Product e) Product 의 자손들 OK
    productlist.add(new Audio1()  );// Ok

    tvList.add(new Tv());   //public boolean add( Tv e)  Tv만 들어올수있음
    tvList.add(new Tv());
//    tvList.add(new Audio1());   generic타입은 Tv이기 떄문에  Tv말고 Audio를 넣어서 에러

    printAll(productlist);
//    printAll(tvList);  //컴파일러 에러가 발생한다.



  }

  public  static void printAll(ArrayList<Product> list) {  //new ArrayList<Tv>()넣을수없음  불일치 하기 떄문에
    for (Product p:list ){
      System.out.println(p);
    }

  }
}
