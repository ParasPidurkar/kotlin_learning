// accepts function as a parameter or returns a function or can do both

fun  sayDialogue(name:String,location:String,agentInfo:(String,String)->String):Unit{
    val agentDialogue = agentInfo(name,location)
    println(agentDialogue)
}

fun Dialogue(name: String,location: String):String{
return "Hello I am $name from $location"
}

fun main(args:Array<String>){
sayDialogue("Paras","Nagpur",::Dialogue)
}