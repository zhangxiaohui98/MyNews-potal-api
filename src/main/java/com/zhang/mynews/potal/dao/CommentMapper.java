package com.zhang.mynews.potal.dao;

import java.util.List;

import com.zhang.mynews.bean.Comment;

public interface CommentMapper {
	
	int deleteByPrimaryKey(Integer id);

    int insert(Comment record);

    Comment selectByPrimaryKey(Integer id);

    List<Comment> selectAll();

    int updateByPrimaryKey(Comment record);
}
