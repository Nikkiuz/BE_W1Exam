package Player_Multimediale;

import java.util.Scanner;

public class Main_Player {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Creazione dell'array di 5 elementi
		ElementoMultimediale[] elementi = new ElementoMultimediale[5];

		for (int i = 0; i < elementi.length; i++) {
			System.out.println("Crea l'elemento " + (i + 1));
			System.out.println("Scegli il tipo di elemento (1 = Audio, 2 = Video, 3 = Immagine): ");
			int tipo = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Inserisci il titolo: ");
			String titolo = scanner.nextLine();

			switch (tipo) {
				case 1: // Audio
					System.out.println("Inserisci la durata (in secondi): ");
					int durataAudio = scanner.nextInt();

					System.out.println("Inserisci il volume iniziale: ");
					int volumeAudio = scanner.nextInt();

					elementi[i] = new Audio(titolo, durataAudio, volumeAudio);
					break;

				case 2: // Video
					System.out.println("Inserisci la durata (in secondi): ");
					int durataVideo = scanner.nextInt();

					System.out.println("Inserisci il volume iniziale: ");
					int volumeVideo = scanner.nextInt();

					System.out.println("Inserisci la luminosità iniziale: ");
					int luminositaVideo = scanner.nextInt();

					elementi[i] = new Video(titolo, durataVideo, volumeVideo, luminositaVideo);
					break;

				case 3: // Immagine
					System.out.println("Inserisci la luminosità iniziale: ");
					int luminositaImmagine = scanner.nextInt();

					elementi[i] = new Immagine(titolo, luminositaImmagine);
					break;

				default:
					System.out.println("Scelta non valida. Riprovare.");
			}
		}

		// Scelta elementi
		int sceltaOggetto;
		do {
			System.out.println("\nQuale elemento vuoi eseguire? (1-5, 0 per terminare): ");
			sceltaOggetto = scanner.nextInt();

			if (sceltaOggetto > 0 && sceltaOggetto <= 5) {
				ElementoMultimediale elemento = elementi[sceltaOggetto - 1];

				System.out.println("\nEsecuzione dell'elemento: " + elemento.getTitolo());
				if (elemento instanceof Audio) {
					Audio audio = (Audio) elemento;
					audio.aumentaVolume();
					audio.play();
					audio.diminuisciVolume();
					audio.play();
				} else if (elemento instanceof Video) {
					Video video = (Video) elemento;
					video.aumentaVolume();
					video.play();
					video.diminuisciVolume();
					video.play();
					video.aumentaLuminosita();
					video.play();
					video.diminuisciLuminosita();
					video.play();
				} else if (elemento instanceof Immagine) {
					Immagine immagine = (Immagine) elemento;
					immagine.aumentaLuminosita();
					immagine.show();
					immagine.diminuisciLuminosita();
					immagine.show();
				}
			} else if (sceltaOggetto != 0) {
				System.out.println("Scelta non valida. Riprova.");
			}
		} while (sceltaOggetto != 0);


		scanner.close();
		System.out.println("Programma terminato.");
	}
}