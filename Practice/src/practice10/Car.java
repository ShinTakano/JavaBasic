package practice10;

public class Car {

	
	
	int serialNo;
	String color;
	int gasoline;

	int run() {
		gasoline -= 1;
		int random = new java.util.Random().nextInt(15) + 1;
		if (gasoline < 0) {
			return -1;
		} else
			return random;

	}
}
