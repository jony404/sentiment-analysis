package com.mulesoft.support;

import java.util.TimeZone;

public class SetTimeZone {

 public void initialize() {
  TimeZone.setDefault(TimeZone.getTimeZone("GMT-05:00"));
 }
}