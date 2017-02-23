package com.chinamobile.excel;

import java.io.File;

import org.junit.Test;

import com.bing.excel.reader.ExcelReadListener;
import com.bing.excel.reader.ExcelReaderFactory;
import com.bing.excel.reader.ReadHandler;
import com.bing.excel.vo.ListRow;

/**
 * @author shizhongtao
 *
 * date 2016-3-23
 * Description:  
 */
public class SaxReaderTest1 {
	//如果以上都不能满足你的需求 你也可以自己去处理数据。
	@Test
	public void testme() throws Exception{
		//InputStream stream = Salary.class.getResourceAsStream("/salary6.xls");
		//File f = new File("E:/aoptest/gzb.xls");
		//File f = new File("E:/aoptest/bc.xlsx");
		File f = new File("E:/aoptest/b.xlsx");
		//
		System.out.println(System.currentTimeMillis());
		ReadHandler saxHandler = ExcelReaderFactory.create(f, new ExcelReadListener() {
			
			@Override
			public void startSheet(int sheetIndex, String name) {
				// TODO Auto-generated method stub
				System.out.println(System.currentTimeMillis());
			}
			
			@Override
			public void optRow(int curRow, ListRow rowList) {
				//输出读取的数据列表。这里数据全部是string类型
				System.out.println(rowList);
			}
			
			@Override
			public void endWorkBook() {
				// TODO Auto-generated method stub
				System.out.println(System.currentTimeMillis());
			}
			
			@Override
			public void endSheet(int sheetIndex, String name) {
				// TODO Auto-generated method stub
				
			}
		}, true);
		saxHandler.readSheets();
		System.out.println(System.currentTimeMillis());
	}
}
