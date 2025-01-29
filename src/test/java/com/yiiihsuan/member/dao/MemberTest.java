package com.yiiihsuan.member.dao;

import com.yiiihsuan.member.dao.entity.MemberDo;
import com.yiiihsuan.member.dao.mapper.MemberMapper;
import com.yiiihsuan.member.dao.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class MemberTest {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private MemberMapper memberMapper;

    @Test
    public void testRepository() {
        List<MemberDo> memberDoList = memberRepository.findAll();
        MemberDo memberDo = memberMapper.findById(1L);
//        MemberDo memberDo = new MemberDo();
//        memberDo.setName("宣萱");
//        memberDo.setPassword("123456");
//        memberDo.setPhone("1888888888");
//        memberDo.setEmail("test@qq.com");
//
//        memberRepository.save(memberDo);
//
//        List<MemberDo> memberDoList2 = memberRepository.findAll();

//        String x = "4";
    }
}