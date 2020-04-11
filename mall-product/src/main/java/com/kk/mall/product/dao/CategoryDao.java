package com.kk.mall.product.dao;

import com.kk.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author luokexiong
 * @email 1020803064@qq.com
 * @date 2020-04-11 21:49:57
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
