package in.basic.solid;

public class Guitar {
	private String make;
	private String model;
	private int volume;

	public Guitar() {
		super();
	}

	public Guitar(String make, String model, int volume) {
		super();
		this.make = make;
		this.model = model;
		this.volume = volume;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}
