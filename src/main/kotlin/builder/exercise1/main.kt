package builder.sample


fun main(args: Array<String>) {
    var builderName = "plain"

    if (builderName == "plain") {
        val builder = TextBuilder()
        val director = Director(builder)
        director.construct()
        val result = builder.getResult()
        println(result)
    } else {
        val builder = HTMLBuilder()
        val director = Director(builder)
        director.construct()
        val result = builder.getResult()
        println(result)
    }
}