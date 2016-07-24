package com.horoscope2012;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Horoscope extends Activity {
	String name;
	Intent i;
	TextView txt;
	int sign2;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.horoscope);
		i = getIntent();
		name = i.getStringExtra("name");
		txt = (TextView) findViewById(R.id.textViewfut);
		txt.setMovementMethod(new ScrollingMovementMethod());
		sign2 = Integer.parseInt(name);
		switch (sign2) {
		case 1:
			txt.setText("Aries Horoscope:\nMembers born under this sign can expect a good year in 2012.Your finances will show great improvement over the coming days. Income will remain steady and you may experience a windfall between May and July of 2012. The time is also good to plan for investment and cash in old funds.\n\nLove life will remain steady and bachelors can expect to get married in 2012. There can be some issues with your partner or spouse due to differences in temperament. But overall family life will remain blissful.");
			break;
		case 2:
			txt.setText("Taurus Horoscope:\nTaurians can expect an exciting time in 2012. You may experience a major improvement in your life and career in the new year. Your hard work, which you have put forth so far, will help you achieve great feats. Both monetary and professional recognition will come your way. If you have plans to buy property, 2012 is also a good time for that.\n\nTaurians are normally satisfied in their love and marital life. They enjoy stable and fulfilling relationships. Love life for Taurians will remain great in 2012 as well.");
			break;
		case 3:
			txt.setText("Gemini Horoscope:\nGeminis can close some profitable deals during 2012. The second half of the next year is going to be especially suitable for property buying. Your career path will see steady growth and you’ll continue to mount higher in your career. However, there can be some worries regarding expenses, which can be more than your income.\n\nThe middle of the year is going to be especially good for those in search of life partners. Love may come your way in most unexpected ways.");
			break;
		case 4:
			txt.setText("Cancer Horoscope:\nCancerians can expect a mixed year. There will be moments of both happiness and pessimism. Negative thoughts may keep harboring in your mind. However, don’t let negative thoughts spoil your spirit. Stay away from unnecessary worrying as there are also good things in store in 2012. Income will rise after May 2012. This will bring social recognition for you as well. Love life will remain steady and exciting. Cancerians who are still single may meet their life partners in this year.\n\nCancerians, however, may avoid differences in opinion and family feuds");
			break;
		case 5:
			txt.setText("Leo Horoscope:\nThe power sign of the zodiac chart will continue to accumulate more power in 2012. Your social status and career is once again on a rising path. You’ll be assisted by luck throughout the year. Finances, however, may remain low. There can be reasons for little financial worries, especially after May 2012.\n\n2012 is not the right time to consider change in career. On the domestic frontier, avoid direct confrontation with your loved ones. Your dominating nature may cause trouble in family matters. Leos may enjoy short-term relationships during this year. However, prospects for marriages are also very high");
			break;
		case 6:
			txt.setText("Virgo Horoscope:\nVirgo Horoscope 2012 forecasts that you have to be tough and emotionally steady this year! The year ahead has both the bouquets and brickbats. 2012 spells out some critical situations that might lead to painful outcome. This could be in the work front or in your family. It will be more in the form of abrupt happenings and set of events.\n\nMay be a colleague would prove unworthy or a near one might fall ill. The respite here is doing what the situation best demands and let time pass! Expressing yourself is important to a dear friend or a senior family member.\n\nHowever, other facets like love, money and relationship remains at balance.");
			break;
		case 7:
			txt.setText("Libra Horoscope:\nLibrans will see their importance grow and their opinions valued. There could be hurdles in your way, but you’ll taste success by overcoming those. You will enjoy a positive stroke of luck from May to July, 2012. But, avoid speculations from August onwards. Take a decision only after assessing all the aspects carefully.\n\nYou may come across sea changes in your love life. You can get lucky to meet your dream partner. Finances will remain strong. Income will soar and there will also be gains from unknown sources");
			break;
		case 8:
			txt.setText("Scorpio Horoscope:\nYour positive streak of this year will continue in 2012. But you would need to be careful about making unnecessary expenses. Invest money only after considering all the possibilities. In family life, try to be more flexible and accommodative. A rigid outlook can spoil family harmony.\n\nThis year is going to be good for unmarried Scorpians. There are higher chances for them to get married. Career will continue to grow and there are also probabilities for promotions and increments. The first half of the year is going to be particularly good for Scorpions");
			break;
		case 9:
			txt.setText("Sagittarius Horoscope:\n2012 is going to bring in significant changes in the lives of Sagittarians. You will achieve great success in creative fields. Your professional life will show great dynamism and you will be able to attain new heights in your career. There could be some obstacles in your way during the first half of the year, but you’ll be able to overcome them with flying colors. Avoid unnecessary expenses.\n\nAt the end of the year, some issues may crop up in your relationship. So, you’d need to deal with things carefully.");
			break;
		case 10:
			txt.setText("Capricorn Horoscope:\nBoth 2012 and 2013 are going to the best time for you and the positive streak will continue for the coming 30 years. You will be at your creative best and see all your efforts come true. Your ideas will be rewarded and appreciated. You will find a new vigor which will help you excel in your life. Income will grow.\n\nYour friendship can turn into a love relation. Love may come to you as a surprise and from a person who you haven’t considered earlier.");
			break;
		case 11:
			txt.setText("Aquarius Horoscope:\nAfter stressful 2010 and 2011, 2012 is going to bring in good news for you. You can expect positive changes in your life but you would need to overcome the negative feelings to enjoy that. You can see a significant improvement in your status and social recognition in 2012.\n\nYour career will flourish but you may avoid sudden decisions about changing jobs. There will be many options but you would need to choose the best one carefully.");
			break;
		case 12:
			txt.setText("Piscean Horoscope:\nThe year may start slow for the Pisceans. You may face some challenges and hurdles in life this year. Tensions may rise in marital relationship. You may also see a fall in your public image. This will be the time to make your decisions carefully. You’d need to work hard to taste success.\n\nHowever, things will improve from May onwards. You may find new friends and also new relationships.");
			break;
		default:
			txt.setText("Sorry you dont have a future.");
			break;
		}
	}
}
