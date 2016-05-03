package com.example.calculate;

import com.example.calculate.R;

import android.app.Activity;
import android.os.Bundle;
//import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {
	Button btn_0;
	Button btn_1;
	Button btn_2;
	Button btn_3;
	Button btn_4;
	Button btn_5;
	Button btn_6;
	Button btn_7;
	Button btn_8;
	Button btn_9;

	Button btn_point;// 小数点
	Button btn_divide;// 除以
	Button btn_multiply;// 乘以
	Button btn_minus;// 减去
	Button btn_pluse;// 加
	Button btn_equal;// 等于

	Button btn_clear;
	Button btn_del;

	EditText et_showview;
	boolean needclear;
	boolean isClickEqu;
	double num1=0,num2=0;
	double Result=0;
	int op=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn_0 = (Button) findViewById(R.id.btn_0);
		btn_1 = (Button) findViewById(R.id.btn_1);
		btn_2 = (Button) findViewById(R.id.btn_2);
		btn_3 = (Button) findViewById(R.id.btn_3);
		btn_4 = (Button) findViewById(R.id.btn_4);
		btn_5 = (Button) findViewById(R.id.btn_5);
		btn_6 = (Button) findViewById(R.id.btn_6);
		btn_7 = (Button) findViewById(R.id.btn_7);
		btn_8 = (Button) findViewById(R.id.btn_8);
		btn_9 = (Button) findViewById(R.id.btn_9);
		btn_point = (Button) findViewById(R.id.btn_dot);// 小数点
		btn_divide = (Button) findViewById(R.id.btn_devision);// 除以
		btn_multiply = (Button) findViewById(R.id.btn_x);// 乘以
		btn_minus = (Button) findViewById(R.id.btn_decrease);// 减去
		btn_pluse = (Button) findViewById(R.id.btn_and);// 加
		btn_equal = (Button) findViewById(R.id.btn_equal);// 等于

		btn_clear = (Button) findViewById(R.id.btn_clear);
		btn_del = (Button) findViewById(R.id.btn_delete);
		et_showview = (EditText) findViewById(R.id.editText1);

		btn_0.setOnClickListener(this);
		btn_1.setOnClickListener(this);
		btn_2.setOnClickListener(this);
		btn_3.setOnClickListener(this);
		btn_4.setOnClickListener(this);
		btn_5.setOnClickListener(this);
		btn_6.setOnClickListener(this);
		btn_7.setOnClickListener(this);
		btn_8.setOnClickListener(this);
		btn_9.setOnClickListener(this);

		btn_point.setOnClickListener(this);
		btn_divide.setOnClickListener(this);
		btn_multiply.setOnClickListener(this);
		btn_minus.setOnClickListener(this);
		btn_pluse.setOnClickListener(this);
		btn_equal.setOnClickListener(this);

		btn_clear.setOnClickListener(this);
		btn_del.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
//		String str = et_showview.getText().toString();
		switch (v.getId()) {
		 case R.id.btn_delete:
	            String myStr=et_showview.getText().toString();
	            try {
	            	et_showview.setText(myStr.substring(0, myStr.length()-1));
	            } catch (Exception e) {
	            	et_showview.setText("");
	            }

	            break;
	        case R.id.btn_clear:
	        	et_showview.setText(null);
	            break;

	            //btn0--9---------------------------
	        case R.id.btn_0:
	            if(isClickEqu)
	            {
	            	et_showview.setText(null);
	                isClickEqu=false;
	            }
	            String myString=et_showview.getText().toString();
	            myString+="0";
	            et_showview.setText(myString);
	            break;
	        case R.id.btn_1:
	            if(isClickEqu)
	            {
	            	et_showview.setText(null);
	                isClickEqu=false;
	            }
	            String myString1=et_showview.getText().toString();
	            myString1+="1";
	            et_showview.setText(myString1);
	            break;
	        case R.id.btn_2:
	            if(isClickEqu)
	            {
	            	et_showview.setText(null);
	                isClickEqu=false;
	            }
	            String myString2=et_showview.getText().toString();
	            myString2+="2";
	            et_showview.setText(myString2);
	            break;
	        case R.id.btn_3:
	            if(isClickEqu)
	            {
	            	et_showview.setText(null);
	                isClickEqu=false;
	            }
	            String myString3=et_showview.getText().toString();
	            myString3+="3";
	            et_showview.setText(myString3);
	            break;
	        case R.id.btn_4:
	            if(isClickEqu)
	            {
	            	et_showview.setText(null);
	                isClickEqu=false;
	            }
	            String myString4=et_showview.getText().toString();
	            myString4+="4";
	            et_showview.setText(myString4);
	            break;
	        case R.id.btn_5:
	            if(isClickEqu)
	            {
	            	et_showview.setText(null);
	                isClickEqu=false;
	            }
	            String myString5=et_showview.getText().toString();
	            myString5+="5";
	            et_showview.setText(myString5);
	            break;
	        case R.id.btn_6:
	            if(isClickEqu)
	            {
	            	et_showview.setText(null);
	                isClickEqu=false;
	            }
	            String myString6=et_showview.getText().toString();
	            myString6+="6";
	            et_showview.setText(myString6);
	            break;
	        case R.id.btn_7:
	            if(isClickEqu)
	            {
	            	et_showview.setText(null);
	                isClickEqu=false;
	            }
	            String myString7=et_showview.getText().toString();
	            myString7+="7";
	            et_showview.setText(myString7);
	            break;
	        case R.id.btn_8:
	            if(isClickEqu)
	            {
	            	et_showview.setText(null);
	                isClickEqu=false;
	            }
	            String myString8=et_showview.getText().toString();
	            myString8+="8";
	            et_showview.setText(myString8);
	            break;
	        case R.id.btn_9:
	            if(isClickEqu)
	            {
	            	et_showview.setText(null);
	                isClickEqu=false;
	            }
	            String myString9=et_showview.getText().toString();
	            myString9+="9";
	            et_showview.setText(myString9);
	            break;

	            //btn+-*/=--------------------------------
	        case R.id.btn_and:            
	            String myStringAdd=et_showview.getText().toString();
	            if(myStringAdd.equals(null))
	            {
	                return;
	            }
	            num1=Double.valueOf(myStringAdd);
	            et_showview.setText(null);
	            op=1;
	            isClickEqu=false;
	            break;

	        case R.id.btn_decrease:
	            String myStringSub=et_showview.getText().toString();
	            if(myStringSub.equals(null))
	            {
	                return;
	            }
	            num1=Double.valueOf(myStringSub);
	            et_showview.setText(null);
	            op=2;
	            isClickEqu=false;
	            break;
	        case R.id.btn_x:
	            String myStringMul=et_showview.getText().toString();
	            if(myStringMul.equals(null))
	            {
	                return;
	            }
	            num1=Double.valueOf(myStringMul);
	            et_showview.setText(null);
	            op=3;
	            isClickEqu=false;
	            break;
	        case R.id.btn_devision:
	            String myStringDiv=et_showview.getText().toString();
	            if(myStringDiv.equals(null))
	            {
	                return;
	            }
	            num1=Double.valueOf(myStringDiv);
	            et_showview.setText(null);
	            op=4;
	            isClickEqu=false;
	            break;
	        case R.id.btn_equal:
	            String myStringEqu=et_showview.getText().toString();
	            if(myStringEqu.equals(null))
	            {
	                return;
	            }
	            num2=Double.valueOf(myStringEqu);
	            et_showview.setText(null);
	            switch (op) {
	            case 0:
	                Result=num2;
	                break;
	            case 1:
	                Result=num1+num2;
	                break;
	            case 2:
	                Result=num1-num2;
	                break;
	            case 3:
	                Result=num1*num2;
	                break;
	            case 4:
	                Result=num1/num2;
	                break;
	            default:
	                Result=0;
	                break;
	            }
	            int r=(int)Result;
	            et_showview.setText(String.valueOf(r));
	            isClickEqu=true;
	            break;

	        default:
	            break;
	        }
	    } 
	}


