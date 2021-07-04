package com.example.czystezbki

object BazaDzieci{

    var noweDziecko = Dziecko("", "","1", "", 0)
    var wiktoria = Dziecko("Wiktoria", "7","1", "", 0)
    var lucyna = Dziecko("Lucyna", "6","2", "", 0)
    var wybrane: Int = 0


    val wszystkieDzieci: MutableList<Dziecko> = mutableListOf(wiktoria, lucyna)

    fun wybraneDziecko(): Dziecko {
        return wszystkieDzieci.get(wybrane)
    }

    fun ranking(): List<String> {
      return  wszystkieDzieci.sortedWith(compareBy { it.punkty }).reversed().mapIndexed { index, d -> "%d miejsce %s %d punktów".format(index +1, d.imie,d.punkty) }
    }

    fun wybierzDziecko(index: Int) {
        wybrane = index
    }

    fun imiona(): List<String> {
        return wszystkieDzieci.map { it.imie }
    }
}