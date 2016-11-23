

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class SetPrintStream {
	  public static void main(String[] args) throws FileNotFoundException{
	           System.out.println("Print on console");

	           // Store console print stream.
	           PrintStream ps_console = System.out;

	           File file = new File("file.txt");
	           FileOutputStream fos = new FileOutputStream(file);

	           // Create new print stream for file.
	           PrintStream ps = new PrintStream(fos);

	           // Set file print stream.
	           System.setOut(ps);
	           System.out.println("Print in the file !!");

	           // Set console print stream.
	           System.setOut(ps_console);
	           System.out.println("Console again !!");
	 }
	}
