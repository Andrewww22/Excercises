package SeparateCountyValueFromHTML;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Homework :
RO:
Sa faci o metoda care sa obtina perechea numar si judet dint-o linie :
<option value="102641">Dragoesti</option>
O alta metoda care citeste fisierul si creaza un hasmap cu numar si judet.
EN:
Make a method to get the number and county pair in one line:
<option value = "102641"> Dragoesti </ option>
Another method that reads the file and creates a hasmap with number and county.
 *
 */

public class CountyAndValue {
	public static void readFile()
	{

			String fileName = "fisier.txt";

			try {
				BufferedReader br = new BufferedReader(new FileReader(fileName));//Decorator
			    String line = br.readLine();

			    while (line != null)
			    {
			    	line = br.readLine();
			    	System.out.println(line);

			    }

				} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
		}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		readFile();

	}

}
