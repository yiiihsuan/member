package com.yiiihsuan.member.service;

import com.yiiihsuan.member.dao.entity.MemberDo;
import com.yiiihsuan.member.dao.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public void registerMember(MemberDo member) {
        // 檢查 email 是否已存在
//        member.getEmail();
        Optional<MemberDo> existingMember = memberRepository.findAll().stream()
                .filter(m -> m.getEmail().equalsIgnoreCase(member.getEmail()))
                .findFirst();
        if (existingMember.isPresent()) {
            throw new IllegalArgumentException("Email already exists!");
        }

        // 保存會員數據
        memberRepository.save(member);
    }
//為什麼registerMember 用 MemberDo member 這邊不用。MemberDo member
// 宣告才要
    public MemberDo findMemberById(Long id) {
        return memberRepository.findById(id).orElseThrow(IllegalArgumentException::new);

    }

    public MemberDo findMemberByEmail(String email) {
        return memberRepository.findByEmail(email).orElseThrow(IllegalArgumentException::new);
    }
}



