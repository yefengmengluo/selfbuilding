package com.wangku.dpl.domain;

public class SysSequence {

	private String seqName;//
	private Long seqCurrentVal;//
	private Integer seqIncreFactor;//
	
// setter and getter
	public String getSeqName(){
		return seqName;
	}
	
	public void setSeqName(String seqName){
		this.seqName = seqName;
	}
	public Long getSeqCurrentVal(){
		return seqCurrentVal;
	}
	
	public void setSeqCurrentVal(Long seqCurrentVal){
		this.seqCurrentVal = seqCurrentVal;
	}
	public Integer getSeqIncreFactor(){
		return seqIncreFactor;
	}
	
	public void setSeqIncreFactor(Integer seqIncreFactor){
		this.seqIncreFactor = seqIncreFactor;
	}
}
