package food;
import java.util.*;

public class Soup implements Food{
	// 주석 7: 컬렉션 프레임워크
	Set<String> set = new HashSet<>();
	
	// 생성자
	public Soup(){
		set.add("떡국");
		set.add("김치찌개");
		set.add("된장국");
		set.add("콩갈비탕");
		set.add("수제비");
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
