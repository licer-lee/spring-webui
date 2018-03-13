package com.liwc.model;

import java.io.Serializable;
import java.util.List;

public class SysMenu implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String mCode;

	private String mName;

	private String mUrl;

	private Integer mOrder;

	private Integer mParent;

	private List<SysMenu> child;

	private Integer mLevel;

	public Integer getmParent() {
		return mParent;
	}

	public void setmParent(Integer mParent) {
		this.mParent = mParent;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getmCode() {
		return mCode;
	}

	public void setmCode(String mCode) {
		this.mCode = mCode == null ? null : mCode.trim();
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName == null ? null : mName.trim();
	}

	public String getmUrl() {
		return mUrl;
	}

	public void setmUrl(String mUrl) {
		this.mUrl = mUrl == null ? null : mUrl.trim();
	}

	public Integer getmOrder() {
		return mOrder;
	}

	public void setmOrder(Integer mOrder) {
		this.mOrder = mOrder;
	}

	public List<SysMenu> getChild() {
		return child;
	}

	public void setChild(List<SysMenu> child) {
		this.child = child;
	}

	public Integer getmLevel() {
		return mLevel;
	}

	public void setmLevel(Integer mLevel) {
		this.mLevel = mLevel;
	}
}