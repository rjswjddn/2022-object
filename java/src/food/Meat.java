package food;
import java.util.*;


public class Meat implements Food {
	
	// 주석 7: 컬렉션 프레임워크
	Set<String> set = new HashSet<>();
	
	// 생성자
	public Meat(){
		set.add("갈비");
		set.add("산적");
		set.add("불고기");
		set.add("곱창");
		set.add("제육볶음");
	}
	
	// 목록에 음식을 추가한다.
	public boolean setFood(String foodname) {
		return set.add(foodname);
	}
	
	// 음식의 목록을 출력한다.
	public void printFood() {
		
		// iterator를 이용해 출력한다.
		Iterator<String> iter = set.iterator();
		String food;
		while(iter.hasNext()) {
			food = iter.next();
			System.out.println(food);
		}
		
	}
}
