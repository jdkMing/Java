package com.huangchenming_common.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.huangchenming_common.utils.AssertUtil;

public class TestMain {

//测试AssertUtil.isTrue()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void isTrueTest1() {
		try {
			AssertUtil.isTrue(false, "断言必须为真");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//测试AssertUtil.isTrue()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void isTrueTest2() {
		try {
			AssertUtil.isTrue(true, "断言必须为真");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	测试AssertUtil.isFalse()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void isFalseTest1() {
		try {
			AssertUtil.isFalse(true, "断言必须为假");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	测试AssertUtil.isFalse()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void isFalseTest2() {
		try {
			AssertUtil.isFalse(false, "断言必须为假");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	测试AssertUtil.()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void notNullTest1() {
		String str =  new String("auidg");
		try {
			AssertUtil.notNull(str, "断言对象不为空");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	测试AssertUtil.()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void notNullTest2() {
		String str =null;
		try {
			AssertUtil.notNull(str, "断言对象不为空");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	测试AssertUtil.isNull()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void isNullTest1() {
		String str =null;
		try {
			AssertUtil.isNull(str, "断言对象必须空");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	测试AssertUtil.isNull()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void isNullTest2() {
		String str = new String("auidg");
		try {
			AssertUtil.isNull(str, "断言对象必须空");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	用List对象测试AssertUtil.notEmpty()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void notEmptyTest1() {
		List<String> list = new ArrayList<String>();
		list.add("haha");
		try {
			AssertUtil.notEmpty(list, "集合不为空，对象不能空，以及必须包含1个元素");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	用List对象测试AssertUtil.notEmpty()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void notEmptyTest2() {
		List<String> list = new ArrayList<String>();
		try {
			AssertUtil.notEmpty(list, "集合不为空，对象不能空，以及必须包含1个元素");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	用Map对象测试AssertUtil.notEmpty()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void notEmptyTest3() {
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("1", "151");
		try {
			AssertUtil.notEmpty(map, "Map对象不能空，以及必须包含1个元素");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	用Map对象测试AssertUtil.notEmpty()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void notEmptyTest4() {
		Map<String,Object> map = new HashMap<String, Object>();
		try {
			AssertUtil.notEmpty(map, "Map对象不能空，以及必须包含1个元素");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	用String对象测试AssertUtil.hasText()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void hasText1() {
		String str = "sadss  dsdf";
		try {
			AssertUtil.hasText(str, "断言字符串必须有值，去掉空格，字符串长度大于0");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	用String对象测试AssertUtil.hasText()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void hasText2() {
		String str = "  ";
		try {
			AssertUtil.hasText(str, "断言字符串必须有值，去掉空格，字符串长度大于0");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	测试AssertUtil. greaterThanZero()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void greaterThanZero() {
		BigDecimal bi = new BigDecimal(66.999);
		try {
			AssertUtil.greaterThanZero(bi, "断言值必须大于0");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	测试AssertUtil. greaterThanZero()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void greaterThanZero2() {
		BigDecimal bi = new BigDecimal(0);
		try {
			AssertUtil.greaterThanZero(bi, "断言值必须大于0");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
