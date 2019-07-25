package com.company.factory;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class DeviceFactory {

  public Device createDevice() {
    return new Device(UUID.randomUUID().toString());
  }

}
