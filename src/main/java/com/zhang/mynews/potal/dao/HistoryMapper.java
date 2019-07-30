package com.zhang.mynews.potal.dao;

import java.util.List;

import com.zhang.mynews.bean.History;

public interface HistoryMapper {
	
	int deleteByPrimaryKey(Integer id);

    int insert(History record);

    History selectByPrimaryKey(Integer id);

    List<History> selectAll();

    int updateByPrimaryKey(History record);

}
