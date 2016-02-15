package com.wangku.dpl.domain;

public class DpwSkin {

	private Integer id;//皮肤id
	private Integer colorTypeId;//皮肤颜色类型id
	private Integer styleTypeId;//皮肤风格类型id
	private Integer tradeTypeId;//
	private String name;//皮肤名称
	private String fileLocation;//皮肤文件存储位置
	private String snapshot;//皮肤快照
	private String permission;//皮肤权限
	private String valid;//皮肤是否启用
	private Integer useTimes;//皮肤使用次数
	private Integer boot;//皮肤权重
	private String deleteStatus;//状态
	private java.util.Date createTime;//创建时间
	private java.util.Date updateTime;//修改时间
	
// setter and getter
	public Integer getId(){
		return id;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getColorTypeId(){
		return colorTypeId;
	}
	
	public void setColorTypeId(Integer colorTypeId){
		this.colorTypeId = colorTypeId;
	}
	public Integer getStyleTypeId(){
		return styleTypeId;
	}
	
	public void setStyleTypeId(Integer styleTypeId){
		this.styleTypeId = styleTypeId;
	}
	public Integer getTradeTypeId(){
		return tradeTypeId;
	}
	
	public void setTradeTypeId(Integer tradeTypeId){
		this.tradeTypeId = tradeTypeId;
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
	public String getPermission(){
		return permission;
	}
	
	public void setPermission(String permission){
		this.permission = permission;
	}
	public String getValid(){
		return valid;
	}
	
	public void setValid(String valid){
		this.valid = valid;
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
	public java.util.Date getCreateTime(){
		return createTime;
	}
	
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}
	public java.util.Date getUpdateTime(){
		return updateTime;
	}
	
	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime = updateTime;
	}
}
