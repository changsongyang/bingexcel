package com.bing.excel.reader;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.xml.sax.SAXException;

public interface SaxHandler {
	/**
	 * 处理所用数据对象
	 */
	void process() throws IOException, OpenXML4JException , SAXException;
	/**
	 * 读取指定的数据
	 * @param index sheetDate对应下标 0 start
	 */
	void process(int index)throws IOException, OpenXML4JException , SAXException;
	void process(String indexName)throws IOException, OpenXML4JException , SAXException;
}
