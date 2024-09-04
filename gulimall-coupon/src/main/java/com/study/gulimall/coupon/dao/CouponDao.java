package com.study.gulimall.coupon.dao;

import com.study.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author jyueqi
 * @email jyueqi@gmail.com
 * @date 2024-08-31 18:42:59
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
