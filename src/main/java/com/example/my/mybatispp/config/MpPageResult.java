package com.example.my.mybatispp.config;

import lombok.Data;

import java.util.List;
@Data
public class MpPageResult<T> {


	private Long total;
	private Long pageSize;

	private Long pageNum;

	private Long pages;

	private List<T> list;


	public MpPageResult(Long total, Long pageSize, Long pageNum, Long pages, List<T> list) {
		this.total = total;
		this.pageSize = pageSize;
		this.pageNum = pageNum;
		this.pages = pages;
		this.list = list;
	}
}
