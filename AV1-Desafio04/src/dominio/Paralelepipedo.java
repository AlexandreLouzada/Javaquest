package dominio;
//import java.math.*;
public class Paralelepipedo {
	private float a;
	private float b;
	private float c;

	public Paralelepipedo(float a, float b, float c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}
	
	public float calculaDiagonal() {
		float lado, diagonal;
		lado = (float) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		diagonal = (float) Math.sqrt(Math.pow(lado, 2) + Math.pow(c, 2));
		return diagonal;
	}
}
