package test;

import org.junitpioneer.jupiter.RetryingTest;

class ModuleSystemTests {

  @RetryingTest(3)
  void test() {}
}
