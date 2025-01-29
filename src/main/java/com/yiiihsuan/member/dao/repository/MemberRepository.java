package com.yiiihsuan.member.dao.repository;

import com.yiiihsuan.member.dao.entity.MemberDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//@Repository
public interface MemberRepository extends JpaRepository<MemberDo, Long> {
    Optional<MemberDo> findByEmail(String email);
}

