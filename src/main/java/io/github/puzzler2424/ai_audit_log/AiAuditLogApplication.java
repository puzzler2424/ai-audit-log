package io.github.puzzler2424.ai_audit_log;

import io.github.puzzler2424.ai_audit_log.service.LogService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AiAuditLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiAuditLogApplication.class, args);
	}

	@Bean
	public CommandLineRunner testData(LogService logService) {
		return args -> {
			logService.saveLog("puzzler2424", "안녕 너는 AI니?", "네, 저는 AI입니다.");
			System.out.println("테스트 로그가 DB에 기록됨");
		};
	}
}
