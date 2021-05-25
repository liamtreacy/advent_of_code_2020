import scala.util.control.Breaks._

// Find the two entries that sum to 2020; what do you get if you multiply them together?
object DayOne {
  def GetDayOneAnswer: Unit = {
    val contents = DataReader.sumValuesFromFile("")

    val positions = 1
    var entries = DataReader.readFile("").toList.map(_.toString.toInt)
    val (first, second) = FindEntriesWhichSumToExpectedValue(entries, 2020)
  }

  def FindEntriesWhichSumToExpectedValue( contents: List[Int], value: Int) = {
    var first, second = -1
    breakable {
      for (i <- 0 until contents.length)
      {
        for( j <- i+1 until contents.length)
        {
          if( contents(i) + contents(j) == value)
          {
            first = i
            second = j
            break
          }
        }
      }
    }
    (first,second)
  }
}