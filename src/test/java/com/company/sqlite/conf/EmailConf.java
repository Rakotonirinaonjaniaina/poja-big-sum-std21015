package com.company.sqlite.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import com.company.sqlite.PojaGenerated;

@PojaGenerated
public class EmailConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.ses.source", () -> "dummy-ses-source");
  }
}
