package com.example.onedaypiece.web.domain.member;


import com.example.onedaypiece.web.domain.point.Point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member,Long> {

    // Email로 멤버 조회
    Optional<Member> findByEmail(String email);
    // Nickname으로 멤버 조회
    Optional<Member> findByNickname(String nickname);

    // Email로 멤버 존재 여부 확인
    boolean existsByEmail(String email);
    // Nickname으로 멤버 존재 여부 확인
    boolean existsByNickname(String nickname);


}

