package com.example.javakafkatutorialv01;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.context.EmbeddedKafka;

@SpringBootTest
@EmbeddedKafka(partitions = 1, topics = "test-topic")
class Javakafkatutorialv01ApplicationTests {

	@Test
	void contextLoads() {
	}

}
