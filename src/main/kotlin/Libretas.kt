class Libretas {
    private var edad:Int = 0
    private var sisben:Int = 0

    constructor()

    constructor(edad: Int, sisben: Int) {
        this.edad = edad
        this.sisben = sisben
    }

    fun cuantoPaga() {
        var edad:Int
        var nivelSisben:Int
        var pagar:Int = 350000
        var totalpaga:Int = pagar
        var pagar18:Int = 200000
        var totalpaga18:Int = pagar18
        var descuento:Int
        println("""
            Por favor ingrese su edad
        """.trimIndent())
        edad = readln().toInt()
        println("Por favor ingrese su nivel del sisben")
        nivelSisben = readln().toInt()

        if (edad > 18){
            if (nivelSisben == 1){
                descuento = (pagar*40)/100
                pagar -= descuento
                println("""
                    Usted deberia pagar: $totalpaga
                    Pero tiene un descuento del 40% lo cual es: $descuento
                    Por lo cual su total a pagar es: $pagar
                """.trimIndent())
            }else if(nivelSisben == 2){
                descuento = (pagar*30)/100
                pagar -= descuento
                println("""
                    Usted deberia pagar: $totalpaga
                    Pero tiene un descuento del 30% lo cual es: $descuento
                    Por lo cual su total a pagar es: $pagar
                """.trimIndent())
            }else if(nivelSisben == 3){
                descuento = (pagar*15)/100
                pagar -= descuento
                println("""
                    Usted deberia pagar: $totalpaga
                    Pero tiene un descuento del 15% lo cual es: $descuento
                    Por lo cual su total a pagar es: $pagar
                """.trimIndent())
            }else{
                println("""
                    Usted debe pagar la totalidad de la libreta
                    Pago de : $totalpaga
                """.trimIndent())
            }
        }else if (edad == 18){
            if (nivelSisben == 1){
                descuento = (pagar18*60)/100
                pagar18 -= descuento
                println("""
                    Usted deberia pagar: $totalpaga18
                    Pero tiene un descuento del 60% lo cual es: $descuento
                    Por lo cual su total a pagar es: $pagar18
                """.trimIndent())
            }else if(nivelSisben == 2){
                descuento = (pagar18*40)/100
                pagar18 -= descuento
                println("""
                    Usted deberia pagar: $totalpaga18
                    Pero tiene un descuento del 40% lo cual es: $descuento
                    Por lo cual su total a pagar es: $pagar18
                """.trimIndent())
            }else if(nivelSisben == 3){
                descuento = (pagar18*20)/100
                pagar18 -= descuento
                println("""
                    Usted deberia pagar: $totalpaga18
                    Pero tiene un descuento del 20% lo cual es: $descuento
                    Por lo cual su total a pagar es: $pagar18
                """.trimIndent())
            }else{
                println("""
                    Usted debe pagar la totalidad de la libreta
                    Pago de : $totalpaga18
                """.trimIndent())
            }
        }
    }

}