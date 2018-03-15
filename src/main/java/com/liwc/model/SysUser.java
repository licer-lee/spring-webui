package com.liwc.model;

public class SysUser extends BaseModel{
	private Integer id;

	private String uLoginId;

	private String uPasswd;

	private String uName;

	private Integer uRole;

	private Integer uOrder;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getuLoginId() {
		return uLoginId;
	}

	public void setuLoginId(String uLoginId) {
		this.uLoginId = uLoginId == null ? null : uLoginId.trim();
	}

	public String getuPasswd() {
		return uPasswd;
	}

	public void setuPasswd(String uPasswd) {
		this.uPasswd = uPasswd == null ? null : uPasswd.trim();
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName == null ? null : uName.trim();
	}

	public Integer getuRole() {
		return uRole;
	}

	public void setuRole(Integer uRole) {
		this.uRole = uRole;
	}

	public Integer getuOrder() {
		return uOrder;
	}

	public void setuOrder(Integer uOrder) {
		this.uOrder = uOrder;
	}
}