package kr.co.bit.review1;

public class MainTest {

	public static void main(String[] args) {
		MainTest mt = new MainTest();
		mt.requestMonth();
		
	}
	
	public void requestMonth() {
		//CalendarService�� viewMonth�� ȣ���ϴ�
		//�ڵ� �ۼ�
		
		CalendarService cal = new CalendarService();
		cal.viewMonth(2018,2);
	}

}
