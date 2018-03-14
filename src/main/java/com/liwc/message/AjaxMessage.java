package com.liwc.message;

import java.io.Serializable;

import com.liwc.constant.MyConstant;

public class AjaxMessage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 返回消息码
	 */
	private Integer msgCode = MyConstant.MESSAGE_CODE_OK;
	
	/**
	 * 消息说明
	 */
	private String msg;
	
	
	/**
	 * 消息体
	 */
	private Object content;


	public Integer getMsgCode() {
		return msgCode;
	}


	public void setMsgCode(Integer msgCode) {
		this.msgCode = msgCode;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	public Object getContent() {
		return content;
	}


	public void setContent(Object content) {
		this.content = content;
	}
	
	
	
}
