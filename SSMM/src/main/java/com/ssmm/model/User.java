package com.ssmm.model;

import java.io.Serializable;

/**
 * 用户类
 * @author 旭平
 *
 */
public class User implements Serializable{
	/**
	 * 序列号
	 */
	private static final long serialVersionUID = -6683672261515907702L;

	/**
	 * 用户id
	 */
	private Integer id;
	
	/**
	 * 用户姓名
	 */
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}