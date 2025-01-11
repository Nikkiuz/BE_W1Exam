package Player_Multimediale;

public class Video extends ElementoMultimediale implements Riproducibile, Luminosita{
	private int durata;
	private int volume;
	private int luminosita;

	public Video(String titolo, int durata, int volume, int luminosita){
		super (titolo);
		this.durata= durata;
		this.volume=volume;
		this.luminosita = luminosita;
	}

	@Override
	public void aumentaVolume() {
		volume++;
	}

	@Override
	public void diminuisciVolume() {
		if (volume>0){
			volume--;
		}
	}

	@Override
	public void aumentaLuminosita(){
		luminosita++;
	}

	@Override
	public void diminuisciLuminosita(){
		if (luminosita>0){
			luminosita--;
		}
	}

	@Override
	public void play() {
		for (int i=0; i<durata; i++) {
			System.out.println(titolo+" "+"!".repeat(volume)+" "+"*".repeat(luminosita));
		}
	}

}
