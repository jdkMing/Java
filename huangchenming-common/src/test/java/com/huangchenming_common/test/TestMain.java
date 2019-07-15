package com.huangchenming_common.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.huangchenming_common.utils.AssertUtil;

public class TestMain {

//����AssertUtil.isTrue()������ͨ�����Բ�һ�Σ�2�֣�������ͨ�����Բ�һ�Σ�2�֣���
	@Test
	public void isTrueTest1() {
		try {
			AssertUtil.isTrue(false, "���Ա���Ϊ��");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//����AssertUtil.isTrue()������ͨ�����Բ�һ�Σ�2�֣�������ͨ�����Բ�һ�Σ�2�֣���
	@Test
	public void isTrueTest2() {
		try {
			AssertUtil.isTrue(true, "���Ա���Ϊ��");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	����AssertUtil.isFalse()������ͨ�����Բ�һ�Σ�2�֣�������ͨ�����Բ�һ�Σ�2�֣���
	@Test
	public void isFalseTest1() {
		try {
			AssertUtil.isFalse(true, "���Ա���Ϊ��");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	����AssertUtil.isFalse()������ͨ�����Բ�һ�Σ�2�֣�������ͨ�����Բ�һ�Σ�2�֣���
	@Test
	public void isFalseTest2() {
		try {
			AssertUtil.isFalse(false, "���Ա���Ϊ��");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	����AssertUtil.()������ͨ�����Բ�һ�Σ�2�֣�������ͨ�����Բ�һ�Σ�2�֣���
	@Test
	public void notNullTest1() {
		String str =  new String("auidg");
		try {
			AssertUtil.notNull(str, "���Զ���Ϊ��");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	����AssertUtil.()������ͨ�����Բ�һ�Σ�2�֣�������ͨ�����Բ�һ�Σ�2�֣���
	@Test
	public void notNullTest2() {
		String str =null;
		try {
			AssertUtil.notNull(str, "���Զ���Ϊ��");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	����AssertUtil.isNull()������ͨ�����Բ�һ�Σ�2�֣�������ͨ�����Բ�һ�Σ�2�֣���
	@Test
	public void isNullTest1() {
		String str =null;
		try {
			AssertUtil.isNull(str, "���Զ�������");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	����AssertUtil.isNull()������ͨ�����Բ�һ�Σ�2�֣�������ͨ�����Բ�һ�Σ�2�֣���
	@Test
	public void isNullTest2() {
		String str = new String("auidg");
		try {
			AssertUtil.isNull(str, "���Զ�������");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	��List�������AssertUtil.notEmpty()������ͨ�����Բ�һ�Σ�2�֣�������ͨ�����Բ�һ�Σ�2�֣���
	@Test
	public void notEmptyTest1() {
		List<String> list = new ArrayList<String>();
		list.add("haha");
		try {
			AssertUtil.notEmpty(list, "���ϲ�Ϊ�գ������ܿգ��Լ��������1��Ԫ��");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	��List�������AssertUtil.notEmpty()������ͨ�����Բ�һ�Σ�2�֣�������ͨ�����Բ�һ�Σ�2�֣���
	@Test
	public void notEmptyTest2() {
		List<String> list = new ArrayList<String>();
		try {
			AssertUtil.notEmpty(list, "���ϲ�Ϊ�գ������ܿգ��Լ��������1��Ԫ��");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	��Map�������AssertUtil.notEmpty()������ͨ�����Բ�һ�Σ�2�֣�������ͨ�����Բ�һ�Σ�2�֣���
	@Test
	public void notEmptyTest3() {
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("1", "151");
		try {
			AssertUtil.notEmpty(map, "Map�����ܿգ��Լ��������1��Ԫ��");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	��Map�������AssertUtil.notEmpty()������ͨ�����Բ�һ�Σ�2�֣�������ͨ�����Բ�һ�Σ�2�֣���
	@Test
	public void notEmptyTest4() {
		Map<String,Object> map = new HashMap<String, Object>();
		try {
			AssertUtil.notEmpty(map, "Map�����ܿգ��Լ��������1��Ԫ��");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	��String�������AssertUtil.hasText()������ͨ�����Բ�һ�Σ�2�֣�������ͨ�����Բ�һ�Σ�2�֣���
	@Test
	public void hasText1() {
		String str = "sadss  dsdf";
		try {
			AssertUtil.hasText(str, "�����ַ���������ֵ��ȥ���ո��ַ������ȴ���0");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	��String�������AssertUtil.hasText()������ͨ�����Բ�һ�Σ�2�֣�������ͨ�����Բ�һ�Σ�2�֣���
	@Test
	public void hasText2() {
		String str = "  ";
		try {
			AssertUtil.hasText(str, "�����ַ���������ֵ��ȥ���ո��ַ������ȴ���0");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	����AssertUtil. greaterThanZero()������ͨ�����Բ�һ�Σ�2�֣�������ͨ�����Բ�һ�Σ�2�֣���
	@Test
	public void greaterThanZero() {
		BigDecimal bi = new BigDecimal(66.999);
		try {
			AssertUtil.greaterThanZero(bi, "����ֵ�������0");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	����AssertUtil. greaterThanZero()������ͨ�����Բ�һ�Σ�2�֣�������ͨ�����Բ�һ�Σ�2�֣���
	@Test
	public void greaterThanZero2() {
		BigDecimal bi = new BigDecimal(0);
		try {
			AssertUtil.greaterThanZero(bi, "����ֵ�������0");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
