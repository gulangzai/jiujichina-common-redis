package com.lanbao.redis.vo;

import java.io.Serializable;
import java.util.List;

public class RedisGoodsCategoryPathVo implements Serializable {

	private List<GoodsCategoryPathVo> gcpath;

	public List<GoodsCategoryPathVo> getGcpath() {
		return gcpath;
	}

	public void setGcpath(List<GoodsCategoryPathVo> gcpath) {
		this.gcpath = gcpath;
	}

}
