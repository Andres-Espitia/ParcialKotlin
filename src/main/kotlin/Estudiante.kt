class Estudiante: Persona() {
    var cursoMatriculado:Int = 0

    constructor() : super()
    constructor(
        nombre: String,
        apellido: String,
        numeroIdentificacion: Int,
        estadoCivil: Int,
        cursoMatriculado: Int
    ) : super(nombre, apellido, numeroIdentificacion, estadoCivil) {
        this.cursoMatriculado = cursoMatriculado
    }

    override fun toString(): String {
        return super.toString() + "Estudiante(cursoMatriculado=$cursoMatriculado)"
    }


    override fun cambioEstadoCivil() {
        super.cambioEstadoCivil()
    }
    fun nuevoCurso(){
        var nuevoCurso:Int
        println("Digite el nuevo curso del estudiante")
        nuevoCurso = readln().toInt()
        if (nuevoCurso != 0){
            println("El nuevo curso del estudiante es: $nuevoCurso")
        }else{
            println("Curso no valido")
        }
    }


}