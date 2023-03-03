package ch06.exercise.exam18;

public class ShopService {

	private static ShopService singleton = new ShopService();

	private ShopService() {
	}

	public static ShopService getInstance() {
		return singleton;
	}

}
