fun main( ){
    var resultado:Int  = 0
    var num1:Int
    var num2:Int
    var op1:Int
    println("Bem vindo(a) a Calculadora!")

    println("Entre o primeiro número: ")
    num1 = Integer.valueOf(readLine())
    println("Entre com o segundo número: ")
    num2 = Integer.valueOf(readLine())
    println("Qual operação deseja fazer com esses números? 1 (Adição), 2 (Subtração), 3 (Multiplicação) ou 4 (Divisão)? ")
    op1 = Integer.valueOf(readLine())
    if(op1 == 2) {
        resultado = num1 - num2}
    else{
        if(op1==1){
            resultado = num1+num2}
        else{
            if(op1==3){
                resultado = num1*num2 }
            else{
            if(op1==4){
                resultado = num1/num2
            }}
        }
    }
        println(resultado)

    }
    

