package ex2;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello";
		String str2 = new String("hello");
		
		System.out.println(str1 == str2);
		
		String sub = str1.substring(0, 3);
		
		System.out.println(sub);
		System.out.println(str1);
		
		//1. 문자열 비교 
		System.out.println(str1.equals(str2));
		
		//2. 문자열 합치기
		String str3 = str1 + str2;
		String str4 = str1 + 1; // -> str1 + "1" -> str1 + new String("1")
		String str5 = str1.concat(str4);
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
		//3. 문자열 자르기
		
		//4. 문자열에 포함된 문자 또는 문자열 찾기  
		String str6 = "hello hey hi";
		int idx = str6.indexOf("h", 1);
		System.out.println(idx);
		System.out.println(idx>0 ? "있다" : "없다");
		
		
	}

}
