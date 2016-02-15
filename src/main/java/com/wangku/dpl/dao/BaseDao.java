package com.wangku.dpl.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wangku.dpl.util.Page;

/**
 * 
 * @Title: BaseDao.java 
 * @Description: TODO  
 * @author lijinzhou  
 * @Modified lijinzhou      
 * @date 2015-7-22 下午3:00:25   
 * @version V1.0   
 * @Copyright 中国网库-单品外包服务中心-单品网技术部
 */

public interface BaseDao<T> {

	public void add(T t);

	public T queryById(@Param("id") Object id);

	public Integer update(T t);

	public Integer updateBySelect(T t);

	public Integer delete(@Param("codes") Object id);

	public Long queryCount(@Param("entity") T t);

	public List<T> queryList(@Param("entity") T t, @Param("page") Page<T> page);

}
