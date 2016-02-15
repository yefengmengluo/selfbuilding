package com.wangku.dpl.domain;

public class DpwModuleType {

	private Integer id;//模块类型id
	private String name;//模块类型名称
	private String code;//模块类型编码
	private String snapshot;//模类型块快照
	private String description;//模块类型描述
	private String fileLocation;//模块文件存储位置
	private String permission;//模块权限
	private Integer useTimes;//使用次数
	private Integer boot;//权重
	private String deleteStatus;//状态
	private String memberRole;//会员级别
	
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
	public String getSnapshot(){
		return snapshot;
	}
	
	public void setSnapshot(String snapshot){
		this.snapshot = snapshot;
	}
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	public String getFileLocation(){
		return fileLocation;
	}
	
	public void setFileLocation(String fileLocation){
		this.fileLocation = fileLocation;
	}
	public String getPermission(){
		return permission;
	}
	
	public void setPermission(String permission){
		this.permission = permission;
	}
	public Integer getUseTimes(){
		return useTimes;
	}
	
	public void setUseTimes(Integer useTimes){
		this.useTimes = useTimes;
	}
	public Integer getBoot(){
		return boot;
	}
	
	public void setBoot(Integer boot){
		this.boot = boot;
	}
	public String getDeleteStatus(){
		return deleteStatus;
	}
	
	public void setDeleteStatus(String deleteStatus){
		this.deleteStatus = deleteStatus;
	}
	public String getMemberRole(){
		return memberRole;
	}
	
	public void setMemberRole(String memberRole){
		this.memberRole = memberRole;
	}
}
