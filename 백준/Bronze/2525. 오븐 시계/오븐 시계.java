import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String []str=br.readLine().split(" ");
		

		int h =Integer.parseInt(str[0]);
		int m =Integer.parseInt(str[1]);
		int c = Integer.parseInt(br.readLine());
		
		int min = 60*h+m;
		min += c;
		
		int hour=(min/60)%24;
		int minute=min%60;
		
		System.out.println(hour+" "+minute);

	
		}
	}


