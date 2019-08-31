package com.jc.ws.first;

import javax.jws.WebService;

@WebService(targetNamespace="ws.jc.com.first", name="firstInfo" )
public class FirstInfoProcessImpl implements FirstInfoProcess {
	@Override
	public FirstVo processFirst() {
		FirstVo vo = new FirstVo();
		vo.setUser("jckim");
		return vo;
	}
}
