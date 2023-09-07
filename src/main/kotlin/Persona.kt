open class Persona{
    private var nombre:String = ""
    private var apellido:String = ""
    private var numeroIdentificacion:Int = 0
    private var estadoCivil:Int = -1

    constructor()

    constructor(nombre: String, apellido: String, numeroIdentificacion: Int, estadoCivil: Int) {
        this.nombre = nombre
        this.apellido = apellido
        this.numeroIdentificacion = numeroIdentificacion
        this.estadoCivil = estadoCivil
    }


    override fun toString(): String {
        return "Persona(nombre='$nombre', apellido='$apellido', numeroIdentificacion=$numeroIdentificacion, estadoCivil=$estadoCivil)"
    }

    open fun cambioEstadoCivil(){
        var estado:Int = 0
        do {
            println("""
                Ingrese el nuevo estado civil de la persona
                1. Casado
                2. Soltero
                3. Unionlibre
            """.trimIndent())
            estado = readln().toInt()
            if (estado == 1){
                estadoCivil = estado
                println(" Estado civil de la  persona cambio a casado")
            }else if(estado == 2){
                estadoCivil = estado
                println("Estado civil de la persona cambio a soltero")
            }else if (estado == 3){
                println("Estado civil de la persona cambio a UnionLibre")
            }else{
                println("Opcion no valida")
            }
        }while (estado != 1 || estado != 2 || estado != 3)

    }

}