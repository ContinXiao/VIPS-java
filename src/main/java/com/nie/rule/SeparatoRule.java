package com.nie.rule;

import org.fit.cssbox.layout.Box;

import com.nie.vo.SeparatorVo;

public class SeparatoRule {

	/**
	 * �Ӿ�����ȫ�ڷָ����ڵ�
	 * @param box
	 * @param sep
	 * @return
	 */
	public static boolean horizontalRule1(Box box, SeparatorVo sep) {
		int y = box.getAbsoluteContentY();
		if (y > sep.getY() && (box.getHeight() + y) < (sep.getHeight() + sep.getY())) {
			System.out.println("111111111111111111111111111111111111111");
			return true;
		}
		return false;
	}
	
	/**
	 * �Ӿ������򴩹��ָ���
	 * @param box
	 * @param sep
	 * @return
	 */
	public static boolean horizontalRule2(Box box, SeparatorVo sep) {
		int y = box.getAbsoluteContentY();
		if (y < sep.getY() && (box.getHeight() + y) > (sep.getHeight() + sep.getY())) {
			System.out.println("222222222222222222222222222222222222222");
			return true;
		}
		return false;
	}
	
	/**
	 * �Ӿ����²��ͷָ����غ�
	 * @param box
	 * @param sep
	 * @return
	 */
	public static boolean horizontalRule3(Box box, SeparatorVo sep) {
		int y = box.getAbsoluteContentY();
		int LBY=y + box.getHeight();
		int sepRLY=sep.getY() + sep.getHeight();
		if (y < sep.getY() && LBY > sep.getY() && LBY < sepRLY) {
			System.out.println("333333333333333333333333333333333333333");
			return true;
		}
		return false;
	}
	
	/**
	 * �Ӿ����ϲ��ͷָ����غ�
	 * @param box
	 * @param sep
	 * @return
	 */
	public static boolean horizontalRule4(Box box, SeparatorVo sep) {
		int y = box.getAbsoluteContentY();
		int LBY=y + box.getHeight();
		int sepLBY=sep.getY() + sep.getHeight();
		if (y > sep.getY() && y < sepLBY && LBY > sepLBY) {
			System.out.println("44444444444444444444444444444444444444");
			return true;
		}
		return false;
	}
}
