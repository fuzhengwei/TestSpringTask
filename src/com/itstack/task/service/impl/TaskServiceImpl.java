package com.itstack.task.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;

import com.itstack.task.method.TestTaskMethod;
import com.itstack.task.service.TaskService;
/**
 * 
 * @author fuzhengwei1
 *
 * 定时任务工作类
 * 此类由spring-quartz-jobs.xml 配置中调用
 *  
 */
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TestTaskMethod testTaskMethod;
	
	public void execute() {
		taskExecutor.execute(testTaskMethod);
	}
	
	// 由配置文件中注入
	private TaskExecutor taskExecutor;
	
	public TaskExecutor getTaskExecutor() {
		return taskExecutor;
	}
	public void setTaskExecutor(TaskExecutor taskExecutor) {
		this.taskExecutor = taskExecutor;
	}

}
