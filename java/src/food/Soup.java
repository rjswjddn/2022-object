package food;
import java.util.*;

public class Soup implements Food{
	// �ּ� 7: �÷��� �����ӿ�ũ
	Set<String> set = new HashSet<>();
	
	// ������
	public Soup(){
		set.add("����");
		set.add("��ġ�");
		set.add("���屹");
		set.add("�ᰥ����");
		set.add("������");
	}
	
	// ��Ͽ� ������ �߰��Ѵ�.
	public boolean setFood(String foodname) {
		return set.add(foodname);
	}
	
	// ������ ����� ����Ѵ�.
	public void printFood() {
		
		// iterator�� �̿��� ����Ѵ�.
		Iterator<String> iter = set.iterator();
		String food;
		while(iter.hasNext()) {
			food = iter.next();
			System.out.println(food);
		}
		
	}
}
