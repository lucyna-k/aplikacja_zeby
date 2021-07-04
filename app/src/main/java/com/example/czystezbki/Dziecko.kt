package com.example.czystezbki

class Dziecko (var imie: String, var wiek: String, var avatar: String, var termin: String, var punkty: Int) {

    override fun toString(): String {
        return "Dziecko(imie='$imie', wiek='$wiek', avatar='$avatar', termin='$termin')"
    }
}