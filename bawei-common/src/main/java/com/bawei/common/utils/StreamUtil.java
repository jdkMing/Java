package com.bawei.common.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author zhaoming.li
 *
 */
public class StreamUtil {
	private StreamUtil() {}
	
	public static void closeAll(Closeable...closeables ) {
		if (closeables.length == 0)
			return;
		int currentIndex = 0;
		try {
			for (Closeable target : closeables) {
				target.close();
				currentIndex++;
			}
		} catch (IOException e) {
			Closeable[] remain = new Closeable[closeables.length-currentIndex];
			System.arraycopy(closeables, currentIndex, remain, 0, closeables.length-currentIndex);
			closeAll(remain);
			e.printStackTrace();
		}
	}
	
	
	public static void copy(InputStream src, OutputStream out, boolean isCloseInputStream, boolean isCloseOutputStream)  throws IOException{
		
		if (src == null || out == null) {
			throw new IllegalArgumentException("输入流或流出流都不能为空");
		}
		
		BufferedInputStream bis = new BufferedInputStream(src);
		BufferedOutputStream bos = new BufferedOutputStream(out);
		int value = 0;
		while ((value = bis.read())>0) {
			out.write(value);
		}
		
		if (isCloseInputStream) {
			bis.close();
		}
		
		if (isCloseOutputStream) {
			bos.close();
		}
		
	}
	
	public static String readTextFile(InputStream src) throws IOException{
		if (src == null) {
			throw new IllegalArgumentException("输入流不能为空");
		}
		
		String result = "";
		
		// 对内存中字节数组的封装
		OutputStream out = new ByteArrayOutputStream();
		
		copy(src, out, false, false);
		
		result = new String(((ByteArrayOutputStream)out).toByteArray());
		
		return result;
	}
	
	public static String readTextFile(File txtFile) throws FileNotFoundException, IOException{
		if (txtFile == null) {
			throw new IllegalArgumentException("文件对象不能为空");
		}
		
		String result = "";
		
		result = readTextFile(new FileInputStream(txtFile));
		
		return result;
	}
	
	public static String readStringFromSystemIn(String message){
		if (!StringUtil.isNotEmpty(message)) {
			throw new IllegalArgumentException("消息内容不能为空");
		}
		
		String input = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(message);
		
		input = scanner.nextLine();
		
		return input;
	}
	
	public static int readIntFromSystemIn(String message){
		if (!StringUtil.isNotEmpty(message)) {
			throw new IllegalArgumentException("消息内容不能为空");
		}
		
		int input = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			try {
				System.out.print(message);
				input = scanner.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("输入的不是整数，请继续输入！");
				continue;
			}
		}
		
		return input;
	}



}
