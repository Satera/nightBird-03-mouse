package wood;
public class Point {
	private final int x;
	private final int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Point MoveUp() {
		return new Point(x, y - 1);
	}

	public Point MoveDown() {
		return new Point(x, y + 1);
	}

	public Point MoveLeft() {
		return new Point(x - 1, y);
	}

	public Point MoveRigth() {
		return new Point(x + 1, y);
	}
	
	public boolean equals(Point one){
		if((one.getX() == this.getX()) && (one.getY() == this.getY())){
			return true;
		}
		return false;
	}
}
