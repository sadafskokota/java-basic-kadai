package kadai_015;

public class Car_Chapter15 {
	private int gear=1; //初期ギア1速
	private int speed=10;//初期速度10km/h
	
	//ギアチェンジメソッド
	public void gearChange(int afterGear) {
		System.out.println("ギア"+gear+"から"+afterGear+"に切り替えました");
		this.gear=afterGear;
		switch(afterGear) {
		case 1:
			speed=10;
		break;
		case 2:
			speed=20;
		break;
		case 3:
			speed=30;
		break;
		case 4:
			speed=40;
		break;
		case 5:
			speed=50;
		break;
		default:
			speed=10;
			break;
		
		}
		System.out.println("速度は時速"+speed+"kmです");
	}
	//走行メソッド
	public void run() {
		System.out.println("現在の速度は"+speed+"km/hです。");
	}

}
