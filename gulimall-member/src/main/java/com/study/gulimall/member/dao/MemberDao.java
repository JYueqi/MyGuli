package com.study.gulimall.member.dao;

import com.study.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author jyueqi
 * @email jyueqi@gmail.com
 * @date 2024-08-31 18:48:04
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
