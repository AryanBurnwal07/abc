import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q2 {

	public static void main(String[] args) throws ParseException {
		
		String date = "09/02/2021";
		Date d = new SimpleDateFormat("dd/mm/yy").parse(date);
		System.out.println(date +" : "+ d);
	}

}
