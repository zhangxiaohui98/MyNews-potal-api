package com.zhang.mynews.potal.dao;

import java.util.List;
import java.util.Map;

import com.zhang.mynews.bean.News;

public interface NewsMapper {
	
	int deleteByPrimaryKey(Integer id);

    int insert(News record);

    News selectByPrimaryKey(Integer id);

    List<News> selectAll();

    int updateByPrimaryKey(News record);

    //获取news列，分页
	List<News> queryList(Map<String, Object> paramMap);

	//获取news总数
	Integer queryCount(Map<String, Object> paramMap);

}
