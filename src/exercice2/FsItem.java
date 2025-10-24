package exercice2;

public abstract class FsItem {
	private String name;

	public FsItem(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "FsItem [name=" + name + "]";
	}

	public abstract long getSize();

}
