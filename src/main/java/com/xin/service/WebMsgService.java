package com.xin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xin.dao.WebmsgMapper;
import com.xin.pojo.Webmsg;
import com.xin.pojo.WebmsgExample;

@Service
public class WebMsgService {

	@Autowired
	private WebmsgMapper mapper;
	public Webmsg getMsg() {
		WebmsgExample example = new WebmsgExample();
		List<Webmsg> selectByExample = mapper.selectByExample(example);
		return selectByExample.get(0);
	}
	public int saveMsg(Webmsg webmsg) {
		int i = mapper.updateByPrimaryKeySelective(webmsg);
		return i;
	}
}
