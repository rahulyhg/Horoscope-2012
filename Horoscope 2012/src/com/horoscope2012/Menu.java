package com.horoscope2012;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
 
public class Menu extends Activity implements OnClickListener{
   /** Called when the activity is first created. */
	int dd, mm, yy, sign,spcount=0;
	DatePicker d;
	Button g;
   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.main);
        g = (Button) findViewById(R.id.buttongo);
		d = (DatePicker) findViewById(R.id.datePickerdob);
		g.setOnClickListener(this);
   }
@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	dd = d.getDayOfMonth();
	mm = d.getMonth() + 1;
	yy = d.getYear();
	switch (mm) {
	case (1):
		if (dd > 20) {
			sign = 11;
		} else if (dd <= 20) {
			sign = 10;
		}
		break;
	case (2):
		if (dd < 20) {
			sign = 11;
		} else if (dd >= 20) {
			sign = 12;
		}
		break;
	case (3):
		if (dd <= 20) {
			sign = 12;
		} else if (dd > 20) {
			sign = 1;
		}
		break;
	case (4):
		if (dd <= 20) {
			sign = 1;
		} else if (dd > 20) {
			sign = 2;
		}
		break;

	case (5):
		if (dd <= 21) {
			sign = 2;
		} else if (dd >= 22) {
			sign = 3;
		}
		break;

	case (6):
		if (dd <= 21) {
			sign = 3;
		} else if (dd >= 22) {
			sign = 4;
		}
		break;

	case (7):
		if (dd <= 23) {
			sign = 4;
		} else if (dd >= 24) {
			sign = 5;
		}
		break;

	case (8):
		if (dd <= 23) {
			sign = 5;
		} else if (dd >= 24) {
			sign = 6;
		}
		break;

	case (9):
		if (dd <= 23) {
			sign = 6;
		} else if (dd >= 24) {
			sign = 7;
		}
		break;

	case (10):
		if (dd <= 23) {
			sign = 7;
		} else if (dd >= 24) {
			sign = 8;
		}
		break;

	case (11):
		if (dd <= 22) {
			sign = 8;
		} else if (dd >= 23) {
			sign = 9;
		}
		break;

	case 12:
		if (dd <= 21) {
			sign = 9;
		} else if (dd >= 22) {
			sign = 10;
		}
		break;

	default:
		sign = 0;
		break;
	}
	Intent nextScreen = new Intent(getApplicationContext(), Horoscope.class);
	nextScreen.putExtra("name", Integer.toString(sign));
	startActivity(nextScreen);
}
}