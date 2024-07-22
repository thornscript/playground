package me.yachimiya.playground.repository;

import me.yachimiya.playground.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
