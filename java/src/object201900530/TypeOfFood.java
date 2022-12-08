package object201900530;
import java.util.Scanner;
import java.util.InputMismatchException;
import food.*;


public class TypeOfFood {
	
	// 패키지 food의 Foodmenu 객체를 생성함.
	Foodmenu foodmenu = new Foodmenu();
	
	// 음식의 종류 객체를 생성
	Meat meat = new Meat();
	Seafood seafood = new Seafood();
	Soup soup = new Soup();
	
	
	// 메뉴를 출력하는 메소드
	public void openMenu() {
		System.out.println("************************************************************************");
		System.out.println("		목록");
		System.out.println("		1. 고기");
		System.out.println("		2. 해산물");
		System.out.println("		3. 국, 탕, 찌개");
		System.out.println("		4. 뒤로");
		System.out.println("************************************************************************");
		selectMenu();
	}
	
	// 사용자가 메뉴를 고르는 메소드
	public void selectMenu() {
		System.out.print("원하는 목록의 번호를 입력해주세요: ");
		Scanner scan = new Scanner(System.in);
		
		// 메뉴의 숫자와 메뉴의 이름 변수
		int menuNum;
		String menuName;
		
		while(true) {
			// 평가항목 4번 예외처리
			// 목록의 번호를 입력받는다.
			// int가 아닌 자료형이 입력되면 예외처리한다.
			// 1~4가 아닌 다른 정수가 입력되면 예외처리한다.
			try {
				menuNum = scan.nextInt();
				if(menuNum == 4) {
					return;
				}
				menuName = foodmenu.foodType[menuNum-1];	
				break;
			}
			catch(InputMismatchException e) {
				scan = new Scanner(System.in);
				System.out.println("잘못된 입력입니다. 번호를 입력해주세요.");
				System.out.print("원하는 목록의 번호를 입력해주세요: ");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				scan = new Scanner(System.in);
				System.out.println("잘못된 입력입니다. 1~4를 입력해주세요.");
				System.out.print("원하는 목록의 번호를 입력해주세요: ");
			}

		}
		

		System.out.println(menuName);
		goMenu(menuNum);
	}
	// 사용자가 고른 메뉴로 이동함
	public void goMenu(int num) {
		
		// 메뉴의 음식이름 출력
		if(num == 1) {
			foodmenu.print(meat);
			foodmenu.addFood(meat);
		}
		else if(num == 2) {
			foodmenu.print(seafood);
			foodmenu.addFood(seafood);
		}
		else {
			foodmenu.print(soup);
			foodmenu.addFood(soup);
		}
		openMenu();
		
		
	}
}
