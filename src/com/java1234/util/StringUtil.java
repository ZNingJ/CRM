package com.java1234.util;

/**
 * 字符串工具类
 */
public class StringUtil {

	/**
	 * 判断是否是空
	 */
	public static boolean isEmpty(String str){
		return str==null||"".equals(str.trim());
	}
	
	/**
	 * 判断是否不是空
	 */
	public static boolean isNotEmpty(String str){
		return (str!=null)&&!"".equals(str.trim());
	}
	
	/**
	 * 格式化模糊查询
	 */
	public static String formatLike(String str){
		if(isNotEmpty(str)){
			return "%"+str+"%";
		}else{
			return null;
		}
	}
}
