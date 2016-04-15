package tests;

public class TimeDuration {
	private int time;
	public TimeDuration() {
		// TODO Auto-generated constructor stub
	}
	public TimeDuration(int time) {
		if(time < 0) {
			try {
				
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		}
		else {
			this.time = time;
		}
	}

	public String toString() {
		String timeStr = "";  
        int hour = 0;  
        int minute = 0;  
        int second = 0;  
        if (time == 0)  
            return "0s";  
        else {  
            minute = time / 60;  
            if (minute < 60) {  
                second = time % 60;  
                timeStr = Integer.toString(minute) + "m " + Integer.toString(second) + "s";  
            } else {  
                hour = minute / 60;  
                minute = minute % 60;  
                second = time - hour * 3600 - minute * 60;  
                timeStr = Integer.toString(hour) + "h " + Integer.toString(minute) + "m " + Integer.toString(second) + "s"; 
            }  
        }  
        return timeStr;  
	}
}
