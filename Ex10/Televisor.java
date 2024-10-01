package Ex10;
public class Televisor {

	private int canal = 0;
	private int volume = 0;

	public Televisor(int canal, int volume) {
		setCanal(canal);
		setVolume(volume);
	}

	public Televisor(int canal) {
		setCanal(canal);
	}

	public Televisor() {

	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void mudarCanal(int canal) {
		setCanal(canal);
	}

	public void aumentarVolume(int volume) {
		this.volume += volume;
	}
	
	public void diminuirVolume(int volume) {
		this.volume -= volume;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Televisor [canal=");
		builder.append(canal);
		builder.append(", volume=");
		builder.append(volume);
		builder.append("]");
		return builder.toString();
	}
	
	
}
