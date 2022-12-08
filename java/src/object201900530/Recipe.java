package object201900530;
import java.io.*;
import java.util.Scanner;


public class Recipe{
	
	//�ּ� 8: ���� ��/��� ���
	File dir = new File("./recipe");
	// �޴��� ����ϴ� �޼ҵ�
	public void openMenu() {
		String filelist[] = dir.list();
		System.out.println("************************************************************************");
		for(String name:filelist) {
			System.out.println(name);
		}
		System.out.println("************************************************************************");
		selectMenu();
	}
	// ����ڰ� �޴��� ���� �޼ҵ�
	public void selectMenu() {
		System.out.print("�ڷ� ���ðڽ��ϱ�? Y/N: ");
		Scanner sc = new Scanner(System.in);
		String yn = sc.nextLine();
		if(yn.equals("Y")) {
			return;
		}
		// ����ڰ� ����, �߰��� �� ������ ��
		System.out.print("�����Ǹ� �߰��Ͻðڽ��ϱ�? Y/N: ");
		sc = new Scanner(System.in);
		yn = sc.nextLine();
		
		// ����ڰ� �����Ǹ� ��
		System.out.println("�������� �̸��� �Է����ּ���: ");
		sc = new Scanner(System.in);
		String foodname = sc.nextLine();
		String recipefile = foodname + ".txt";
		
		if(yn.equals("Y")) {
			editrecipe(recipefile);
		}
		else if (yn.equals("N")) {
			goMenu(recipefile);
		}

		openMenu();
	}
	
	
	
	// ����ڰ� �� �޴��� �̵���
	public void goMenu(String recipefile) {
		int data;
		try {
			Reader reader = new FileReader("./recipe/"+recipefile);
			while(true) {
				data = reader.read();
				if(data == -1) {
					break;
				}
				System.out.print((char)data);
				
			}
			System.out.println();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}
	
	
	
	public void editrecipe(String recipefile) {
		File file = new File("./recipe/"+recipefile);
		if (file.exists()) {
			System.out.println("�̹� �����ǰ� �����մϴ�.");
		}
		else {
			System.out.print("�����Ǹ� �� �ٷ� �Է����ּ��� : ");
			Writer writer;
			try {
				writer = new FileWriter("./recipe/"+recipefile);
				Scanner scan = new Scanner(System.in);
				String recipe = scan.nextLine();
				writer.write(recipe);
				writer.flush();
				writer.close();	
			} catch (IOException e) {
				e.printStackTrace();
			}

			
		}
	}
}
