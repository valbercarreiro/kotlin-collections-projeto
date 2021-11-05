package br.com.alura

fun main() {

    val pedidos = listOf(
            Pedido(1, 20.0),
            Pedido(2, 60.0),
            Pedido(3, 30.0),
            Pedido(4, 70.0)
    )

    println(pedidos)

    val pedidosMapeados: Map<Int, Pedido> = pedidos.associate { pedido: Pedido ->
        Pair(pedido.numero, pedido)
    }
    println(pedidosMapeados)

    val pedidosMapeados2: Map<Int, Pedido> = pedidos.associateBy { pedido ->
        pedido.numero
    }
    println(pedidosMapeados2)

    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratis)

//    val mapa: Map<Boolean, Pedido> = pedidos.associateBy { pedido ->
//        pedido.valor > 50.0
//    }
//    println(mapa)

    val pedidosFreteGratisAgrupados: Map<Boolean, List<Pedido>> = pedidos.groupBy { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratisAgrupados)

    val nomes: List<String> = listOf("Alex", "Fran", "Gui", "Ana", "Paulo", "Maria", "Mario", "João")
    val agenda: Map<Char, List<String>> = nomes.groupBy { nome ->
        nome.first()
    }
    println(agenda)
}

class Pedido(val numero: Int, val valor: Double)