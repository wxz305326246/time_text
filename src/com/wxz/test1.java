package com.wxz;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class test1 {
	private static int num=0;
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("test1执行定时任务"+num);
				 
			}
		};
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.scheduleAtFixedRate(runnable, 5, 10, TimeUnit.SECONDS);
	}

}
