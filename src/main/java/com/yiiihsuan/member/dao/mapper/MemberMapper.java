package com.yiiihsuan.member.dao.mapper;

import com.yiiihsuan.member.dao.entity.MemberDo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MemberMapper {
    @Select("SELECT id, name, phone, email FROM member WHERE id = #{id}")
    MemberDo findById(Long id);
}

