package HashSetTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class HashSetTest4 {
  public static void main(String[] args) {
    HashSet setA= new HashSet();
    HashSet setB= new HashSet();
    HashSet setHab= new HashSet();
    HashSet setKyo= new HashSet();
    HashSet setCha= new HashSet();

    setA.add("1"); setA.add("2"); setA.add("3");
    setA.add("3"); setA.add("4"); setA.add("5");
    System.out.println("A="+setA);


    setB.add("4"); setB.add("5"); setA.add("6");
    setB.add("7"); setB.add("8");
    System.out.println("B="+setB);

    Iterator it = setB.iterator();
    //////////////////////////////////////////// 교집합

    while (it.hasNext()){    //Iterator hasNext메소드를 이용해서 하나씩 꺼내기(while문을 통해 값이 없을떄까지 반복문)
      Object tmp= it.next();
      if (setA.contains(tmp))  //같은 값이 있는 확인 해주는 있으면 같은 값을
        setKyo.add(tmp);       //setKyo로 넣어주는 작업
    }
    ////////////////////////////////////////// 합집합
    it=setA.iterator();   //
    while (it.hasNext())   //
      setHab.add(it.next());  // setA에 있는 값 다 떄려 넣어 버리기

    it=setB.iterator();
    while (it.hasNext())
      setHab.add(it.next()); //setB에 있는 값 다 떄려 넣어 버리기

///////////////////////////////////////////////////////// 차집합
    it= setA.iterator();
    while(it.hasNext()){
      Object tmp =it.next();
      if (!setB.contains(tmp)) //setA값을 돌면서 setB랑 같지 않은 값을 넣어줘 버리는 작업
        setCha.add(tmp);
    }



    ////////////////////////////////////
    System.out.println("A∪B="+setHab);
    System.out.println("A∩B="+setKyo);
    System.out.println("A-B="+setCha);
    setA.retainAll(setB);
    System.out.println("교집합="+setA);
    setA.addAll(setB);
    System.out.println("합집합="+setA);
    setA.removeAll(setB);
    System.out.println("차집합="+setA);




  }
}
