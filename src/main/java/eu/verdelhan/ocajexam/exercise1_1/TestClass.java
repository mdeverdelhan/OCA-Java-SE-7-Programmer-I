package eu.verdelhan.ocajexam.exercise1_1;

//import java.io.*;
//import java.text.*;
//import java.util.*;
//import java.util.logging.*;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestClass {

	public static void main(String[] args) throws IOException {

		/* Ensure directory has been created */
		new File("logs").mkdir();

		/* Get the date to be used in the filename */
		DateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
		Date now = new Date();
		String date = df.format(now);

		/* Set up the filename in the logs directory */
		String logFileName = "logs\\testlog-" + date + ".txt";

		/* Set up logger */
		FileHandler myFileHandler = new FileHandler(logFileName);
		myFileHandler.setFormatter(new SimpleFormatter());
		Logger ocajLogger = Logger.getLogger("OCAJ Logger");
		ocajLogger.setLevel(Level.ALL);
		ocajLogger.addHandler(myFileHandler);

		/* Log Message */
		ocajLogger.info("\nThis is a logged information message.");

		/* Close the file */
		myFileHandler.close();
	}
}