fun main(args: Array<String>) {  
    performUltimate(()-> Unit{ println("Jett is using her ultimate ability: Blade Storm!") })  
}  
  
inline fun performUltimate(action: () -> Unit) {  
    action()  // Executes the function passed as the ultimate action
    println("Jett swiftly executes her enemies with precision.")  
}
