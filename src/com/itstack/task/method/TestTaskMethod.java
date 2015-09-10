package com.itstack.task.method;

import org.springframework.stereotype.Service;

@Service
public class TestTaskMethod implements Runnable{

	public void run() {
		System.out.println("定时任务[5秒执行一次]：我是定时任务，你可以在我这里添加自己的可执行方法。");
	}

}
