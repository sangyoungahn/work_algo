import java.util.Arrays;
import java.util.Scanner;

public class ReadHeight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		String[] stringArr = new String[5];		//5개의 문자열을 입력 받을 배열
		
		for(int t=0; t<T; t++) {	//테스트케이스만큼 반복
			for(int i=0; i<stringArr.length; i++) {		//총 5개의 문자열을 입력받아서 각각을 char로 변환해줌
				stringArr[i] = sc.next();
				char[] stringToChar = stringArr[i].toCharArray();	//문자열을 문자로 변환시켜 저장시킬 배열
				
				System.out.println(Arrays.toString(stringToChar));
			}
				
//				char[] resultChar = new char[stringToChar.length];	//문자 각각을 저장시킬 배열 생성
//				for(int j=0; j<stringToChar.length; j++) {
//					resultChar[i] = stringToChar[0]
		}
	}

}
