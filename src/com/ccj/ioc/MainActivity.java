package com.ccj.ioc;

import com.ccj.ioc.annotation.InjectEvent;
import com.ccj.ioc.annotation.InjectLayout;
import com.ccj.ioc.annotation.InjectView;
import com.ccj.ioc.utils.InjectUtils;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;




//在编译成class文件后,编译器 会把注解处理成相应代码实现

@InjectLayout(R.layout.activity_main)
public class MainActivity extends Activity {
	
	@InjectView(R.id.tv_show)
	TextView tv_show;
	
	@InjectView(R.id.btn_click)
	Button btn_click;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//在view中注册,拿到activity实例
		InjectUtils.inject(this);
		tv_show.setText("Hello @InjectView tv_show");
		btn_click.setText("Hello @InjectView btn_click");
		
	}
	@InjectEvent({R.id.tv_show,R.id.btn_click})
	public void injectEvent(View view){
		Toast.makeText(this, " I am ", Toast.LENGTH_SHORT).show();

		switch (view.getId()) {
		case R.id.tv_show:
			Toast.makeText(this, " I am tv_show", Toast.LENGTH_SHORT).show();
			break;
		case R.id.btn_click:
			Toast.makeText(this, " I am btn_click", Toast.LENGTH_SHORT).show();

			break;
		default:
			break;
		}
	}
	
}
