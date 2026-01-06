package io.github.puzzler2424.ai_audit_log.service;

import io.github.puzzler2424.ai_audit_log.entity.LogEntry;
import io.github.puzzler2424.ai_audit_log.reposirory.LogRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogService {

    private final LogRepository logRepository;

    @Transactional
    public void saveLog(String userId, String prompt, String answer) {

        String dummyHash = "hash-" + System.currentTimeMillis();

        LogEntry log = new LogEntry();
        log.setUserId(userId);
        log.setPrompt(prompt);
        log.setAnswer(answer);
        log.setHashValue(dummyHash);

        logRepository.save(log);
    }

}
