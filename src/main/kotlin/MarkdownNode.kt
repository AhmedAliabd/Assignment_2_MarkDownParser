class MarkdownNode : Node() {
    var type:Int = 0
    override fun toHTML(): String {
        //TODO("Just check the type and return the html tag and the text string")
        if(type==1)
        {
            return "<h1>${this.text} </h1>"
        }else if (type == 2)
        {
            return "<h2>${this.text} </h2>"
        }else if (type == 3)
        {
            return "<h3>${this.text} </h3>"
        }
        else if (type == 4)
        {
            return "<b>${this.text} </b>"
        }else if (type == 5)
        {
            return "<i>${this.text} </i>"
        }else if (type == 6)
        {
            return "<blockquote>${this.text} </blockquote>"
        }
        else if (type == 7)
        {
            return "<hr/>"
        }else if (type==0)
        {
            return this.text
        }else
            return ""
    }
}