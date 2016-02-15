package com.wangku.dpl.domain;

public class DpwSystemTemplate {

	private Integer id;//id
	private String templateType;//模板类型
	private String frameType;//框架类型
	private String frameSnapshot;//框架快照
	private String homePageSnapshot;//首页快照
	private String deleteStatus;//状态
	private String background;//背景
	private String description;//描述
	private String memberRole;//会员级别
	
// setter and getter
	public Integer getId(){
		return id;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	public String getTemplateType(){
		return templateType;
	}
	
	public void setTemplateType(String templateType){
		this.templateType = templateType;
	}
	public String getFrameType(){
		return frameType;
	}
	
	public void setFrameType(String frameType){
		this.frameType = frameType;
	}
	public String getFrameSnapshot(){
		return frameSnapshot;
	}
	
	public void setFrameSnapshot(String frameSnapshot){
		this.frameSnapshot = frameSnapshot;
	}
	public String getHomePageSnapshot(){
		return homePageSnapshot;
	}
	
	public void setHomePageSnapshot(String homePageSnapshot){
		this.homePageSnapshot = homePageSnapshot;
	}
	public String getDeleteStatus(){
		return deleteStatus;
	}
	
	public void setDeleteStatus(String deleteStatus){
		this.deleteStatus = deleteStatus;
	}
	public String getBackground(){
		return background;
	}
	
	public void setBackground(String background){
		this.background = background;
	}
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	public String getMemberRole(){
		return memberRole;
	}
	
	public void setMemberRole(String memberRole){
		this.memberRole = memberRole;
	}
}
