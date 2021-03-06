/*
 * class for setting time 
 */
public class node36 {
	
	private int hour;
	private int minute;
	private int second;
	
	//process to set time
	public void setTime(int h, int m, int s) {
		hour = ((h>=0 && h<24) ? h : 0);
		minute = ((m>=0 && m<60) ? m : m%60);
		second = ((s>=0 && s<60) ? s : s%60	);
	}
	
	//print  military time  in String format
	public String toMilitarytime() {
		return String.format("%02d:%02d:%02d",hour,minute, second);
	}
	//print in regular time in String format
	public String toRegulartime() {
		return String.format("%d:%02d:%02d %s",((hour==0||hour==12)? 12 : hour%12),((minute==60) ? 0 : minute%60),((second==60) ? 0 :second%60),(hour<12? "AM":"PM"));
	}
}
