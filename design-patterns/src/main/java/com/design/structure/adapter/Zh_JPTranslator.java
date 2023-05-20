package com.design.structure.adapter;

/**
 * @Title: Zh_JPTranslator
 * @Description: 翻译功能的具体实现
 * @Author: yj
 * @Date: 2023/5/20 09:09
 * @Version: 1.0
 */
public class Zh_JPTranslator implements Translator{

	@Override
	public void translate(String content) {
		if ("你好".equals(content)) {
			System.out.println("空尼叽哇~");
		}else if ("我回来了".equals(content)){
			System.out.println("他大姨妈");
		}else {
			System.out.println("***");
		}
	}
}