class DataReaderSpec extends org.scalatest.funsuite.AnyFunSuite {
  test("DataReader.readFile no file name") {
    assert(DataReader.readFile("").isEmpty)
  }
}