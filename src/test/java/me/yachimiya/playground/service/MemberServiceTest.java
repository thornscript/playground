package me.yachimiya.playground.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.Optional;
import me.yachimiya.playground.domain.Member;
import me.yachimiya.playground.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MemberServiceTest {
    @Mock
    MemberRepository memberRepository;

    @InjectMocks
    MemberService memberService;

    @Test
    void getMember() {
        // given
        Long id = 1L;
        Member expectedMember = Member.builder()
                .email("example@example.org")
                .password("example123")
                .build();

        when(memberRepository.findById(id)).thenReturn(Optional.of(expectedMember));

        // when
        Member foundMember = memberService.getMember(id);

        // then
        assertThat(foundMember.getEmail()).isEqualTo("test@example.org");
    }
}