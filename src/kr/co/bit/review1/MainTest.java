package kr.co.bit.review1;

public class MainTest {

	public static void main(String[] args) {
		MainTest mt = new MainTest();
		mt.requestMonth();
		
	}
	
	public void requestMonth() {
		//CalendarService의 viewMonth를 호출하는
		//코드 작성
		
		CalendarService cal = new CalendarService();
		cal.viewMonth(2018,2);
	}

}
