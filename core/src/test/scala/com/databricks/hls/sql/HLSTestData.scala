package com.databricks.hls.sql

import java.nio.file.Paths

trait HLSTestData {
  final lazy val testDataHome = Paths
    .get(
      sys.props.getOrElse("test.dir", ""),
      "test-data"
    )
    .toString
}
