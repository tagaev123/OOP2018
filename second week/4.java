
import java.util.Scanner;
import java.lang.String;

          
public class Main {
    static String zhai(int n){
		String output = "0";
		output += Integer.toString(n);
		return output;
	}
     public static class Time{
     	int hour, minute, second;
     	public Time(int hour, int minute, int second){
     		this.hour = hour;
     		this.minute = minute;
     		this.second = second;
     	}
         String toUniversal(){
              String hourstr, minutestr, secondstr;
              hourstr = (hour >= 0 && hour <= 9) ? zhai(hour) : Integer.toString(hour);
              minutestr = (minute >= 0 && minute <= 9) ? zhai(minute) : Integer.toString(minute);
              secondstr = (second >= 0 && second <= 9) ? zhai(second) : Integer.toString(second);
              return (hourstr+":"+minutestr+":"+secondstr);
        }
        String toStandard(){
        	String end = (hour >= 12 && hour < 24) ? "PM" : "AM";
              String hourstr, minutestr, secondstr;
              
              hourstr = (hour % 12>= 0 && hour % 12 <= 9) ? zhai(hour % 12) : Integer.toString(hour  % 12);
              minutestr = (minute >= 0 && minute <= 9) ? zhai(minute) : Integer.toString(minute);
              secondstr = (second >= 0 && second <= 9) ? zhai(second) : Integer.toString(second);
              return (hourstr+":"+minutestr+":"+secondstr + " " + end);
        }
        public void add(Time t){
        	this.hour += t.hour;
        	this.minute += t.minute;
        	this.second += t.second;
        	if(this.second >= 60)
        		this.minute += 1;
        	if(this.minute >= 60)
        		this.hour += 1;
        	if(this.hour >= 24)
        		this.hour += 1;
        	this.second = this.second % 60;
        	this.minute = this.minute % 60;
        	this.hour = this.hour % 24;
        }
     }
     public static void main(String[] args) {
     	
              Time time = new Time(5,6,7);
              Time time2 = new Time(20, 40, 59);
              System.out.println(time.toUniversal());
             System.out.println(time2.toStandard());
              time.add(time2);
              System.out.println(time.toUniversal());
              System.out.println(time.toStandard());
         }
    }

 
       

