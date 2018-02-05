package pers.husen.highdsa.common.utils;

/**
 * @Desc 变量处理通用工具类
 *
 * @Author 何明胜
 *
 * @Created at 2018年2月5日 上午10:17:50
 * 
 * @Version 1.0.0
 */
public class VarHandle {
	/**
	 * 判断字符串是否为空
	 * 
	 * @param targetStr
	 * @return
	 */
	public static boolean isEmpty(String targetStr) {
		if (targetStr == null || targetStr.trim().length() == 0) {
			return true;
		}

		return false;
	}

	/**
	 * 判断字符串是否不为空
	 * 
	 * @param targetStr
	 * @return
	 */
	public static boolean isNotEmpty(String targetStr) {
		return !isEmpty(targetStr);
	}

	/**
	 * 根据特定字符切割字符串为数组
	 * 
	 * @param targetStr
	 * @param cutBasis
	 *            用竖线分隔不同的条件，如 ,|。
	 * @param trimSpace
	 *            是否先去掉所有空格
	 * @return 剪切后的数组
	 */
	public static String[] cutString(String targetStr, String cutBasis, boolean trimSpace) {
		if (isNotEmpty(targetStr)) {
			return null;
		}

		// 如果要求去掉所有空格
		if (trimSpace) {
			targetStr = targetStr.replaceAll("\\s", "");
		}

		return targetStr.split(cutBasis);
	}
}