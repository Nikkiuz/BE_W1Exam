package Player_Multimediale;

public class Main_Player {
	public static void main(String[] args){
		Audio myAudio = new Audio("MySong", 1,4);
		Video myVideo = new Video("MyFilm", 2,3,9);
		Immagine myImmagine = new Immagine("MyPhoto", 10);

		// Test Audio
		System.out.println("Audio: " + myAudio.getTitolo());
		myAudio.play();
		myAudio.aumentaVolume();
		myAudio.play();
		myAudio.diminuisciVolume();
		myAudio.play();

		// Test Video
		System.out.println("\nVideo: " + myVideo.getTitolo());
		myVideo.play();
		myVideo.aumentaVolume();
		myVideo.aumentaLuminosita();
		myVideo.play();
		myVideo.diminuisciVolume();
		myVideo.diminuisciLuminosita();
		myVideo.play();

		// Test Immagine
		System.out.println("\nImmagine: " + myImmagine.getTitolo());
		myImmagine.show();
		myImmagine.aumentaLuminosita();
		myImmagine.show();
		myImmagine.diminuisciLuminosita();
		myImmagine.show();
	}
}