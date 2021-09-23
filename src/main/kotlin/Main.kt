import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.FileReader
import java.io.FileWriter
import kotlin.reflect.typeOf

fun main(args: Array<String>) {
    val writer = BufferedWriter(FileWriter("index.html"))
    var markdown = MarkdownParser()
    var x = markdown.parseCode("Markdown.md")
    for (i in x)
    {
        writer.write(i.toHTML() + "\n")
    }
    writer.flush()

}

