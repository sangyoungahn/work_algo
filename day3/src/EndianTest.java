
public class EndianTest {

	public static void main(String[] args) {
		int a = 654321;
//		A B C D		D c B A(리틀 엔디안) -> 이렇게 해야 654321로 출력됨
		
		byte[] arr = intToByteArr(a);
		
		int b = byteArrToInt(arr);
		System.out.println(b);
	}
	
	static int byteArrToInt(byte[] brr) {
		int num = (brr[0] & 0xff) + (brr[1] & 0xff) << 8
				+ ((brr[1] & 0xff) << 16)
				+ ((brr[1] & 0xff) << 24);
		return num;
	}
	
	//int를 바이트 배열로 만드는 함수
	static byte[] intToByteArr(int num) {
		byte[] res = new byte[4];
		res[0] = (byte)num;		//캐스팅 - 앞자리 버리고 뒷자리만 출력하는 것
		res[1] = (byte)(num >>> 8);		
		res[2] = (byte)(num >>> 16);		
		res[3] = (byte)(num >>> 24);		
		return res;
	}

}
