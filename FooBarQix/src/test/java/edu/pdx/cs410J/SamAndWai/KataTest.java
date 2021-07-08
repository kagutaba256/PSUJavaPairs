package edu.pdx.cs410J.SamAndWai;

import org.junit.jupiter.api.Test;

import static edu.pdx.cs410J.SamAndWai.FooBarQix.compute;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;

public class KataTest
{

  @Test
  void canInstantiateKataClass() {
    new Kata();
  }

  @Test
  void numberDivisibleByThreeAndContainsThreeIsFoox3() {
    String x = "33";
    assertThat(compute(x), equalTo("FooFooFoo"));
  }

  @Test
  void numberDivisibleByThreeContainsFoo() {
    String x = "27";
    assertThat(compute(x), containsString("Foo"));
    String y = "33";
    assertThat(compute(y), containsString("Foo"));
  }

}
