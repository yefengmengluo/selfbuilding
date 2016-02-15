package com.wangku.dpl.domain;

public class DpwSeo {

	private Long id;//
	private Integer siteId;//站点id
	private String title;//seo标题
	private String keywords;//seo关键字
	private String description;//seo描述
	private java.util.Date createTime;//创建时间
	private java.util.Date updateTime;//修改时间
	private String deleteStatus;//删除状态
	
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
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	public String getKeywords(){
		return keywords;
	}
	
	public void setKeywords(String keywords){
		this.keywords = keywords;
	}
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description){
		this.description = description;
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
}
