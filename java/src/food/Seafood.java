package food;
import java.util.*;

public class Seafood implements Food{
	
	// �ּ� 7: �÷��� �����ӿ�ũ
	Set<String> set = new HashSet<>();
	
	// ������
	public Seafood(){
		set.add("�������");
		set.add("��ȸ");
		set.add("�ع���");
		set.add("ȫ��ȸ");
		set.add("�곫��");
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
