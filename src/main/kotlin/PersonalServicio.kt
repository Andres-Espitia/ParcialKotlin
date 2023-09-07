class PersonalServicio: Empleado() {
    var departamentoAsignado:Int = 0

    constructor(
        nombre: String,
        apellido: String,
        numeroIdentificacion: Int,
        estadoCivil: Int,
        departamentoAsignado: Int
    ) : super(nombre, apellido, numeroIdentificacion, estadoCivil) {
        this.departamentoAsignado = departamentoAsignado
    }

    override
}