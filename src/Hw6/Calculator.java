package Hw6;

public class Calculator {
	private int x, y;
	
	public Calculator() {
		
	}
	
	public Calculator(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int powerXY(int x, int y) throws CalException {
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義，請重新輸入。");
		} else if(y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數，請重新輸入。");
		} else {
			int ans = (int)Math.pow(x, y);
			return ans;
		}

	}
}
