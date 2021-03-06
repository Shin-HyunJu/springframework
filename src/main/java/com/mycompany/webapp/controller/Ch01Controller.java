package com.mycompany.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //자동 객체 생성, 클라이언트 요청 처리
@RequestMapping("/ch01")
//@Log4j2
public class Ch01Controller {
	private static final Logger logger = LoggerFactory.getLogger(Ch01Controller.class);
	
	@RequestMapping("/content") //메소드 이름과 mapping()안에 들어가는 이름이 꼭 같을 필요는 없다.
	public String content(){ //뷰 이름이 string 타입이기 때문에 리턴타입 string으로 지정
		logger.info("실행");
		//log.info("실행");
		return "ch01/content";
	}

}
