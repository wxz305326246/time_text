package com.wxz;

import java.util.Timer;
import java.util.TimerTask;

public class test {
	static int num=1;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		TimerTask task = new TimerTask() {
			
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("执行定时任务"+num);
				num++;
			}
		};
		long start=1000;
		long jg=start*5;
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(task, start, jg);
	}

}
