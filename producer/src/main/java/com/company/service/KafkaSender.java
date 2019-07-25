package com.company.service;

import com.company.model.Notification;
import com.company.properties.KafkaProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class KafkaSender {

  private final KafkaTemplate<UUID, Notification> template;
  private final KafkaProperties kafkaProperties;

  public void send(Notification metrics) {
    template.send(kafkaProperties.getTopic(), metrics);
  }

}
