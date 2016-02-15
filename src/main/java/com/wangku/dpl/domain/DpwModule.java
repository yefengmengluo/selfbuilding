package com.wangku.dpl.domain;

public class DpwModule {

	private Long id;//模块id
	private Integer siteD;//
	private Long typeId;//模块类型id
	private Long templateId;//
	private Long channelId;//来源id
	private String sourceType;//来源类型
	private Integer frameCode;//模块所属框架编码
	private Integer frameLoc;//模块所属框架位置
	private String viewJson;//组件显示风格json
	private String deleteStatus;//状态
	private String title;//模块标题
	private Integer styleId;//模块样式id
	private java.util.Date createTime;//创建时间
	private java.util.Date updateTime;//修改时间
	
// setter and getter
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	public Integer getSiteD(){
		return siteD;
	}
	
	public void setSiteD(Integer siteD){
		this.siteD = siteD;
	}
	public Long getTypeId(){
		return typeId;
	}
	
	public void setTypeId(Long typeId){
		this.typeId = typeId;
	}
	public Long getTemplateId(){
		return templateId;
	}
	
	public void setTemplateId(Long templateId){
		this.templateId = templateId;
	}
	public Long getChannelId(){
		return channelId;
	}
	
	public void setChannelId(Long channelId){
		this.channelId = channelId;
	}
	public String getSourceType(){
		return sourceType;
	}
	
	public void setSourceType(String sourceType){
		this.sourceType = sourceType;
	}
	public Integer getFrameCode(){
		return frameCode;
	}
	
	public void setFrameCode(Integer frameCode){
		this.frameCode = frameCode;
	}
	public Integer getFrameLoc(){
		return frameLoc;
	}
	
	public void setFrameLoc(Integer frameLoc){
		this.frameLoc = frameLoc;
	}
	public String getViewJson(){
		return viewJson;
	}
	
	public void setViewJson(String viewJson){
		this.viewJson = viewJson;
	}
	public String getDeleteStatus(){
		return deleteStatus;
	}
	
	public void setDeleteStatus(String deleteStatus){
		this.deleteStatus = deleteStatus;
	}
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	public Integer getStyleId(){
		return styleId;
	}
	
	public void setStyleId(Integer styleId){
		this.styleId = styleId;
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
