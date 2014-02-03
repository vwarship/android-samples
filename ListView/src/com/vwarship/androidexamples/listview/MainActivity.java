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
	  	目前中国有34个省级行政区，即23个省、5个自治区、4个直辖市、2个特别行政区。
		一、四个直辖市 
			1、北京（京）2、天津（津） 3、上海（沪）4、重庆（渝）
		二、五个自治区 
			1、内蒙古自治区（内蒙古）2、维吾尔自治区（新）3、西藏自治区（藏）4、宁夏回族自治区（宁）5、广西壮族自治区（桂）
		三、两个特别行政区 
			1、香港特别行政区（港）2、澳门特别行政区（澳）
		四、23个省 
			1、黑龙江省（黑）2、吉林省（吉）3、辽宁省（辽）4、河北省（冀）5、山西省（晋）6、青海省（青）7、山东省（鲁）
			8、河南省（豫）古称 9、江苏省（苏） 10、安徽省（皖） 11、浙江省（浙） 12、福建省（闽） 13、江西省（赣） 
			14、湖南省（湘） 15、湖北省（鄂） 16、广东省（粤） 17、台湾省（台） 18、海南省（琼） 19、甘肃省（甘或陇） 
			20、陕西省（陕或秦） 21、四川省（川或蜀） 22、贵州省（贵或黔） 23、云南省（云或滇）
	 */
	private List<String> getDataSource() {
		List<String> ls = new ArrayList<String>();
		ls.add("北京");
		ls.add("天津");
		ls.add("上海");
		ls.add("重庆");
		ls.add("内蒙古自治区");
		ls.add("维吾尔自治区");
		ls.add("西藏自治区");
		ls.add("宁夏回族自治区");
		ls.add("广西壮族自治区");
		ls.add("香港特别行政区");
		ls.add("澳门特别行政区");
		ls.add("黑龙江省");
		ls.add("吉林省");
		ls.add("辽宁省");
		ls.add("河北省");
		ls.add("山西省");
		ls.add("青海省");
		ls.add("山东省");
		ls.add("河南省");
		ls.add("江苏省");
		ls.add("安徽省");
		ls.add("浙江省");
		ls.add("福建省");
		ls.add("江西省");
		ls.add("湖南省");
		ls.add("湖北省");
		ls.add("广东省");
		ls.add("台湾省");
		ls.add("海南省");
		ls.add("甘肃省");
		ls.add("陕西省");
		ls.add("四川省");
		ls.add("贵州省");
		ls.add("云南省");
		return ls;
	}

}
