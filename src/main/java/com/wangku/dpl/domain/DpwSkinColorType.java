package com.wangku.dpl.domain;

public class DpwSkinColorType {

	private Integer id;//皮肤颜色类型id
	private String name;//皮肤颜色名
	private String code;//皮肤颜色值
	private Integer sort;//排序
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
	public String getCode(){
		return code;
	}
	
	public void setCode(String code){
		this.code = code;
	}
	public Integer getSort(){
		return sort;
	}
	
	public void setSort(Integer sort){
		this.sort = sort;
	}
	public String getDeleteStatus(){
		return deleteStatus;
	}
	
	public void setDeleteStatus(String deleteStatus){
		this.deleteStatus = deleteStatus;
	}
}
