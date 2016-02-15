package com.wangku.dpl.domain;

public class DpwChannel {

	private Long id;//频道id
	private Long templateId;//
	private Integer typeId;//频道类型id
	private String templateType;//
	private String name;//频道名称
	private String display;//是否显示
	private Integer sort;//排序序号
	private String layoutCode;//布局编码
	private String deleteStatus;//状态
	private Integer siteId;//
	private java.util.Date createTime;//创建时间
	private java.util.Date updateTime;//修改时间
	
// setter and getter
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	public Long getTemplateId(){
		return templateId;
	}
	
	public void setTemplateId(Long templateId){
		this.templateId = templateId;
	}
	public Integer getTypeId(){
		return typeId;
	}
	
	public void setTypeId(Integer typeId){
		this.typeId = typeId;
	}
	public String getTemplateType(){
		return templateType;
	}
	
	public void setTemplateType(String templateType){
		this.templateType = templateType;
	}
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getDisplay(){
		return display;
	}
	
	public void setDisplay(String display){
		this.display = display;
	}
	public Integer getSort(){
		return sort;
	}
	
	public void setSort(Integer sort){
		this.sort = sort;
	}
	public String getLayoutCode(){
		return layoutCode;
	}
	
	public void setLayoutCode(String layoutCode){
		this.layoutCode = layoutCode;
	}
	public String getDeleteStatus(){
		return deleteStatus;
	}
	
	public void setDeleteStatus(String deleteStatus){
		this.deleteStatus = deleteStatus;
	}
	public Integer getSiteId(){
		return siteId;
	}
	
	public void setSiteId(Integer siteId){
		this.siteId = siteId;
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
