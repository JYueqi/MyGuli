package com.study.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.study.gulimall.common.utils.PageUtils;
import com.study.gulimall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author jyueqi
 * @email jyueqi@gmail.com
 * @date 2024-08-31 18:57:18
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

