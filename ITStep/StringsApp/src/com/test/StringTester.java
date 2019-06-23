package com.test;

public class StringTester {

	public static void main(String[] args) {
		String str = "moOse";// был создан объект типа str, объект был сохранен в пуле строк
//
//		String str2 = new String("test");// обычное создание объекта в heap
//		String str3 = "test";
//		System.out.println(str == str2);
//		System.out.println(str3 == str);
//		System.out.println(randomStr(7));

		//System.out.println(isIsogram(str));
		
		System.out.println(encode("wassdfa"));
	}

	public static boolean isIsogram(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (Character.isUpperCase(str.charAt(i))) {
					if (str.charAt(i) == str.charAt(j) || str.charAt(j) == (char)(str.charAt(i) + 32)) {
						return false;
					}
				} else {
					if (str.charAt(i) == str.charAt(j) || str.charAt(j) == (char)(str.charAt(i) - 32)) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public static String randomStr(int length) {
		String result = "";
		int ch;
		if (length < 0) {
			throw new IllegalArgumentException("Wrong lang " + length);
		}

		for (int i = 0; i < length; i++) {
			ch = (int) (Math.random() * 6);
			switch (ch) {
			case 0:
				result += 'A';
				break;

			case 1:
				result += 'B';
				break;

			case 2:
				result += 'C';
				break;

			case 3:
				result += 'D';
				break;

			case 4:
				result += 'E';
				break;

			case 5:
				result += 'F';
				break;
			}
		}

		return result;

	}
	
	static String encode(String word){
 	    String result="";
	    if(!word.isEmpty()){      
	      for(int i=0;i<word.length();i++){
	        if(word.startsWith(word.charAt(i)+"",i+1)){
	          result+=")";
	        } else{
	          result+="(";
	        }
	      }    
	    }
	    return result;
	  }
}
