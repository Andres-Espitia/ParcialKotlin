open class Empleado: Persona() {
    private var incorporacion:String = ""
    private var nuemroDespacho:Int = 0


    constructor(
        nombre: String,
        apellido: String,
        numeroIdentificacion: Int,
        estadoCivil: Int):super(nombre, apellido, numeroIdentificacion, estadoCivil)

    constructor(
        nombre: String,
        apellido: String,
        numeroIdentificacion: Int,
        estadoCivil: Int,
        incorporacion: String,
        nuemroDespacho: Int
    ) : super(nombre, apellido, numeroIdentificacion, estadoCivil) {
        this.incorporacion = incorporacion
        this.nuemroDespacho = nuemroDespacho
    }

    override fun toString(): String {
        return super.toString() + "Empleado(incorporacion='$incorporacion', nuemroDespacho=$nuemroDespacho)"
    }

    override fun cambioEstadoCivil(){
        super.cambioEstadoCivil()
    }
    fun reasignarDespacho(){
        var nuevoDespacho:Int
        println("""
            Ingrese el numero del nuevo despacho a reasignar:
        """.trimIndent())
        nuevoDespacho = readln().toInt()
        Math.abs(nuevoDespacho)
        println("""
            nuevo despacho asignado: $nuevoDespacho
        """.trimIndent())
    }


}