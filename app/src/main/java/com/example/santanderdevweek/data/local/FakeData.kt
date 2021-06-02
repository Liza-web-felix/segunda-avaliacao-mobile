package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class FakeData {

    fun getLocalData() : Conta{
        val cliente = Cliente("Liz")
        val cartao = Cartao("4111111111")
        return Conta(
                numero = "445655-5",
                agencia = "6552-4",
                saldo = "R$ 2.450,80",
                limite = "R$ 4.120,00",
                cliente,
                cartao,
        );

    }
}