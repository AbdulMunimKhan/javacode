import java.util.Calendar;
class W_calender{
	public static void main(String args[]){
		Calendar cal = Calendar.getInstance();
		System.out.print("Created at : " + cal.get(Calendar.DATE) + " / " + cal.get(Calendar.MONTH) + 
		" / " + cal.get(Calendar.YEAR));
	}
}