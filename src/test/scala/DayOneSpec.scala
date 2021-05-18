import org.scalatest.wordspec._

class DayOneSpec extends AnyWordSpec {
  "The sample code" should {
    "say hello" in {
      assert(DayOne.greeting.startsWith("h"))
    }
  }
}