package kr.co.bit.review1;

import java.util.Calendar;

public class CalendarService {
	//메소드 정의
	// 메소드 이름 : viewMonth
	// 리턴타입 : 없음
	// 파라메터 리스트 : 월을 나타내는 int형 변수
	public void viewMonth(int year,int month) {

		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1,1);
		
		int day = 1;
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int space = cal.get(Calendar.DAY_OF_WEEK)-1;
		
		System.out.println("\t\t\t" + year + "년 " + month + "월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i=0; i<space; i++) {
			System.out.print("\t");
		}	
		
		for(int i=0;i<lastDay;i++) {
			System.out.print(day+"\t");
			if((space+day)%7==0) {
				System.out.println("");
			}
			day = day + 1;
		}
	}
	
	public void viewMonth(int month) {
		int[] lastDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		int[] spaces = {1,4,4,0,2,5,0,3,6,1,4,6};
		System.out.println("\t\t\t2018년 " + month + "월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int day = 1;
		int lastDay = lastDays[month-1];
		int space = spaces[month-1];
		/*if(month==4) {
			lastDay = 30;
			space = 0;
		} else if(month==5) {
			lastDay=31;
			space=2;
		}*/
		
		for(int i=0; i<space; i++) {
			System.out.print("\t");
		}	
		for(int i=0;i<lastDay;i++) {
			System.out.print(day+"\t");
			//if(day==7||day==14||day==21||day==28){
			if((space+day)%7==0) {
				System.out.println("");
			}
			day = day + 1;
		}
		/*System.out.println("1\t2\t3\t4\t5\t6\t7");
		System.out.println("8\t9\t10\t11\t12\t13\t14");
		System.out.println("15\t16\t17\t18\t19\t20\t21");
		System.out.println("22\t23\t24\t25\t26\t27\t28");
		System.out.println("29\t30");*/
	}
	
}
