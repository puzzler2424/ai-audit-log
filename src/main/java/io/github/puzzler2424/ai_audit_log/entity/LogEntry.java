package io.github.puzzler2424.ai_audit_log.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class LogEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userId;      // 누가?

    @Column(columnDefinition = "TEXT")
    private String prompt;      // 질문

    @Column(columnDefinition = "TEXT")
    private String answer;      // AI 답변

    private String hashValue;   // 조작 방지용 해시

    private LocalDateTime createdAt; // 언제?

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
    }
}