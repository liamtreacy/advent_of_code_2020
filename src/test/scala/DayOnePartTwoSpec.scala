class DayOnePartTwoSpec extends org.scalatest.funsuite.AnyFunSuite {
  test("DayOnePartTwo.FindThreeEntriesWhichSumToExpectedValue empty list") {
    assert(DayOnePartTwo.FindThreeEntriesWhichSumToExpectedValue(List(), 10) equals (-1,-1,-1))
  }

  test("DayOnePartTwo.FindThreeEntriesWhichSumToExpectedValue too high a value to reach") {
    val l = List(1,5,7,8)
    assert(DayOnePartTwo.FindThreeEntriesWhichSumToExpectedValue(l, 30) equals (-1,-1,-1))
  }

    test("DayOnePartTwo.FindThreeEntriesWhichSumToExpectedValue gets expected value") {
    val l = List(1,5,7,8,13,15)
    assert(DayOnePartTwo.FindThreeEntriesWhichSumToExpectedValue(l, 16) equals (0,2,3))
  }

    test("DayOnePartTwo.FindThreeEntriesWhichSumToExpectedValue gets expected value again") {
    val l = List(1,5,7,6,8,13,15,2)
    assert(DayOnePartTwo.FindThreeEntriesWhichSumToExpectedValue(l, 30) equals (2,4,6))
  }

    test("DayOnePartTwo Solution") {
    val l = DataReader.readFile(getClass.getResource("/input_for_puzzle_from_site.txt").getPath).map(_.toString.toInt)
    val soln = DayOnePartTwo.FindThreeEntriesWhichSumToExpectedValue(l, 2020)
    
    // Multiply the following two for the answer
    println(l(48))
    println(l(105))
    println(l(119))
    assert(soln equals (48,105,119)

)
  } 
}