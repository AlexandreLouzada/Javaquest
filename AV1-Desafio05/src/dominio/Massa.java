package dominio;

public class Massa {
	private float massaInicial;
	private float massaFinal;
	private int tempo;

	public Massa(float massaInicial) {
		
		this.massaInicial = massaInicial;
	}

	public float getMassaInicial() {
		return massaInicial;
	}
	public void setMassaInicial(float massaInicial) {
		this.massaInicial = massaInicial;
	}
	public float getMassaFinal() {
		return massaFinal;
	}
	public void setMassaFinal(float massaFinal) {
		this.massaFinal = massaFinal;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	public void calculaTempo() {
		massaFinal = massaInicial;
		while (massaFinal >= 0.5) {
			massaFinal/=2; 
			tempo += 50;   
		}
	}
	
}
	

	

