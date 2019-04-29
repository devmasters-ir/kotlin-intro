package datatypes

fun main(){
    var numa:Byte = 0
    var numb:Short = 0
    var numc:Int = 0
    var numd:Long = 0L



    var f:Float = 0.0F
    var d:Double = 12.0

    var bin = 0b11
    var hex = 0xAB


    var b:Boolean


    var x:Char = 'A'
    var y = """asdf
        |asdf
        |asdf
        |asd
    """

    val arr: Array<Int> = arrayOf(1,4,6,7)



    val teams = arrayOf("Liv", "Man", "NewCastle")
    var players = arrayOf("Roni", "Neymar","Messei", "Ronaldo")


    val randItem = kotlin.random.Random(42).nextInt(0, teams.size)
    print(randItem)
    println("Random Team ${teams[randItem]} ")

}