package com.github.yeahx4.solution

/**
 * https://programmers.co.kr/learn/courses/30/lessons/68644
 */

class PickTwoAndSum {
  companion object {
    fun solution(numbers: IntArray): IntArray {
      var answer: IntArray = intArrayOf()

      for ((i, num1) in numbers.withIndex()) {
        for ((j, num2) in numbers.withIndex()) {
          if (i != j && i < j) {
            answer = answer.plus(num1 + num2)
          }
        }
      }

      answer.sort()
      return answer.distinct().toIntArray()
    }
  }
}
