package GenericsPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsTest4 {
  public static void main(String[] args) {
    ArrayList<Student>  list= new ArrayList<Student>();

    list.add(new Student("예병창",1,1));
    list.add(new Student("예병철",2,1));
    list.add(new Student("예병열",3,1));
    list.add(new Student("예병준",4,1));


    Iterator<Student> it= list.iterator();
//    Iterator it= list.iterator();

    while(it.hasNext()){
//      Student s= (Student)it.next();   //지네릭스를 사용하지 않으면 형변환 필요
//     Student s= it.next();
//      System.out.println(s.name);
      System.out.println(it.next().name);   //위에 두줄을 줄인 코드
//      System.out.println(it.next().ban);   //위에 두줄을 줄인 코드
//      System.out.println(it.next().no);   //위에 두줄을 줄인 코드
    }



  }
}

class Student {
  String name="";
  int ban;
  int no;

  public Student(String name, int ban, int no) {
    this.name = name;
    this.ban = ban;
    this.no = no;
  }
}