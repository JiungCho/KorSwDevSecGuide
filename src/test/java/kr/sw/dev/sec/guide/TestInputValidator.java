/**
 * 
 */
package kr.sw.dev.sec.guide;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 *
 * @author Jiung Cho
 * @version 1.0
 */
public class TestInputValidator {

	@Test
	public void testFileName() {
		String fileName = "../../../../\"..\\\\<example.xls>?:*\r\n";
		
		fileName = InputValidator.fileName(fileName);
		System.out.println(fileName);
		
		assertEquals("example.xls", fileName);
	}
}
