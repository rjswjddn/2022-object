package object201900530;

import java.util.Scanner;

//주석 3: 인터페이스 사용
public class MainMenu implements MenuInterface {
	// 메뉴의 객체 생성 역사와특징, 종류, 레시피 순
	//HistoryFeature HF = new HistoryFeature();
	TypeOfFood TOF = new TypeOfFood();
	Recipe R = new Recipe();
	
	// 메뉴를 출력하는 메소드
	public void openMenu() {
		System.out.println("한국식 요리의 총칭.\n "
				+ "한식(韓食)이라고 부르기도 한다. 주로 한국의 전통식 요리를 뜻하며, 현대적으로 재창조된 한식은 '퓨전 한식' 등으로도 불린다.\n"
				+ "한식진흥법에서는 한국에서 사용되어 온 식재료, 그와 유사한 식재료를 사용하여 한국 고유의 조리방법,\n"
				+ "그와 유사한 조리방법을 이용하여 만들어진 음식과 그 음식과 관련된 유형·무형의 자원·활동 및 음식문화를\n"
				+ "\"한식\"으로 정의하고 있다");
		System.out.println("************************************************************************");
		System.out.println("		목록");
		System.out.println("		1. 한식의 역사와 특징");
		System.out.println("		2. 한식의 종류");
		System.out.println("		3. 한식의 레시피");
		System.out.println("************************************************************************");
		selectMenu();
	}
	
	// 사용자가 메뉴를 고르는 메소드
	public void selectMenu() {
		
		// 사용자가 목록에서 원하는 것을 고름
		System.out.print("원하는 목록의 이름이나 번호를 입력해주세요: ");
		Scanner sc = new Scanner(System.in);
		String menu = sc.nextLine();
		
		// goMenu를 사용해 원하는 메뉴로 이동
		goMenu(menu);
	}
	

	
	// 사용자가 고른 메뉴로 이동함
	public void goMenu(String menu) {
		
		// 사용자가 고른 메뉴의 객체를 만들고 open함
		if(menu.equals("한식의 역사와 특징") || menu.equals("1")) {
			HistoryFeature HF = new HistoryFeature();
			HF.openMenu();
		}
		else if(menu.equals("한식의 종류") || menu.equals("2")) {
			TOF.openMenu();
		}
		if(menu.equals("한식의 레시피") || menu.equals("3")) {
			R.openMenu();
		}
		// 목록에 없는 것을 고르면 selectMenu를 다시 실행하여 다시 입력을 받음
		else {
			System.out.println("목록에 존재하지 않습니다. 다시 입력해주세요.");
		}
		
		openMenu();
	}
	
}
