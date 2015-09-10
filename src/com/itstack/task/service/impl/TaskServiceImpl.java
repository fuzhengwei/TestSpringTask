package com.itstack.task.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;

import com.itstack.task.method.TestTaskMethod;
import com.itstack.task.service.TaskService;
/**
 * 
 * @author fuzhengwei1
 *
 * ��ʱ��������
 * ������spring-quartz-jobs.xml �����е���
 *  
 */
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TestTaskMethod testTaskMethod;
	
	public void execute() {
		taskExecutor.execute(testTaskMethod);
	}
	
	// �������ļ���ע��
	private TaskExecutor taskExecutor;
	
	public TaskExecutor getTaskExecutor() {
		return taskExecutor;
	}
	public void setTaskExecutor(TaskExecutor taskExecutor) {
		this.taskExecutor = taskExecutor;
	}

}
