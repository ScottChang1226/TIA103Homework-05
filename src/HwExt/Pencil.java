package HwExt;

public class Pencil extends Pen{
	
	private double pencilPrice;
	
	public Pencil() {}
	
	public void write() {
		System.out.println("削鉛筆再寫。");
		super.write();
		System.out.println("價格為：" + pencilPrice + "元。");
		System.out.println("================");
	}
	
	public Pencil(String brand, double pencilPrice) {
		super((String)brand);
		this.pencilPrice = pencilPrice * 0.8;
	}
}
