package assertions.assertions

import assertions.api.Assertion

fun <T : Collection<E>, E> Assertion<T>.hasSize(expected: Int): Assertion<T> =
  apply {
    evaluate("has size $expected") { subject ->
      if (subject.size == expected) {
        success()
      } else {
        failure()
      }
    }
  }