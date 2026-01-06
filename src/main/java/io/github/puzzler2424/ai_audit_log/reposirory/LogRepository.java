package io.github.puzzler2424.ai_audit_log.reposirory;

import io.github.puzzler2424.ai_audit_log.entity.LogEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends JpaRepository<LogEntry, Long> {
    // 아무것도 안 적어도 된다.
    // JpaRepository를 상속받는 순간, 저장/조회/삭제 기능이 생김.
}