package Week1_04_loop;
import java.util.Scanner;

public class DoWhile
{

	public static void main(String[] args)
	{
		
		/* 1. 각 나라의 수도를 출력한다.
		 * 2. 숫자를 입력받는다.
		 * 3. 해당하는 나라의 수도를 출력한다. 
		 * 4. 1-2-3 반복
		 * 5. 번호 이외의 숫자가 입력되면 none을 출력하고 종료한다.
		 * */
			
			int num; // 숫자를 받기 위한 변수
			boolean a =true;  // while문을 종료시키기 위한 변수
			
			// 4.
			while (a) { // true면 반복문을 종료한다.
				
				// 1. 각 나라의 수도 출력
				System.out.println("1. Korea");
				System.out.println("2. USA");
				System.out.println("3. Japan");
				System.out.println("4 China");
				System.out.print("number? ");
				
				// 2. 숫자를 입력받기 위한 클래스 추가
				Scanner sc = new Scanner(System.in);
				num = sc.nextInt();
				
				// 3. 조건문을 통해 각 흐름에 따라 해당 값을 출력
				switch (num) {
				case 1: {
					System.out.println("\nSeoul\n");
					break;
				}
				case 2: {
					System.out.println("\nWashington\n");
					break;
				}
				case 3: {
					System.out.println("\nTokyo\n");
					break;
				}
				case 4: {
					System.out.println("\nBeijing\n");
					break;
				}
	            
				// 5. 번호 이외의 숫자가 입력되면 none 출력 후 종료
				default:
					System.out.println("\nnone\n");
					a= false; // 1. 여기서 stop의 값을 1로 바뀌주고
					break; // 2. while문을 종료시킵니다.
					
				} // end switch
			}

	}

}
