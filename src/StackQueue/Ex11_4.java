package StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_4 {

  static Queue q = new LinkedList();
  static final int MAX_SIZE = 5;

  public static void main(String[] args) {
    //화면단에 출력할 내용
    System.out.println("help를 입력하면 도움말을 볼수 있습니다.");

    while (true) {
      System.out.println(">>");


      try {

        //화면단에 출력할 Scanner 클래스 사용
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();  //입력값에 공백을 제거해주는 trim()사용

        if ("".equals(input)) continue;

         if (input.equalsIgnoreCase("q")){
           System.exit(0);
         } else if (input.equalsIgnoreCase("help")) {
          System.out.println(" hellp - 도움말 보여주기");
          System.out.println(" q or Q - 프로그램 종료");
          System.out.println(" histroy -  최근에 입력한 명령어를" + MAX_SIZE + "보여줌");
        } else if (input.equalsIgnoreCase("history")) {
          save(input);   //입력받은 명령어를 저장하고,
          LinkedList list= (LinkedList) q;

          for (int i=0; i<list.size();i++){
            System.out.println(((1+1)+"."+list.get(i)));
          }
        }else {
          save(input);
          System.out.println(input);
        }
      } catch (Exception e) {
        System.out.println("입력 오류입니다.");
      }
    }

  }

  public static void save(String input) {
    if (!"".equals(input))
      q.offer(input);

    if (q.size() > MAX_SIZE)
      q.remove();
  }
}

