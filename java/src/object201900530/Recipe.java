package object201900530;
import java.io.*;
import java.util.Scanner;


public class Recipe{
	
	//주석 8: 파일 입/출력 사용
	File dir = new File("./recipe");
	// 메뉴를 출력하는 메소드
	public void openMenu() {
		String filelist[] = dir.list();
		System.out.println("************************************************************************");
		for(String name:filelist) {
			System.out.println(name);
		}
		System.out.println("************************************************************************");
		selectMenu();
	}
	// 사용자가 메뉴를 고르는 메소드
	public void selectMenu() {
		System.out.print("뒤로 가시겠습니까? Y/N: ");
		Scanner sc = new Scanner(System.in);
		String yn = sc.nextLine();
		if(yn.equals("Y")) {
			return;
		}
		// 사용자가 수정, 추가를 할 것인지 고름
		System.out.print("레시피를 추가하시겠습니까? Y/N: ");
		sc = new Scanner(System.in);
		yn = sc.nextLine();
		
		// 사용자가 레시피를 고름
		System.out.println("레시피의 이름을 입력해주세요: ");
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
	
	
	
	// 사용자가 고른 메뉴로 이동함
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
			System.out.println("이미 레시피가 존재합니다.");
		}
		else {
			System.out.print("레시피를 한 줄로 입력해주세요 : ");
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
