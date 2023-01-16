package br.com.alura

fun main() {

//    testaComportamentoMap()
  testaMap()

}

val produtos: MutableMap<Int, String> = mutableMapOf(
    Pair(1, "Abacate"),
    Pair(2, "Abacaxi"),
    Pair(3, "Banana"),
    (4 to "Goiaba"),
    (5 to "Melão Maduro")
)

fun comProdutos() {
    println("Produtos $produtos")
    println("Id   Nome Produto")
    for (prod in produtos) {
        println("${prod.key} - ${prod.value} ")
    }
    produtos.put(4, "Coco")
    println("Produtos $produtos")
}
val pedidos: MutableMap<Int, Double> = mutableMapOf(
    Pair(1, 20.00),
    Pair(2, 64.00),
    3 to 50.0,
    4 to 100.00,
    5 to 150.00,
    6 to 80.0,
    Pair(7, 200.00),
    Pair(100, 1100.00)
)
fun testaComportamentoMap() {

//    val vlPedidos = pedidos.getValue(10)       //com getValue se map não acha chave ele para
//    println(vlPedidos)
    println(pedidos.getOrElse(10) {
        "Nao tem chave"
    })
    println("padrão -1 se não acha ${pedidos.getOrDefault(41,-1.0)}")
    for (numero in pedidos.keys) {
        println("Pedido $numero")
    }
    println(pedidos.values)

    println("Valor do Pedido: ")
    for (valor in pedidos) {
        println(valor)
    }
    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.00
    }
    val numerosImpares = pedidos.filterKeys {
        it % 2 == 1
    }
    println("numeros impares $numerosImpares")
    println("Filtrados par acima 50 $pedidosFiltrados")
    val pedidoAcima = pedidos.filterValues { valor ->
        valor > 70.00
    }
    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }
    println("Filtrados pares $pedidosFiltrados")

    println("Pedidos original $pedidos")
    println("Mapa + adicao ${pedidos + Pair(9, 90.0)}")
    println("Mapa + adicao ${pedidos + mapOf(10 to 20.0, 11 to 100)}")

    println(pedidos - 6)
    println(pedidos - listOf(1, 3))

    //  Adicionando na Lista Original, se chave ja existe ele altera o valor chave 4

    pedidos.putAll(setOf<Pair<Int, Double>>(10 to 76.00, 11 to 110.0, 4 to 102.0))
    println(pedidos)

    pedidos += setOf<Pair<Int, Double>>(10 to 76.00, 11 to 110.0, 4 to 102.0)   //idem ao putAll
    println(pedidos)

    // Removendo
    println("Removendo chav e 1 ${pedidos.keys.remove(1)}")
    println(pedidos)
    println("Removendo por Valor ${pedidos.values.remove(50.0)}")
    //nesse caso ele remove so o primeiro que achar
    println(pedidos)
    pedidos -= 6; println(pedidos)
}

fun testaMap() {
    println("PEDIDOS :=> $pedidos")

//    println("Pedido " + pedidos[1])
    val pedido: Double? = pedidos[9]
    pedido?.let {
        println("$it")
    }
    for (p in pedidos) {
        println("Numero ped.: ${p.key}")
        println("Valor  ped.: ${p.value}")
    }
    pedidos[5] = 76.0
    println("incluiu key 5 $pedidos")
    pedidos.put(6, 96.0)
    println(pedidos)
    pedidos[6] = 100.0
    println(pedidos)
    pedidos.putIfAbsent(7, 196.0)

    pedidos.remove(6)
    println("Removeu key 6 $pedidos")
    pedidos.remove(5, 76.0)
    println(pedidos)
    pedidos.remove(7)
    println("Removeu key 7 $pedidos")
}

