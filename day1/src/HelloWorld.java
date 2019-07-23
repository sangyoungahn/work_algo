

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello 한글");
		System.out.println("Hello 한글");
		int a = 10;
//		byte, short, char, int, long, float, double
		
		for(int i = 0; i < 1000; i++) {
			
		}
		
		for(int i = 1000; i >= 0; i--) {	// 위의 for문보다 더 빠름(0과 비교하는 것이 훨씬 빠름)
			
		}
		
		float x = 20.4F;
		float y = (float)20.4;
		x++;
		++x;
		
		char ch = 65;
		
		System.out.println(ch);
		ch++;
		System.out.println(ch);
//		ch = ch + 1;	//char + int(4바이트) 형이 다른걸 더해서 에러
		
		byte b1, b2, b3;
		b1 = b2 = 4;
//		b3 = b1 + b2;	// byte = int + int
//		&& || ! . &, | . !	<,>,==,!=,>=,<=
//		+, -, *, /, %, (**)	7/3	7\3(파이썬에서는 역슬레시하면 몫만 나옴)
//		(4 > 2)? "aa" : "bb"
		
		String s = "1";
		s += "2";	// 아래것보다 성능이 좋음. 원래 알던 저장소에 넣음
		s = s + "2";
		
		int num = 100;
		
		if (num >2) {
			System.out.println("2보다 크다");
		} else {
			System.out.println("2보다 작거나 같다");
		}
		
		char num1 = 0;		//byte, short, int, char만 쓸 수 있음
		switch(num1) {
		case 'A' :	case 2 :
			break;
		case 3 :
			break;
		case 4 :
			break;
		default :
			System.out.println("그외");
			break;
		}
		
		String ss = "korea";
		switch(ss) {
		case "korea":
			break;
		}
		
//		while, for
		
//		for(int i = 1; i<= 10; i++) {
//			System.out.println(i);
//		}
		
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		while(true) {
			System.out.println(i);
			i++;
			if(i >= 10) {
				break;
//				continue;
			}
		}
		
		aaa:for(int i = 0; i < 10; i++) {
			for(int j = 0; j< 5; j++) {
				if(j == 2) {
					break aaa;
				}
				System.out.println(i + " , " + j);
			}
		}
		
//		int arr[] = {1,2,3,4,5};
//		
//		int[] brr[], crr, drr;	// brr이 2차원 배열, 나머지는 1차원 배열
//		
//		int k[], j, l;
		
		int[] arr = {1,2,3,4,5.0,6};
		
		System.out.println(arr.length);
		arr[0] = 90;
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		
		for(int n : arr) {
			sum += n;
		}
		System.out.println(sum);
		
		int[][] brr = new int[4][];
		brr[0] = new int[5];	//0번째 행에 1차원 배열을 또 붙인것
		
		int[][] brr = new int[4][];
		brr[0] = new int[5];
		brr[1] = new int[3];
		brr[2] = new int[7];
		brr[3] = new int[4];
		
		brr[2][6] = 99;
		
		System.out.println(brr[2][6]);
		System.out.println(brr[2][5]);
		
		for(int i = 0; i < brr.length; i++) {
			for(int j = 0; j < brr[i].length; j++) {
				System.out.print(brr[i][j] + " ");
				
			}
			System.out.println();
		}
		
		int[][] crr = {{}, {}, {}};		//다차원 배열
		
		int[][] crr = { {1,2,3},
						{4,5,6,7,8,9},
						{5,4,3,2} };
		
		for(int[] c : crr) {
			for(int n1 : c) {
				System.out.println(n1 + " ");
			}
			System.out.println();
		}
	}

}