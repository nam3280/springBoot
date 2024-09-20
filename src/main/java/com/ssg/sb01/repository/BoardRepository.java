package com.ssg.sb01.repository;

import com.ssg.sb01.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board,Long> {
}
//JpaRepository인터페이스를 상속할 땐 엔티티 타입과 @Id 타입을 지정해줘야 한다.