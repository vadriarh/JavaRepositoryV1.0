package casting;

public class Store {
	static void test(Player p) {
		System.out.println("Start testing");
		p.play();
		System.out.println("Stop testing");
	}
	
	static void test2(Object o) {
		System.out.println("Start testing");
				
		if(o instanceof Player) {
			((Player)o).play();
		}		
		
		System.out.println("Stop testing");
	}
	
	static void test3(Object o) {
		System.out.println("Start testing");
		
		if(o.getClass()==Player.class) {
			((Player)o).play();
		}
		
		System.out.println("Stop testing");
	}
	
	static void test4(Object[] o) {
		System.out.println("Start testing");
		
		for (Object object : o) {
			if(object instanceof Player) {
				((Player) object).play();
				if(object.getClass()==MP3Player.class) {
					((MP3Player)object).mp3();	
				}else if(object.getClass()==Player.class) {
					((Player)object).player();
				}else if(object.getClass()==DVDPlayer.class) {
					((DVDPlayer)object).dvd();
				}else if(object.getClass()==TypePlayer.class) {
					((TypePlayer)object).type();
				}
			}else if(object.getClass()==String.class){
				System.out.println("Length: "+((String)object).length());
			}
		}
		
		
	}
	public static void main(String[] args) {
		Player p1 = new Player();
		// CASTING
		test(p1);
		// UPCASTING
		Player p2 = new MP3Player();
		test(p2);
		// DOWNCASTING
		// MP3Player p3 = (MP3Player) new Player();

		MP3Player p4 = (MP3Player) p2;
		test(p4);
	}

}
