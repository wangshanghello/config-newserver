package com.itmayiedu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 *  @author wangshang
 * 	@date 2018年7月3日/上午8:38:25  
 * 	@类作用: 读取git上的配置文件的值
 */
@RestController
public class TestController {

	@Value("${name}")
	private String name;

	@RequestMapping("/getUserName")
	public String getUserName() {
		return name;
	}
}
