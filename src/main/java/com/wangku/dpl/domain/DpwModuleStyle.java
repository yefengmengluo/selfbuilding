package com.wangku.dpl.domain;

public class DpwModuleStyle {

	private Integer id;//
	private String name;//
	private String fileLocation;//
	private String snapshot;//
	private Integer moduleTypeId;//
	private String deleteStatus;//
	
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
	public String getFileLocation(){
		return fileLocation;
	}
	
	public void setFileLocation(String fileLocation){
		this.fileLocation = fileLocation;
	}
	public String getSnapshot(){
		return snapshot;
	}
	
	public void setSnapshot(String snapshot){
		this.snapshot = snapshot;
	}
	public Integer getModuleTypeId(){
		return moduleTypeId;
	}
	
	public void setModuleTypeId(Integer moduleTypeId){
		this.moduleTypeId = moduleTypeId;
	}
	public String getDeleteStatus(){
		return deleteStatus;
	}
	
	public void setDeleteStatus(String deleteStatus){
		this.deleteStatus = deleteStatus;
	}
}
