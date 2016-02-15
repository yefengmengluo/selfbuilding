package com.wangku.dpl.domain;

public class DpwMemberTemplate {

	private Long id;//
	private Integer siteId;//站点id
	private Integer systemTemplateId;//系统模板id
	private Integer skinId;//皮肤id
	private java.util.Date saveTime;//保存时间
	private String saveType;//保存类型
	private Integer boot;//权重
	private Integer useTimes;//使用次数
	private String deleteStatus;//状态
	private String seoTitle;//
	private String seoKeywords;//
	private String seoDescription;//
	private String background;//背景
	private java.util.Date createTime;//创建时间
	
// setter and getter
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	public Integer getSiteId(){
		return siteId;
	}
	
	public void setSiteId(Integer siteId){
		this.siteId = siteId;
	}
	public Integer getSystemTemplateId(){
		return systemTemplateId;
	}
	
	public void setSystemTemplateId(Integer systemTemplateId){
		this.systemTemplateId = systemTemplateId;
	}
	public Integer getSkinId(){
		return skinId;
	}
	
	public void setSkinId(Integer skinId){
		this.skinId = skinId;
	}
	public java.util.Date getSaveTime(){
		return saveTime;
	}
	
	public void setSaveTime(java.util.Date saveTime){
		this.saveTime = saveTime;
	}
	public String getSaveType(){
		return saveType;
	}
	
	public void setSaveType(String saveType){
		this.saveType = saveType;
	}
	public Integer getBoot(){
		return boot;
	}
	
	public void setBoot(Integer boot){
		this.boot = boot;
	}
	public Integer getUseTimes(){
		return useTimes;
	}
	
	public void setUseTimes(Integer useTimes){
		this.useTimes = useTimes;
	}
	public String getDeleteStatus(){
		return deleteStatus;
	}
	
	public void setDeleteStatus(String deleteStatus){
		this.deleteStatus = deleteStatus;
	}
	public String getSeoTitle(){
		return seoTitle;
	}
	
	public void setSeoTitle(String seoTitle){
		this.seoTitle = seoTitle;
	}
	public String getSeoKeywords(){
		return seoKeywords;
	}
	
	public void setSeoKeywords(String seoKeywords){
		this.seoKeywords = seoKeywords;
	}
	public String getSeoDescription(){
		return seoDescription;
	}
	
	public void setSeoDescription(String seoDescription){
		this.seoDescription = seoDescription;
	}
	public String getBackground(){
		return background;
	}
	
	public void setBackground(String background){
		this.background = background;
	}
	public java.util.Date getCreateTime(){
		return createTime;
	}
	
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}
}
