package SeleniumActivities;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class Activity13 {

	public static void main(String[] args) throws IOException, CsvException {
		// TODO Auto-generated method stub
		//CSVReader reader = new CSVReader(new FileReader("src/test.csv"));
		//Load CSV file
        CSVReader reader = new CSVReader(new FileReader("src/test.csv"));
		
		List<String[]> rows = reader.readAll();
		
		System.out.println("The number of rows in a csv file is "+rows.size());
		
		Iterator<String[]> itr = rows.iterator();
		
		while(itr.hasNext()) {
			String[] str= itr.next();
			
			System.out.print("the values are: ");
			for(int i=0;i<str.length;i++) {
				System.out.print(""+str[i]);
			}
			System.out.println(" ");
		}
		
		reader.close();

	}

}
