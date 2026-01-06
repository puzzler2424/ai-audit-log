package io.github.puzzler2424.ai_audit_log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class AiAuditLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiAuditLogApplication.class, args);
	}

}
