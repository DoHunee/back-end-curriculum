package Week3_02_Colletion;

//ctrl + shift + o
import java.util.ArrayList;

public class Arraylist_Ex01
{

	public static void main(String[] args)
	{
		
		//1.ArrayList 타입 list1을 생성하세요 , 숫자참조객체만 저장 가능
		 ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		 //2. list1에 1,2,3,4,5 값을 랜덤하게 추가해주세요
         list1.add(1);
         list1.add(3);
         list1.add(2);
         list1.add(5);
         list1.add(2);
         list1.add(4);
         
         //3.
         //print(list1);s
         
         //4 ArrayList list2를 생성하는데 , list의 인덱스 1~3까지의 값을 가져와서 list2를 생성
         ArrayList<Integer> list2 = new ArrayList(list1.subList(1,4));
 		 print(list1,list2);
 		 
 		 //5.
 		 System.out.println("list1에 list2의 요소가 모주 포함되어 있나요?"+list1.containsAll(list2));	
          
 		 //6 list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제
 		 System.out.println("list1에서 list2와 겹치는 부분만 남기고 나머지 삭제"+list1.retainAll(list2));	
         print(list1,list2);
	
         //7 list2에서 list1에 포함된 객체들을 삭제하기(인덱스를 뒤에서부터 검사하며 삭제)
         for(int i = list2.size()-1; i>=0;i--) {
        	 if(list1.contains(list2.get(i))) 
        		 list2.remove(i);
         }
         // list2는 빈 리스트
         print(list1,list2);
     	
	}
	
	static void print(ArrayList arr1 , ArrayList arr2) {
		// ArrayList a1 = (ArrayList)arr1;
		System.out.println("list1 : "+ arr1);
		System.out.println("list2 : "+ arr2);
		System.out.println("array1에서 순서대로 값 출력");
		// for(Integer i : a1) System.out.println(i);
	}
}
