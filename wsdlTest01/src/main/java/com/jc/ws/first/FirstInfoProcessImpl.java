package com.jc.ws.first;

import javax.jws.WebService;

@WebService(targetNamespace="ws.jc.com.first", name="firstInfo" )
public class FirstInfoProcessImpl implements FirstInfoProcess {
	@Override
	public FirstVo processFirst() {
		FirstVo vo = new FirstVo();
		System.out.println("웹서비스 호출");
		vo.setUser("jckim");
		return vo;
	}
}
