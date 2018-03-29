package kr.co.bit.review1;

import java.util.Calendar;

public class CalendarService {
	//�޼ҵ� ����
	// �޼ҵ� �̸� : viewMonth
	// ����Ÿ�� : ����
	// �Ķ���� ����Ʈ : ���� ��Ÿ���� int�� ����
	public void viewMonth(int year,int month) {

		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1,1);
		
		int day = 1;
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int space = cal.get(Calendar.DAY_OF_WEEK)-1;
		
		System.out.println("\t\t\t" + year + "�� " + month + "��");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
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
		System.out.println("\t\t\t2018�� " + month + "��");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
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
