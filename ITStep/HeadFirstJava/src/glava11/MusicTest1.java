package glava11;

//import javax.sound.midi.*;

public class MusicTest1 {
	
	public void play() {
//		try {
		//	Sequencer sequencer=MidiSystem.getSequencer();
			System.out.println("Вы удачно получили синтезатор");
//		} catch (MidiUnavailableException e) {
			System.out.println("Неудача");
//		}
		System.out.println("Мы получили синтезатор");
	}

	public static void main(String[] args) {
		MusicTest1 mt =new MusicTest1();
		mt.play();

	}

}
