package com.mycompany.webapp.dao;

import org.springframework.stereotype.Repository;

import lombok.extern.log4j.Log4j2;

@Repository("ch13Dao1")
@Log4j2
public class Ch13Dao1CreateByAnno {
	public Ch13Dao1CreateByAnno() {
		log.info("Ch13Dao1CreateByAnno 생성자 실행");
	}
}