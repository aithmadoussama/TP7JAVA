package exercice2;

public class FileSystem {

	private FsItem[] items;
	private int count;

	public FileSystem() {
		super();
		this.items = new FsItem[4];
		this.count = 0;
	}

	public FsItem[] getItems() {
		return items;
	}

	public void setItems(FsItem[] items) {
		this.items = items;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void addRoot(FsItem item) {
		if (items.length == count) {
			FsItem[] temp = new FsItem[items.length * 2];
			System.arraycopy(items, 0, temp, 0, items.length);
			items = temp;
		}
		items[count++] = item;
	}

	public void listAll() {
		for (int i = 0; i < count; i++) {
			FsItem f = items[i];
			if (f instanceof Directory) {
				((Directory) f).list(0);
			} else {
				System.out.println(f);
			}
		}
	}

	public long totalSize() {
		long sum = 0;
		for (int i = 0; i < count; i++) {
			sum += items[i].getSize();
		}
		return sum;
	}

}
