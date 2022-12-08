package food;

import java.util.Scanner;

public class Foodmenu {
	// 평가항목 6번 참조 타입(배열)
	// 음식의 종류가 들어있는 배열
	public String foodType[] = {"Meat", "Seafood", "Soup"};
	
	// 평가항목 5번 다형성
	// TypeOfFood에서 요청한 음식종류 음식이름을 출력한다.
	public void print(Food food) {
		food.printFood();
	}
	
	
	// 평가항목 5번 다형성
	// TypeOfFood에서 요청한 음식종류에 음식이름을 추가한다.
	public void addFood(Food food) {
		
		// 스캐너로 음식의 이름을 입력받는다.
		System.out.print("추가할 음식의 이름을 입력해주세요. 추가할 음식이 없다면 '없음'을 입력해주세요: ");
		Scanner scan = new Scanner(System.in);
		String foodname = scan.nextLine();
		
		//만약 음식이름이 없음이면 return하여 메소드 종료
		if(foodname.equals("없음")) {
			return;
		}
		
		// 음식종류객체의 setFood의 boolean을 return 받는다.
		// true이면 정상적으로 음식이 추가 O
		// false면 이미 같은 음식이 있어 추가 x
		boolean result;
		result = food.setFood(foodname);
		
		if(result) {
			System.out.println("음식을 추가했습니다.");
		}
		else {
			System.out.println("이미 음식이 존재합니다.");
		}
	}
	
	
	
}
