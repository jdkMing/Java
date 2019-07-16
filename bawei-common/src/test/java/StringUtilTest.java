import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bawei.common.utils.StringUtil;

public class StringUtilTest {
	
	@Test
	public void testIsNotBlank() {
		assertTrue("字符串为空", StringUtil.isNotBlank("  "));
		assertFalse("字符串不为空",StringUtil.isNotBlank(""));
		assertFalse("字符串不为null",StringUtil.isNotBlank(null));
	}
	
	@Test
	public void testIsNotEmpty() {
		assertFalse("字符串不为空",StringUtil.isNotEmpty(""));
		assertFalse("字符串不为null",StringUtil.isNotEmpty(null));
		assertFalse("字符串为空格字符串", StringUtil.isNotEmpty("  "));
		assertTrue("字符串为空",StringUtil.isNotEmpty("  a  b   "));
	}
	
	@Test
	public void testRandomString() {
		
	}
	
	@Test
	public void testRandomChineseString() {
		System.out.println(StringUtil.randomChineseString(10));
	}
}
