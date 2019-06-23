package wrappers;

public class TestWrappers {

	public static void main(String[] args) {
		double d = 1.2;
		float f = 2.34f;
		short s = 12;
		byte b = 122;
		int i = 1234;
		long l = 177932;

		doSomethingWithNumber(d);
		doSomethingWithNumber(f);
		doSomethingWithNumber(s);
		doSomethingWithNumber(b);
		doSomethingWithNumber(i);
		doSomethingWithNumber(l);

		System.out.println();
		Object[] wrippers = { 12, 24f, 22L, "kjf,", 12.2, null };

		System.out.println("SUMMA = " + summarizeNumbers(wrippers));

		System.out.println();
		Object[] wrippersNew = new Object[wrippers.length + 3];
		for (int j = 0; j < wrippers.length; j++) {
			wrippersNew[j]=wrippers[j];
		}
		wrippersNew[wrippers.length] = new String("123");
		wrippersNew[wrippers.length + 1] = new String("a1b2c3");
		wrippersNew[wrippers.length + 2] = new String("tryToParseMe");
		wrippers=wrippersNew;
		System.out.println("SUMMA = " + summarizeNumbers(wrippers));

		System.out.println();
		System.out.println(parseNumber("01563.0adg12hk5g32"));

		System.out.println();
		String str = generateStringWithDigits();
		System.out.println(str);
		
		System.out.println();
		Character[] arr= {'a','3',null,55,'B'};
		tX(arr);
		
	}

	static void doSomethingWithNumber(Object obj) {
		if (obj != null) {
			if (obj instanceof Number) {
				if (obj.getClass() == Byte.class) {
					System.out.println("Value = " + ((Byte) obj).toString() + ". BYTE TYPE.");
				} else if (obj.getClass() == Short.class) {
					System.out.println("Value = " + ((Short) obj).toString() + ". SHORT TYPE.");
				} else if (obj.getClass() == Integer.class) {
					System.out.println("Value = " + ((Integer) obj).toString() + ". INTEGER TYPE.");
				} else if (obj.getClass() == Long.class) {
					System.out.println("Value = " + ((Long) obj).toString() + ". LONG TYPE.");
				} else if (obj.getClass() == Float.class) {
					System.out.println("Value = " + ((Float) obj).toString() + ". FLOAT TYPE.");
				} else if (obj.getClass() == Double.class) {
					System.out.println("Value = " + ((Double) obj).toString() + ". DOUBLE TYPE.");
				}
			} else {
				System.out.println("OBJECT NOT NUMBER.");
			}
		} else {
			System.out.println("OBJECT IS NULL.");
		}
	}

	static double summarizeNumbers(Object[] obj) {
		if (obj != null) {
			double summa = 0;
			for (int i = 0; i < obj.length; i++) {
				if (obj[i] == null) {
					System.out.println("OBJECT #" + (i + 1) + " IS NULL");
				} else if (obj[i] instanceof Number) {
					if (obj[i].getClass() == Byte.class) {
						summa += ((Byte) obj[i]).byteValue();
					} else if (obj[i].getClass() == Short.class) {
						summa += ((Short) obj[i]).shortValue();
					} else if (obj[i].getClass() == Integer.class) {
						summa += ((Integer) obj[i]).intValue();
					} else if (obj[i].getClass() == Long.class) {
						summa += ((Long) obj[i]).longValue();
					} else if (obj[i].getClass() == Float.class) {
						summa += ((Float) obj[i]).floatValue();
					} else if (obj[i].getClass() == Double.class) {
						summa += (Double) obj[i];
					}
				} else if (obj[i].getClass() == String.class) {
					Number temp=(parseNumber((String) obj[i]));
					if(temp!=null) {
						summa +=temp.doubleValue();
					}else {
						System.out.println("OBJECT #" + (i + 1) + " IS NOT NUMBER");
					}
					
				} else {
					System.out.println("OBJECT #" + (i + 1) + " IS NOT NUMBER");
				}
			}
			return summa;
		} else {
			System.out.println("OBJECT[] IS NULL.");
			return 0;
		}
	}

	static Number parseNumber(String str) {
		if (str != null) {
			double result = 0;
			char[] array = str.toCharArray();
			boolean isTchFound = false, isDigitFound = false;
			for (int i = 0, temp = 1; i < array.length; i++) {
				if (!isTchFound) {
					if (Character.isDigit(array[i])) {
						isDigitFound = true;
						result = result * 10 + Integer.parseInt(array[i] + "");
					} else if (array[i] == '.' || array[i] == ',') {
						isTchFound = true;
					}
				} else {
					if (Character.isDigit(array[i])) {
						isDigitFound = true;
						result += Math.pow(10, (-1) * temp) * Integer.parseInt(array[i] + "");
						temp++;
					}
				}
			}
			if (isDigitFound) {
				if (result - (int) result != 0) {
					Double number = Double.parseDouble(result + "");
					return number;
				} else {
					if (result > Integer.MAX_VALUE) {
						Long number = Long.parseLong((int)result + "");
						return number;
					} else {
						Integer number = Integer.parseInt((int)result + "");
						return number;
					}
				}
			} else {
				System.out.println("NOT FOUNDS DIGITS.");
				return null;
			}
		} else {
			System.out.println("STRING IS NULL");
			return null;
		}
	}

	static String generateStringWithDigits() {
		int size = 5 + (int)( Math.random() * 15);
		char[] array = new char[size];
		for (int i = 0; i < array.length; i++) {
			if((int)(Math.random()*3)!=0) {
				array[i] = (char) (33+(int) (Math.random() * (126-33)));
			}else {
				array[i] = (char) (48+(int) (Math.random() * (58-48)));
			}			
		}
		return new String(array);
	}
	
	static void tX(Object obj){ 
		if(obj!=null) {
			if(obj instanceof Character[]) {
				Character[] array=(Character[])obj;
				int sizeArray=array.length;
				int countUpperCase=0;

				System.out.print("INPUT ARRAY: ");				
				for (int i = 0; i < array.length; i++) {
					if(array[i]==null) {
						System.out.print(" "+array[i]+" ");
					}else {
						System.out.print(array[i]);
					}					
				}
				System.out.println();
				
				System.out.print("REVERSE ARRAY: ");				
				for (int i = 0; i <sizeArray; i++) {
					if(array[i]==null) {
						System.out.print(" "+array[sizeArray-1-i]+" ");
					}else {
						System.out.print(array[sizeArray-1-i]);
					}
				}
				System.out.println();
				
				System.out.print("CHARACTERS IN UPPERCASE: ");
				for (Character ch : array) {
					if(ch!=null&&Character.isUpperCase(ch)) {
						countUpperCase++;
						System.out.print(ch);
					}
				}
				if(countUpperCase==0) {
					System.out.println("NONE");
				}
			}
		}
	}
}