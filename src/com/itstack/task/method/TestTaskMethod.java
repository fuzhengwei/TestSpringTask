package com.itstack.task.method;

import org.springframework.stereotype.Service;

@Service
public class TestTaskMethod implements Runnable{

	public void run() {
		System.out.println("��ʱ����[5��ִ��һ��]�����Ƕ�ʱ���������������������Լ��Ŀ�ִ�з�����");
	}

}
