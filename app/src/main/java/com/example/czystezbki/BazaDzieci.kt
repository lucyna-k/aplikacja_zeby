package com.example.czystezbki

object BazaDzieci{

    var noweDziecko = Dziecko("", "","", "")

    val wszystkieDzieci: MutableList<Dziecko> = mutableListOf()

    fun wybraneDziecko(): Dziecko {
         if (wszystkieDzieci.get(0)  == null) return noweDziecko
        return wszystkieDzieci.get(0)
    }
}