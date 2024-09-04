package com.study.gulimall.product.dao;

import com.study.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author jyueqi
 * @email jyueqi@gmail.com
 * @date 2024-08-31 12:22:02
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
