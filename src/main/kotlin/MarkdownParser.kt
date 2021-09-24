import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.FileReader
import java.io.FileWriter

class MarkdownParser : CodeParser {
    override fun parseCode(filename: String): List<Node> {
        val lines = mutableListOf<Node>()
        val regex = Regex("([*#>]*)(.*?) ?\\**")
        val reader = BufferedReader(FileReader(filename))
        var line: String?

        while (reader.readLine().also {
                line = it
            } != null) {
            line?.let {
                var results = regex.matchEntire(it)
                var node = MarkdownNode()
                results?.let {
                    val map = mapOf("**" to 4,"*" to 5,"#" to 1,"##" to 2,"###" to 3,">" to 6,"<hr/>" to 7, "" to 0)
                    for (i in 1 until results.groups.size-1) {
                        map[results.groupValues[i]]?.let {
                            node.type = it
                            node.text = results.groupValues[2]
                            lines.add(node)
                        }
                    }
                }
            }
        }
        return lines
    }
}

