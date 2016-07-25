package com.yashketkar.horoscope2012;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class HoroscopeActivity extends AppCompatActivity {

    TextView futureTextView;
    int sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horoscope);
        futureTextView = (TextView) findViewById(R.id.futureTextView);
        futureTextView.setMovementMethod(new ScrollingMovementMethod());
        sign = getIntent().getIntExtra("sign", 0);
        switch (sign) {
            case 1:
                futureTextView.setText(R.string.aries_2012);
                break;
            case 2:
                futureTextView.setText(R.string.taurus_2012);
                break;
            case 3:
                futureTextView.setText(R.string.gemini_2012);
                break;
            case 4:
                futureTextView.setText(R.string.cancer_2012);
                break;
            case 5:
                futureTextView.setText(R.string.leo_2012);
                break;
            case 6:
                futureTextView.setText(R.string.virgo_2012);
                break;
            case 7:
                futureTextView.setText(R.string.libra_2012);
                break;
            case 8:
                futureTextView.setText(R.string.scorpio_2012);
                break;
            case 9:
                futureTextView.setText(R.string.sagittarius_2012);
                break;
            case 10:
                futureTextView.setText(R.string.capricorn_2012);
                break;
            case 11:
                futureTextView.setText(R.string.aquarius_2012);
                break;
            case 12:
                futureTextView.setText(R.string.pisces_2012);
                break;
            default:
                futureTextView.setText(R.string.default_2012);
                break;
        }
    }
}