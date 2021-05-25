class DayOneSpec extends org.scalatest.funsuite.AnyFunSuite {
  test("DayOne.FindEntriesWhichSumToExpectedValue empty list") {
    assert(DayOne.FindEntriesWhichSumToExpectedValue(List(), 10) equals (-1,-1))
  }

  test("DayOne.FindEntriesWhichSumToExpectedValue too high a value to reach") {
    val l = List(1,5,7,8)
    assert(DayOne.FindEntriesWhichSumToExpectedValue(l, 30) equals (-1,-1))
  }

    test("DayOne.FindEntriesWhichSumToExpectedValue gets expected value") {
    val l = List(1,5,7,8,13,15)
    assert(DayOne.FindEntriesWhichSumToExpectedValue(l, 13) equals (1,3))
  }

    test("DayOne.FindEntriesWhichSumToExpectedValue gets expected value again") {
    val l = List(1,5,7,6,8,13,15,2)
    assert(DayOne.FindEntriesWhichSumToExpectedValue(l, 10) equals (4,7))
  }
}