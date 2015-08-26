package com.ashish.javaapplication;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.xpath.domapi.XPathEvaluatorImpl;
import org.w3c.dom.Node;
import org.w3c.dom.xpath.XPathEvaluator;
import org.w3c.dom.xpath.XPathNSResolver;
import org.w3c.dom.xpath.XPathResult;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;


public class TestXpath {

	
	public static void main (String args[]) throws FileNotFoundException, SAXException, IOException, ParserConfigurationException {
		 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		 dbf.setNamespaceAware(true); 
		Document document =  dbf.newDocumentBuilder().parse(
	            new FileInputStream("/Users/ashishkum.ashok/Desktop/heimdall_Inout/filePackageMetadata/bv20130107123907.xml"));
		String xpath = "/FilePackage/insertPackage/comment";
		String rootNode = document.getDocumentElement().getNodeName();
		Node node = null;
		XPathEvaluator evaluator = new XPathEvaluatorImpl(document);
		XPathNSResolver nsresolver = evaluator.createNSResolver(document);
		XPathResult xpresult = (XPathResult)evaluator.evaluate(xpath,  document, nsresolver, XPathResult.UNORDERED_NODE_ITERATOR_TYPE, null);
		node = xpresult.iterateNext();
		System.out.println(node);
	}
}
