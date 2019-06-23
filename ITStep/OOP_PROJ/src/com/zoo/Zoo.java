package com.zoo;

public class Zoo {
	public static void main(String[] args) {
		Lion l = new Lion();
		l.age = 5;
		l.name = "Alex";
		l.isWild = true;
		l.weight = 150;
		l.isKing = true;

		Lion s = new Lion();
		s.age = 1;
		s.name = "Symba";
		s.isWild = true;
		s.weight = 125;
		s.isKing = true;

		Lion pride[] = { l, s };
		for (Lion lion : pride) {
			lion.toString(3);
		}
		
		Tiger t=new Tiger();
		t.name="alex";
		Tiger t_copy=null;
		try {
			t_copy=(Tiger) t.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		food(t);

		food(t_copy);
		
		
	}
	
	static void food(Eatable eat) {
		eat.eat();
	}

}
