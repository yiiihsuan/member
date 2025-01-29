package com.yiiihsuan.member.controller;

import com.yiiihsuan.member.dao.entity.MemberDo;
import com.yiiihsuan.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/members")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }


    @PostMapping("/register")
    public ResponseEntity<String> registerMember(@RequestBody MemberDo member) {
        try {
            memberService.registerMember(member);
            return ResponseEntity.ok("Registration successful!");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    // restful, 這隻要幹麻, 用查詢 用id 或email 還是選一個就好, 可以分兩隻
    @GetMapping("/id/{id}")
    public ResponseEntity<MemberDo> findMemberById(@PathVariable("id") Long id) {
        try {
            // 調用 Service 層的 findMember 方法
            MemberDo member = memberService.findMemberById(id);
            return ResponseEntity.ok(member); // 查詢成功，返回會員數據
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null); // 請求不合法時，返回 400
        }
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<MemberDo> findMemberByEMail(@PathVariable("email") String email) {
        try {
            // 調用 Service 層的 findMember 方法
            MemberDo member = memberService.findMemberByEmail(email);
            return ResponseEntity.ok(member); // 查詢成功，返回會員數據
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null); // 請求不合法時，返回 400
        }
    }






}




