package com.hikvision.manager.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hikvision.manager.entity.Problem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProblemMapper extends BaseMapper<Problem> {
}
