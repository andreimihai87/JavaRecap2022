package amd.caveofprogramming.section6.we95and96;

public class Window {

	private int height;
	private int width;
	private boolean isVisible;
	private int top;
	private int left;

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	public void setVisibility(boolean isVisible) {
		this.isVisible = isVisible;
	}

	public boolean getVisibility() {
		return isVisible;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public void resizeWindow(int newHeight, int newWidth) {
		height = newHeight;
		width = newWidth;
	}

}
