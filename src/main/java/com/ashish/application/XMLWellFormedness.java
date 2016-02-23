package com.ashish.application;
/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import java.io.ByteArrayOutputStream;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import de.schlichtherle.io.FileInputStream;
*/

public class XMLWellFormedness {

	public static void main (String args[]) {
	 /*   String UTF8_BOM = "\uFEFF";
	    System.out.println(UTF8_BOM);
		File xmlFile = new File("/Users/ashishkum.ashok/Desktop/heimdall_Inout/bell_sftp_original/2YDT.xml");
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		SAXParser saxParser = null;
		
		try {
			saxParser = saxParserFactory.newSAXParser();
		} catch (ParserConfigurationException e1) {
			e1.printStackTrace();
		} catch (SAXException e1) {
			e1.printStackTrace();
		}
		boolean firstLine = true;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		OutputStream outputStream = new ByteArrayOutputStream();
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(xmlFile),"UTF-8"));
			writer = new BufferedWriter(new OutputStreamWriter(outputStream));
			System.out.println(reader.readLine());
			for (String s = ""; (s = reader.readLine()) != null;) {
                if (firstLine) {
                    s = removeUTF8BOM(s);
                    firstLine = false;
                }
                writer.write(s + System.getProperty("line.separator"));
                writer.flush();
            }

            writer.close();
            reader.close();
            
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InputSource is = new InputSource(reader);
		is.setEncoding("UTF-8");
		try {
			saxParser.parse(is, new DefaultHandler());
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}
	
	private static String removeUTF8BOM(String s) {
        if (s.startsWith("\uFEFF")) {
            s = s.substring(1);
        }
        return s;
    }
}
