package TreeSetPractice;

import java.util.TreeSet;

//트리 순회(tree traversal)
//이진 트리의 모든 노드를 한번씩 읽는 것을 트리순회
//전위순회: 뿌리-> 왼쪽 자식-> 오른쪽 자식순
//중위순회: 왼쪽 자식->뿌리->  오른쪽 자식순
//후위순회: 왼쪽 자식-> 오른쪽 자식-> 뿌리
//레벌 순회: 그냥 노드의 순서대로


public class TreeSetTest3 {
  public static void main(String[] args) {

    TreeSet set= new TreeSet();
    int[] score={80,95,50,35,45,65,10,100};

    for (int i=0; i< score.length;i++){
      set.add(new Integer(score[i]));
    }
    System.out.println("50보다 작은 값은:"+set.headSet(50));
    System.out.println("50보다 큰값은:"+set.tailSet(new Integer(50)));
    System.out.println("40과 80사이의값은:"+set.subSet(40,80));

  }
}
