package com.shijie99.TestJava.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GzipUtil {
	private static final Logger logger = LoggerFactory.getLogger(GzipUtil.class);
	/**
	 * 将字符串压缩后Base64
	 * 
	 * @param primStr
	 *            待加压加密函数
	 * @return
	 */
	public static String gzipString(String primStr) {
		if (primStr == null || primStr.length() == 0) {
			return primStr;
		}
		ByteArrayOutputStream out = null;
		GZIPOutputStream gout = null;
		try {
			out = new ByteArrayOutputStream();
			gout = new GZIPOutputStream(out);
			gout.write(primStr.getBytes("UTF-8"));
			gout.flush();
		} catch (IOException e) {
			logger.error("对字符串进行加压加密操作失败：", e);
			return null;
		} finally {
			if (gout != null) {
				try {
					gout.close();
				} catch (IOException e) {
					logger.error("对字符串进行加压加密操作，关闭gzip操作流失败：", e);
				}
			}
		}
//		return Base64.getEncoder().encodeToString(out.toByteArray());
		return new String(Base64.encodeBase64(out.toByteArray()));
	}

	/**
	 * 将压缩并Base64后的字符串进行解密解压
	 * 
	 * @param compressedStr
	 *            待解密解压字符串
	 * @return
	 */
	public static final String ungzipString(String compressedStr) {
		if (compressedStr == null) {
			return null;
		}
		ByteArrayOutputStream out = null;
		ByteArrayInputStream in = null;
		GZIPInputStream gin = null;
		String decompressed = null;
		try {
//			byte[] compressed = Base64.getDecoder().decode(compressedStr);
			byte[] compressed = Base64.decodeBase64(compressedStr);
			out = new ByteArrayOutputStream();
			in = new ByteArrayInputStream(compressed);
			gin = new GZIPInputStream(in);
			byte[] buffer = new byte[1024];
			int offset = -1;
			while ((offset = gin.read(buffer)) != -1) {
				out.write(buffer, 0, offset);
			}
			decompressed = out.toString("UTF-8");
		} catch (IOException e) {
			logger.error("对字符串进行解密解压操作失败：", e);
			decompressed = null;
		} finally {
			if (gin != null) {
				try {
					gin.close();
				} catch (IOException e) {
					logger.error("对字符串进行解密解压操作，关闭压缩流失败：", e);
				}
			}
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					logger.error("对字符串进行解密解压操作，关闭输入流失败：", e);
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					logger.error("对字符串进行解密解压操作，关闭输出流失败：", e);
				}
			}
		}
		return decompressed;
	}

	public static void main(String[] args) {
//		for(int i = 100000; i < 100099; i++) {
//			String encode = gzipString(String.valueOf(i));
//			System.out.println(ungzipString(encode) + "==>" + encode);
//		}
		
		String a = "H4sIAAAAAAAAAL2Sb0/CQAzGv8ql79kfTNAQNjKZAXQKYUv07bHVccl2N3s3Bt/eiyBoiPGVvv21T9un7Wi8qyu2RdJCyQB8x4NxOEpUtySR4wrfWtSG2RyphzstAtgY0wxdt+s6p7tyFJVu3/N89+UxSfMN1rwnpDZc5ggnVfG7Cs495/JVJUKbkH1DLCPRZPsGA1g8A4ux4WQmwuwDuL1PgUVEYosHMHuYAlt0EimASQQsRW6mxAurtdJFa9aqlUVGfItVzI3Ffc8f9Lybnj8ANpcXYWBLUkWbm8MAUZJYwrVGWSI9tbUt8AXcVaIUa1F9zBLFmS2pZ1xnfGcXDOzTVarIBOCB+7PTVfbfTk/h6z/37F5c/IyOjxe+AxCjUBSfAgAA";
		String encode = ungzipString(a);
		System.out.println(encode);
	}
}
