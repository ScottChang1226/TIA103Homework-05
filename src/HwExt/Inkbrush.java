package HwExt;

public class Inkbrush extends Pen{
	private double inkbrushPrice;
	
	public Inkbrush() {}
	
	public void write() {
		System.out.println("沾墨汁再寫。");
		super.write();
		System.out.println("價格為：" + inkbrushPrice + "元。");
		System.out.println("================");
	}
	
	public Inkbrush(String brand, double inkbrushPrice) {
		super((String)brand);
		this.inkbrushPrice = inkbrushPrice * 0.9;
		
	}
	
	
}
