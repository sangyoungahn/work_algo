import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		int a, b, c, d, e;
		a=b=c=d=e=1; //오른쪽에서부터 차례로 넣기 떄문에 에러가 안남(자바에서만 가능)
		String s = "korea";
		String s1 = "korea";
//		String s1 = new String("Korea");
//		if(s.equals(s1)) {
//		if(s.equals("korea")) {
		if("korea".equals(s)) {	//s.equals("korea"), null 오류 방지
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		s = "한글korea";
		System.out.println(s.length());
		s.toUpperCase();
		
		System.out.println(s);
		s = "korea japan korea japan java";
//		s = s.replace('k', "케");
		s.replaceAll("korea", "한글");
		System.out.println(s);
		String[] srr = s.split(" ");
		System.out.println(Arrays.toString(srr));
		
		s = "koreajapan";
		s = s.substring(3, 5);
		System.out.println(s);
		
		char ch = s.charAt(3);
		char[] charr = s.toCharArray();
		
		int num = 120;
//		s = String.valueOf(num);	//???
		s = num + "";
		
		String name = "홍길동";
		int age = 30;
		System.out.println("이름은" + name + "나이는" + age + "입니다.");
		System.out.println(String.format("이름은 %s 나이는 %d 입니다.", name, age));	//이게 더 좋음
		
		String s2 = "korea";
		String s3 = s2;
		s3 = s3.toUpperCase();
		System.out.println(s2);
		System.out.println(s3);
		
		//문자열 뒤집기
		String ss = "algorithm";
		char[] schar = ss.toCharArray();
		int max = schar.length-1;
		int len = schar.length/2;	//가운데 첨자 찾는 것
		char temp;
		for(int i=0; i<len; i++) {
			temp = schar[i];
			schar[i] = schar[max-i];
			schar[max-i] = temp;
		}
		String sss = new String(schar);
		System.out.println(sss);
		
		//StringBilder 사용해서 문자열 뒤집기
		String ss1 = "algorithm";
		StringBuilder sb = new StringBuilder(ss);
		String sss1 = sb.reverse().toString();
		System.out.println(sss1);
		
		String jum = "100";
		int num1 = Integer.parseInt(jum, 2);	//2진수로 하는 것
		System.out.println(num1/10);
		
//		num1 값을 이진수로 변환하라(라이브러리 사용)
		num1 = 1234;
		System.out.println(Integer.toHexString(num1));
	}

}
