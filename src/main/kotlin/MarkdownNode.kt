class MarkdownNode : Node() {
    var type:Int = 0
    override fun toHTML(): String {
        val map = mapOf(0 to "${this.text}",1 to "<h1>${this.text.trim()}</h1>", 2 to "<h2> ${this.text.trim()} </h2>" , 3 to "<h3> ${this.text.trim()} </h3>", 4 to "<b>${this.text.trim()}</b>",5 to "<i>${this.text.trim()} </i>",6 to "<blockquote>${this.text.trim()} </blockquote>", 7 to "<hr/>")
        return map[this.type].toString()
    }
}