
public interface InterFace01 {

}

interface MobilePhone {
	boolean sendCall();
	boolean receiveCall();
	boolean sendSMS();
	boolean receiveSMS();
}

interface MP3 {
	void play();
	void stop();
}

interface MusicPhone extends MobilePhone, MP3 {
	void playMP3RingTone();
}
