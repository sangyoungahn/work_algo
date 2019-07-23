
public class Solution {

	public static void main(String[] args) {
		String t = "java coding algo";
		String p = "coding";
//		int idx = findString(t, p);
//		int idx = t.contains(p);	//t.contatins - 문자열에 있냐 없냐만 판단하는 것
//		int idx = t.indexOf(p);		//t.indexOf - 몇번쨰 문자열에 있는지 판단하는 것
//		int idx = t.lastIndexOf(p);
		int idx = t.indexOf(p,10);
		System.out.println(idx);
	}
	static int findString(String t, String p) {
		char[] trr = t.toCharArray();
		char[] prr = p.toCharArray();
		int tSize = trr.length;
		int pSize = prr.length;
		
		//기저대역(시도해봐야 의미 없음)
		if(pSize > tSize) {
			return -1;
		}
		
		int idx = -1;
		boolean flag;
		for(int i=0; i<tSize-pSize; i++) {
			flag = true;
			for(int j=0; j<pSize; j++) {
				if(trr[i+j] != prr[j]) {
					flag = false;
					break;
				}
			}
			//for문을 다 돌고 나오면 같지 않다는 뜻
			if(flag) {
				return i;
//				idx = i;
//				break;
			}
		}
//		System.out.println(idx);
//		return idx;
		return -1;
	}

}
