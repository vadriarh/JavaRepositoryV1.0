package glava2;

class DrumKit {
	boolean topHat = true;
	boolean snare = true;

	void playSnare() {
		System.out.println("��� ��� ��-���");
	}

	void playTopHat() {
		System.out.println("���� ���� ��-����");
	}

}

public class DrumKitTestDrive {
	public static void main(String[] args) {
		DrumKit d = new DrumKit();
		if (d.snare == true) {
			d.playSnare();
		}
		d.playTopHat();
	}
}
