package dto;

import java.util.Scanner;

public class LoginService03 {
	
	LoginDTO3 dto = new LoginDTO3();
	Scanner sc = new Scanner(System.in);

	public void display() {
		
		
		
		int num;
		
		while (true) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.탈퇴");
			System.out.println("4.종료");
			System.out.println(">>> ");
			num = sc.nextInt();
			
			switch (num) {
				case 1:
					//if (dto.getId() == null) {
					if (idCheck() == 0) {
						System.out.println("저장하세요");
						break;
					}
					
					System.out.print("ID : ");
					String id = sc.next();
					System.out.print("PW : ");
					String pwd = sc.next();
					
					if (id.equals(dto.getId())) {
						if (pwd.equals(dto.getPwd())) {
							System.out.println("인증 성공");
						}else {
							System.out.println("PW 틀림");
						}
					}else {
						System.out.println("존재하지 않는 ID");
					}
					break;
					
				case 2:
					//if (dto.getId() == null) {
					if (idCheck() == 0) {
						System.out.print("ID : ");
						String newId = sc.next();
						System.out.print("PW : ");
						String newPwd = sc.next();
						dto.setId(newId);
						dto.setPwd(newPwd);
						System.out.println("회원가입 완료");
					}else {
						System.out.println("사용자가 존재함");
					}
					break;
					
				case 3:
					//if (dto.getId() == null) {
					if (idCheck() == 0) {
						System.out.println("등록값 없음");
					}else {
						dto.setId(null);
						dto.setPwd(null);
						System.out.println("삭제완료");
					}
					break;
				
				case 4: 
					return;
			}
		}
	}
	
	public int idCheck() {
		if (dto.getId() == null) {
			return 0;
		}
		return 1;
	}
}
