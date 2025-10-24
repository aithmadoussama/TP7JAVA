package exercice2;

public class Directory extends FsItem {

	private FsItem[] children ;
	private int count;

	public Directory(String name) {
		super(name);
		this.children = new FsItem[4];
		this.count = 0;
	}

	public FsItem[] getChildren() {
		return children;
	}

	public void setChildren(FsItem[] children) {
		this.children = children;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void add(FsItem file) {
		if (count == children.length) {
			FileItem[] temp = new FileItem[children.length * 2];
			System.arraycopy(children, 0, temp, 0, children.length);
			children = temp;
		}
		children[count++] = file;
	}

	@Override
	public long getSize() {
		long size = 0 ;
		for (int i = 0; i < count; i++) {
			size += children[i].getSize();
		}
		return size;
	}
	public void list(int indent) {
        System.out.println("  ".repeat(indent) + this);
        for (int i = 0; i < count; i++) {
            FsItem f = children[i];
            if (f instanceof Directory) {
                ((Directory)f).list(indent + 1);
            } else {
                System.out.println("  ".repeat(indent + 1) + f);
            }
        }
    }

}
