class Profesor: Empleado() {
    var departamento:String = ""

   constructor() : super()

    constructor(
        nombre: String,
        apellido: String,
        numeroIdentificacion: Int,
        estadoCivil: Int,
        incorporacion: String,
        nuemroDespacho: Int,
        departamento: String
    ) : super(nombre, apellido, numeroIdentificacion, estadoCivil, incorporacion, nuemroDespacho) {
        this.departamento = departamento
    }


    override fun toString(): String {
        return super.toString() + "Profesor(departamento='$departamento')"
    }

    override fun cambioEstadoCivil() {
        super.cambioEstadoCivil()
    }

    fun cambioDepartamento(){
        var nuevoDepartamento:String
        println("""
            Ingrese el nuevo departamento del profesor
        """.trimIndent())
        nuevoDepartamento = readln().toString()
        if (nuevoDepartamento.length < 3){
            println("Departemento no valido")
        }else{
            departamento = nuevoDepartamento
            println("El nuevo departamento es: $nuevoDepartamento")
        }
    }


}