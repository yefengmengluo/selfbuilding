package com.wangku.dpl.domain;

public class DpwCustomModule {

	private Long id;//
	private String customTitle;//自定义模块标题
	private String customContent;//自定义模块内容
	private Long moduleId;//模块id
	private Integer status;//状态
	private String corporationName;//公司名称
	private java.util.Date createTime;//创建时间
	private java.util.Date updateTime;//更新时间
	private String deleteStatus;//删除状态
	private String disableReason;//禁用原因
	private Integer disableType;//禁用类型
	
// setter and getter
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	public String getCustomTitle(){
		return customTitle;
	}
	
	public void setCustomTitle(String customTitle){
		this.customTitle = customTitle;
	}
	public String getCustomContent(){
		return customContent;
	}
	
	public void setCustomContent(String customContent){
		this.customContent = customContent;
	}
	public Long getModuleId(){
		return moduleId;
	}
	
	public void setModuleId(Long moduleId){
		this.moduleId = moduleId;
	}
	public Integer getStatus(){
		return status;
	}
	
	public void setStatus(Integer status){
		this.status = status;
	}
	public String getCorporationName(){
		return corporationName;
	}
	
	public void setCorporationName(String corporationName){
		this.corporationName = corporationName;
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
	public String getDeleteStatus(){
		return deleteStatus;
	}
	
	public void setDeleteStatus(String deleteStatus){
		this.deleteStatus = deleteStatus;
	}
	public String getDisableReason(){
		return disableReason;
	}
	
	public void setDisableReason(String disableReason){
		this.disableReason = disableReason;
	}
	public Integer getDisableType(){
		return disableType;
	}
	
	public void setDisableType(Integer disableType){
		this.disableType = disableType;
	}
}
