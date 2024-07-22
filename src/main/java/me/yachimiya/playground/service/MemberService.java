package me.yachimiya.playground.service;

import lombok.RequiredArgsConstructor;
import me.yachimiya.playground.domain.Member;
import me.yachimiya.playground.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public Member getMember(Long id) {
        return memberRepository.findById(id).orElseThrow();
    }
}
