/* [주석1: 과제설명]
 * 객체지향 프로그래밍 평가과제 (배점 25점)
 * 학과: 컴퓨터전자시스템공학부
 * 학번: 201900530
 * 이름: 김건우
 * 
 * 과제 주제: 한식에 대한 소개 프로그램
 * 메뉴에서 원하는 메뉴를 골라 상호작용하는 프로그램을 설계하였습니다.
 * 한식의 역사와 특징 메뉴: 한식의 역사와 특징을 볼 수 있습니다.
 * 한식의 종류 메뉴: 한식의 주재료에 따른 음식을 볼 수 있고 직접 추가도 가능합니다.
 * 한식의 레시피 메뉴: txt로 저장된 레시피를 볼 수 있고 직접 레시피를 추가할 수 있습니다.
 */



package object201900530;

public class Main {

	public static void main(String[] args) {
		// MainMenu 객체생성
		MainMenu menu = new MainMenu();
		while(true) {
			// openMenu 실행
			menu.openMenu();
		}
		

	}

}
