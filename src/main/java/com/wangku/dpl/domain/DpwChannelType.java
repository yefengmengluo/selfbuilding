package com.wangku.dpl.domain;

public class DpwChannelType {

	private Integer id;//频道类型id
	private String name;//频道类型名称
	private String type;//类型
	private String permission;//频道权限
	private String deleteStatus;//状态
	
// setter and getter
	public Integer getId(){
		return id;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getType(){
		return type;
	}
	
	public void setType(String type){
		this.type = type;
	}
	public String getPermission(){
		return permission;
	}
	
	public void setPermission(String permission){
		this.permission = permission;
	}
	public String getDeleteStatus(){
		return deleteStatus;
	}
	
	public void setDeleteStatus(String deleteStatus){
		this.deleteStatus = deleteStatus;
	}
}
