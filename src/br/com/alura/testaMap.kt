package br.com.alura

fun testaMap() {
    val pedidos = mapOf<Int, Double>(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0)
    println(pedidos)

    val pedido = pedidos[3]
    pedido?.let {
        println("pedido $pedido")
    }

    for (p: Map.Entry<Int, Double> in pedidos) {
        println("número do pedido: ${p.key}")
        println("valor do pedido: ${p.value}")
    }

    var pedidosMutaveis = mutableMapOf<Int, Double>(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0)
    println(pedidosMutaveis)

    val pedido2 = pedidosMutaveis[3]
    pedido2?.let {
        println("pedido $pedido2")
    }

    for (p: Map.Entry<Int, Double> in pedidosMutaveis) {
        println("número do pedido: ${p.key}")
        println("valor do pedido: ${p.value}")
    }

    pedidosMutaveis[4] = 70.0
    pedidosMutaveis.put(5, 80.0)
    println(pedidosMutaveis)

    pedidosMutaveis[1] = 100.0
    println(pedidosMutaveis)

    pedidosMutaveis.putIfAbsent(6, 200.0)
    println(pedidosMutaveis)

    pedidosMutaveis.putIfAbsent(6, 300.0)
    println(pedidosMutaveis)

    pedidosMutaveis.remove(6)
    println(pedidosMutaveis)

    pedidosMutaveis.remove(3, 100.0)
    println(pedidosMutaveis)

    pedidosMutaveis.remove(3, 50.0)
    println(pedidosMutaveis)
}