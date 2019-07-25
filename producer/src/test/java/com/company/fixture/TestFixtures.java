package com.company.fixture;

import com.company.model.Notification;
import lombok.experimental.UtilityClass;

import java.util.Date;
import java.util.UUID;

@UtilityClass
public class TestFixtures {

  public Device getDevice() {
    return new Device(UUID.randomUUID().toString());
  }

  public static Notification getMetrics(Device device) {
    return new Notification(device, new Date(), 100);
  }

}
