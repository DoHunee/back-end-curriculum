package Week3_01_Generic;

public class Box1<T>
{
    public T content;                //현재 T의 객체타입은 Object 이다. 
    
    //Box의 내용물이 같은지 비교
    public boolean compare(Box1<T> other) {  //box안의 내용물을 검수 
    	
    	boolean result = content.equals(other.content);
    	return result;
    }
    
    
    public static void main(String[] args) {
    	
    	Box1 box1 = new Box1();
    	box1.content ="100";
    	box1.content ="100";
    	box1.content ="100";
    	
    	Box1 box2 = new Box1();
    	box2.content = "100";
    	
    	
    	Box1 box3 = new Box1();
    	box3.content = "100";
    	
    	boolean result1 = box1.compare(box2);
    	System.out.println(result1);
    	
    	boolean result2 = box1.compare(box3);
    	System.out.println(result2);
    	
    }
    
}
