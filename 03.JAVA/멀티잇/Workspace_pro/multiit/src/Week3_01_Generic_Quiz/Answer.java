package Week3_01_Generic_Quiz;

public class Answer
{

		//이것이 자바다 13장 _ 제네릭!!
		
		
		 //1번
//		1)컴파일시 강한 타입 체크를 할 수 있다 O
//      2)타입변환(casting을 제거한다)      O
//      3) 제네릭 타입은 타입 파라미터를 가지는 제네릭 클래스와 인터페이스를 말한다      O
//	    4)제네릭 메소드는 리턴 타입으로 타입 파라미터를 가질 수 없다 >> 가질 수 있다!!  X
		
		
//		//2번
//		public class Container<T> {
//		    private T t;
//		 
//		    public T get() {
//		        return t;
//		    }
//		    public void set(T t) {
//		        this.t = t;
//		    }
//		}

		
		
//		//3번
//		public class Container<K,V> {
//		    private K key;
//		    private V value;
//		    public K getKey() {
//		        return key;
//		    }
//		 
//		    public V getValue() {
//		        return value;
//		    }
//		    public void set(K key , V value) {
//		        this.key = key;
//		        this.value = value;
//		    }
//		}
		
		
		
		
		
//        //4번
//		public class Util {
//		    // 방법 1
//		    public static <K,V> V getValue(Pair<K,V> p, K k) {
//		        if (p.getKey() == k) {
//		            return p.getValue();
//		        } else {
//		            return null;
//		        }
//		    }
//		    
//		    // 방법 2
//		    public static <P extends Pair<K,V>, K , V> V getValue(P p, K k) {
//		    if (p.getKey() == k) {
//		        return p.getValue();
//		    } else {
//		        return null;
//		    }



		
	}


