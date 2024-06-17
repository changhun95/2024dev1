package javaSample;

public class TVUser {

	public static void main(String[] args) {
		LGTv tv1 = new LGTv();
		tv1.turnOn();
		tv1.soundOn();
		tv1.soundOff();
		tv1.turnOff();
		
		SamsungTv tv = new SamsungTv();
		tv.powerOn();
		tv.volumeOn();
		tv.volumeOff();
		tv.powerOff();
	}

}
