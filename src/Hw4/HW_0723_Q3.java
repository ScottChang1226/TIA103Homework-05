package Hw4;

public class HW_0723_Q3 {

	public static void main(String[] args) {
		String [] inputText = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		String arrToStr = String.join("", inputText);
		char [] strToCh = arrToStr.toCharArray();
		
		int j = 0;
		for(int i = 0; i < arrToStr.length(); i++) {
			if (strToCh[i] == 'a' || strToCh[i] == 'e'||strToCh[i] == 'i'||strToCh[i] == 'o'||strToCh[i] == 'u') {
				j++;
			} else {
				
			}
		}
		
		System.out.println("陣列中母音的字元總數為：" + j + "。");
		
	}


}
