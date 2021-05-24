object DataReader{
    def readFile(filename: String): Seq[String] = {
        var lines = List[String]()
        try {
            val bufferedSource = io.Source.fromFile(filename)
            lines = (for (line <- bufferedSource.getLines()) yield line).toList
            bufferedSource.close
            lines
        }
        catch {
            case e:Exception=> println("Exception caught")
        }
        lines
    }
}