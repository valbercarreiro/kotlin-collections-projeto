package br.com.alura

fun main() {

    val pedidos = mutableMapOf(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0, 4 to 110.0, 5 to 150.0, 6 to 80.0)

//    val valorPedido = pedidos.getValue(5)
//    println(valorPedido)

    val mensagem = pedidos.getOrElse(0) { 0.0 }
    println(mensagem)

    println(pedidos.getOrDefault(1, -1.0))
    println(pedidos.getOrDefault(0, -1.0))

    println(pedidos.keys)
    for(numeroDePedido in pedidos.keys) {
        println("Pedido $numeroDePedido")
    }

    println(pedidos.values)
    for (valor in pedidos.values) {
        println("Valor do pedido $valor")
    }

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
                                numero % 2 == 0 && valor > 50.0
                            }
    println(pedidosFiltrados)

    val pedidosAcimade70 = pedidos.filterValues { valor ->
                    valor > 70.0
                }
    println(pedidosAcimade70)

    val pedidosPares = pedidos.filterKeys { numero ->
                    numero % 2 == 0
                }
    println(pedidosPares)

    println(pedidos + Pair(7, 90.0))
    println(pedidos)

    println(pedidos - 6)
    println(pedidos)

    println(pedidos - listOf(6, 5))
    println(pedidos)

    pedidos.putAll(setOf(Pair(7, 90.0), Pair(8, 92.0)))
    println(pedidos)

    pedidos += setOf(Pair(9, 20.0), Pair(10, 31.0))
    println(pedidos)

    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(50.0)
    println(pedidos)

    pedidos -= 6
    println(pedidos)
}
