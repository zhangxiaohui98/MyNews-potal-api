package com.zhang.mynews.potal.dao;

import java.util.List;

import com.zhang.mynews.bean.Favorites;


public interface FavoritesMapper {
	
	int deleteByPrimaryKey(Integer id);

    int insert(Favorites record);

    Favorites selectByPrimaryKey(Integer id);

    List<Favorites> selectAll();

    int updateByPrimaryKey(Favorites record);

}
