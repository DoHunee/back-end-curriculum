package Week3_02_Colletion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx
{

	public static void main(String[] args)
	{
		// Map컬렉션 생성
		Map<String, Integer> map = new HashMap();

		map.put("김진주", 90);
		map.put("이성민", 88);
		map.put("강진호", 70);
		map.put("박병호", 89);
		map.put("장지호", 70);
		map.put("장지호", 80); // key의 중복을 허용하지 않는다.

		System.out.println("map길이 :" + map.size());

		// 키를 이용하여 값을 리턴
		String key = "박병호";
		int value = map.get(key);
		System.out.println(key + "학생의 점수는" + value);
		System.out.println();

		// 키set 컬렉션을 얻어와 map의 키값을 얻기 iterator사용하기
		Set<String> keySet = map.keySet();
		Iterator<String> keyIt = keySet.iterator();
		while (keyIt.hasNext())
		{
			String k = keyIt.next();
			Integer v = map.get(k); // k(key)를 통해 값을 가져올수 있다.
			System.out.println(k + " " + v);

		}

		// 엔트리 Set컬렉션을 얻고, 반복해서 키와 값 가져오기
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> it = entrySet.iterator();
		while (it.hasNext())
		{
			Entry<String, Integer> entry = it.next();
			String k = entry.getKey();
			Integer v = entry.getValue(); // k(key)를 통해 값을 가져올수 있다.
			System.out.println(k + " " + v);

		}

	}

}
