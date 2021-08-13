package dominio;

public class Forma {
	private float x;
	private float y;
	private float z;

	public Forma(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public float getZ() {
		return z;
	}
	public void setZ(float z) {
		this.z = z;
	}

	public String verificaForma() {
		if(x < y + z && y < x + z && z < x + y)   {
			if(x==z && z==y) {
				return "tri�ngulo equil�tero";
			}

			else if(x==y || z==y || x==z) {
				return "tri�ngulo isosceles";
			}

			else
				return "tri�ngulo escaleno";
		}

		else
			return "n�o � um tri�ngulo";
	}

}
