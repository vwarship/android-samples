package com.vwarship.androidexamples.listview;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	private ListView m_listView;
	private ArrayAdapter<String> m_adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		m_adapter = new ArrayAdapter<String>(this, 
				android.R.layout.simple_list_item_1, 
				getDataSource());
		
		m_listView = (ListView)this.findViewById(R.id.listView);
		m_listView.setAdapter(m_adapter);
	}

	/*
	  	Ŀǰ�й���34��ʡ������������23��ʡ��5����������4��ֱϽ�С�2���ر���������
		һ���ĸ�ֱϽ�� 
			1������������2����򣨽� 3���Ϻ�������4�����죨�壩
		������������� 
			1�����ɹ������������ɹţ�2��ά������������£�3���������������أ�4�����Ļ���������������5������׳������������
		���������ر������� 
			1������ر����������ۣ�2�������ر����������ģ�
		�ġ�23��ʡ 
			1��������ʡ���ڣ�2������ʡ������3������ʡ���ɣ�4���ӱ�ʡ������5��ɽ��ʡ������6���ຣʡ���ࣩ7��ɽ��ʡ��³��
			8������ʡ��ԥ���ų� 9������ʡ���գ� 10������ʡ��� 11���㽭ʡ���㣩 12������ʡ������ 13������ʡ���ӣ� 
			14������ʡ���棩 15������ʡ������ 16���㶫ʡ������ 17��̨��ʡ��̨�� 18������ʡ���� 19������ʡ���ʻ�¤�� 
			20������ʡ���»��أ� 21���Ĵ�ʡ�������� 22������ʡ�����ǭ�� 23������ʡ���ƻ�ᣩ
	 */
	private List<String> getDataSource() {
		List<String> ls = new ArrayList<String>();
		ls.add("����");
		ls.add("���");
		ls.add("�Ϻ�");
		ls.add("����");
		ls.add("���ɹ�������");
		ls.add("ά���������");
		ls.add("����������");
		ls.add("���Ļ���������");
		ls.add("����׳��������");
		ls.add("����ر�������");
		ls.add("�����ر�������");
		ls.add("������ʡ");
		ls.add("����ʡ");
		ls.add("����ʡ");
		ls.add("�ӱ�ʡ");
		ls.add("ɽ��ʡ");
		ls.add("�ຣʡ");
		ls.add("ɽ��ʡ");
		ls.add("����ʡ");
		ls.add("����ʡ");
		ls.add("����ʡ");
		ls.add("�㽭ʡ");
		ls.add("����ʡ");
		ls.add("����ʡ");
		ls.add("����ʡ");
		ls.add("����ʡ");
		ls.add("�㶫ʡ");
		ls.add("̨��ʡ");
		ls.add("����ʡ");
		ls.add("����ʡ");
		ls.add("����ʡ");
		ls.add("�Ĵ�ʡ");
		ls.add("����ʡ");
		ls.add("����ʡ");
		return ls;
	}

}
