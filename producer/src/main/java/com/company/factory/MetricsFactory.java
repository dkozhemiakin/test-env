package com.company.factory;

import com.company.model.Notification;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Random;

@Component
public class MetricsFactory {

  private static final Random RANDOM = new Random();
  private static final int BOUND = 100;

  public Notification createMetrics(Device device) {
    return new Notification(device, new Date(), RANDOM.nextInt(BOUND));
  }

}
