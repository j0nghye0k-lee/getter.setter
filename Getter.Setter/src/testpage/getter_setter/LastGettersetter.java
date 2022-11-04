package testpage.getter_setter;

class Vehicle {
	private String color;

	// Getter 출력
	public String getColor() {
		return color;
	}

	// Setter 입력
	public void setColor(String c) {
		this.color = c;
	}
}

public class LastGettersetter {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.setColor("Red");
		System.out.println(v1.getColor());
	}
}
