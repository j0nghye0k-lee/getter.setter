package testpage.getter_setter;

public class Car2 {

	//필드 생성
	//private 타입 fieldName;
	private int speed;
	private boolean stop;
	
	//생성자?????? 그게 뭔데요
	
	//메소드
	//getter, 외부에서 객체한테 스피드값을 받을때 speed를 줘라
	//public 리턴타입 getFieldName() { return fieldName;}
	public int getSpeed() {
		return speed;
	}
	
	//setter, 객체가 외부에게 데이터를 줄때는 아래 조건에 맞게 줘라
	//public void getFieldName(타입 fieldName) {this.fieldName = fieldName;}
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed=0;
		}
		else {
			this.speed=speed;
		}
	}
	
	//get
	public boolean isStop(){
		return stop;		
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
