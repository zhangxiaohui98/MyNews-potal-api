package com.zhang.mynews.potal.service;

import java.util.Map;

import com.zhang.mynews.bean.News;
import com.zhang.mynews.util.Page;

public interface NewsService {

	/**
	 * 	发布新闻
	 * @param news
	 * @return
	 */
	int insertNews(News news);

	/**
	 * 分页查找新闻
	 * @param paramMap
	 * @return
	 */
	Page<News> queryPage(Map<String,Object> paramMap);

	/**
	 * 根据id查找新闻
	 * @param newsid
	 * @return
	 */
	News queryNewsById(int newsid);

}
