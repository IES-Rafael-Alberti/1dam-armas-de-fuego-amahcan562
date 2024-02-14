import kotlin.random.Random

abstract class ArmaDeFuego(
    private val nombre: String,
    private var municion: Int,
    var municionARestar: Int,
    val tipoDeMunicion: String,
    var danio: Int,
    var radio: String)
{
    companion object{
        var cantidadMunicionExtra: Int = Random.nextInt(5,15)
    }

    fun dispara(){
        if (municion > 0) {
            municion -= municionARestar
            println("El arma ha disparado. \n Munición restante: $municion")
        }else {
            recarga()
        }
    }

    fun recarga(){
        if (cantidadMunicionExtra <= 0){
            println("No hay suficiente munición para disparar")
        }else{

        }


    }

    override fun toString(): String {
        return "Nombre: $nombre, Munición: $municion, Tipo de Munición: $tipoDeMunicion mm, Daño: $ , Radio: $."
    }
}