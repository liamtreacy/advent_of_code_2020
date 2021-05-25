import scala.util.control.Breaks._

// Find the three entries that sum to 2020; what do you get if you multiply them together?
object DayOnePartTwo{
  def FindThreeEntriesWhichSumToExpectedValue( contents: List[Int], value: Int) = {
    var first, second, third = -1
    breakable {
      for (i <- 0 until contents.length)
      {
        for( j <- i+1 until contents.length)
        {
            for( k <- j+1 until contents.length)
            {
                if( contents(i) + contents(j) + contents(k) == value)
                {
                    first = i
                    second = j
                    third = k
                    break
                }
            }
        }
      }
    }
    (first,second, third)
  }
}