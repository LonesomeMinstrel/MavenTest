package com.luk.test01.test01_xmlDemo;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class MainTest {
	public static void main(String[] args) {
		try {
			SAXReader reader = new SAXReader();
			Document document = reader.read(new File("src/main/java/xml/stus.xml"));
			//得到元素
			Element rootElement = document.getRootElement();
			Node singleNode = rootElement.selectSingleNode("/stus/stu[2]/age");
			System.out.println(singleNode.getText());
//			Element element = rootElement.element("stu");
//			List<Element> elements = rootElement.elements();
//			for(Element i :elements) {
//				System.out.println(i.element("name").getText());
//				System.out.println(i.element("age").getText());
//				System.out.println(i.element("address").getText());
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
