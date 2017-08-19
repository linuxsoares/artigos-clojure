import java.util.Date;
import java.text.SimpleDateFormat;

public class Example{
	public static void main(String args[]){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
		String date = sdf.format(new Date());
		System.out.println(date);

		String s = "clojure with java";
		System.out.println(s.toUpperCase());

		System.out.println("JVM VERSION: " + System.getProperty("java.vm.version"));
	}
}