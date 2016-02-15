package com.wangku.dpl.domain;

public class DpwSkinStyleType {

	private Integer id;//皮肤风格类型id
	private String name;//皮肤风格名称
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
