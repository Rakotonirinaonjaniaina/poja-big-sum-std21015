package com.company.sqlite.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import com.company.sqlite.PojaGenerated;

@PojaGenerated
public class BucketConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.s3.bucket", () -> "dummy-bucket");
  }
}
