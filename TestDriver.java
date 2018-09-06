
class Time {
	int hours;
	int minutes;
	int seconds;
	Time(int h, int m, int s ) {
		this.hours = h;
		this.minutes = m;
		this.seconds = s;
	}


	//Method to find absolute difference between two given times in the format HH:MM:SS
	public void absDifference (Time t1, Time t2) {

		//Takes input for hours if greater than 0 and less than 12
		//Takes input for minutes if greater than 0 and less than 60
		//Takes input for minutes if greater than 0 and less than 60
		if(t1.hours <= 12 && t1.hours > 0 && t2.hours <= 12 && t2.hours > 0 && t1.minutes <= 60 && t1.minutes > 0 && t2.minutes <= 60 && t2.minutes > 0 && t1.seconds <= 60 && t1.seconds > 0 && t2.seconds <= 60 && t2.seconds > 0) {
			int t1res = t1.hours * 3600 + t1.minutes * 60 + t1.seconds;
			int t2res = t2.hours * 3600 + t2.minutes * 60 + t2.seconds;
			int tres;
			if (t1res > t2res) {
				tres = t1res - t2res;
			} else {
				tres = t2res - t1res;
			}

			int hours = tres / 3600;

			int minutes = (tres - hours * 3600) / 60;

			int seconds = (tres - hours * 3600) - minutes * 60;

			System.out.println(hours + ":" + minutes + ":" + seconds);


		}
	}

}

public class TestDriver {
	public static void main(String[] args) {
		Time t1 = new Time(4,15,10);
		Time t2 = new Time(5,4,20);
		t1.absDifference(t1,t2);
	}
}
