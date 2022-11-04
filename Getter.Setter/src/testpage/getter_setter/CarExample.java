package testpage.getter_setter;

class Car {

	// 필드 생성
	// private 타입 fieldName;
	private int speed;
	private boolean stop;

	// 메소드
	// getter, 외부에서 객체한테 스피드값을 받을때 speed를 줘라
	// public 리턴타입 getFieldName() { return fieldName;}
	public int getSpeed() {
		return speed;
	}

	// setter, 객체가 외부에게 데이터를 줄때는 아래 조건에 맞게 줘라
	// public void getFieldName(타입 fieldName) {this.fieldName = fieldName;}
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
	}

	// getter,
	// public 리턴타입 getFieldName() { return fieldName;}
	public boolean isStop() {
		return stop;
//		return false;
//		return true;

	}

	// setter, 객체가 외부에게 데이터를 줄때는 아래 조건에 맞게 줘라
	// public void getFieldName(타입 fieldName) {this.fieldName = fieldName;}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}//Car class를 한 클래스에 다 넣은건데 만약에 나누고 싶다면 Car2파일을 사면 된다.


public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car(); // 객체 생성(인스턴스 생성)

		
		myCar.setSpeed(40);// 잘못된 속도 넣어보자

		System.out.println("현재 속도 : " + myCar.getSpeed());
	

		if (!myCar.isStop()) {
			myCar.setStop(false);
//			myCar.setStop(true);
			
		}

		System.out.println("지금 속도 : " + myCar.getSpeed());
	}
}

/*
 * 1. 지금 isstop에서 return값은 stop,true,false 셋다 넣어밨는데 stop과 false의 값이 똑같다 그러면 boolean
 * stop에서 stop은 false를 지칭하는건가요?
 *
 * 2. 클래스에서 setstop 부분 58행에서 왜 myCar.setStop(true) 이랑 myCar.setStop(false)값이 똑같나요? 
 * 이거 내가 어제 질문했던 testpage.throw_s.package의 myself 클래스 test1.test1(1,2);이거랑 같은 맥락인건가요?(이건 sc가 없잖아 아님)
 * 
 *
 */
