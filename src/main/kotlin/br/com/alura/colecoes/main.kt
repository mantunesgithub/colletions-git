package br.com.alura.colecoes

import java.math.BigDecimal

fun main() {


    data class Pedido(val numero: Int, val valor: Double) {
    }

    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0),
        Pedido(5, 40.0)
    )

    println("Lista pedidos = $pedidos")

    val pedidosMapeados: Map<Int, Pedido> = pedidos.associate { pedido:Pedido ->
        Pair(pedido.numero, pedido)
    }
    println("Pedidos Mapeados = $pedidosMapeados")
    println("Pedidos Mapeados [1] = ${pedidosMapeados[1]}")

// Pode usar tambem o associateBy
    val pedidosMapeadosBy: Map<Int, Pedido> = pedidos.associateBy { pedido ->
        pedido.numero
    }
    println("Pedidos MapeadosBy = $pedidosMapeadosBy")

    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }
    println("Pedidos Frete Gratis = $pedidosFreteGratis")
    println("Pedido Frete Gratis2 = " + pedidosFreteGratis[Pedido(numero = 2, valor = 60.0)])

//    val mapa: Map<Boolean, Pedido> = pedidos.associateBy { pedido ->
//        pedido.valor > 50.0
//    }
//    println(mapa)

    val pedidosFreteGratisAgrupados: Map<Boolean, List<Pedido>> =
        pedidos.groupBy { pedido: Pedido ->
            pedido.valor > 50.0
        }
    println("Pedidos Frete Gratis Agrupados = $pedidosFreteGratisAgrupados")
    println(pedidosFreteGratisAgrupados[false])

    val nomes = listOf(
        "Alex",
        "Fran",
        "Gui",
        "Ana",
        "Paulo",
        "Maria",
        "Mario",
        "Gisele"
    )

    val agenda: Map<Char, List<String>> = nomes.groupBy { nome ->
        nome.first()
    }

    println(agenda)
    println(agenda['A'])

    data class Produtos(val id: Int, val nome: String, val valor: BigDecimal) {
    }

    val listaDeProdutos = listOf<Produtos>(
        Produtos(1, "Laranja", BigDecimal("50.00")),
        Produtos(2, "Banana", BigDecimal("30.00"))
    )
    println("Lista de Produtos = $listaDeProdutos")
}