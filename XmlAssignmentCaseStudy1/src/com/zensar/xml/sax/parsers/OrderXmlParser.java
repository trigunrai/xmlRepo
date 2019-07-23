package com.zensar.xml.sax.parsers;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class OrderXmlParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SAXParserFactory factory=SAXParserFactory.newInstance();
			SAXParser parser=factory.newSAXParser();
			parser.parse(new File("./src/CaseStudy1.xml"), new OrderXmlHandler());
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
