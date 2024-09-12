package com.example.composeexamples


data class Options2(var title: String, var name: String)

data class Options(var title: String, var name: String)

fun optionList(): MutableList<Options>{
    val listOfOptions = mutableListOf<Options>()

    listOfOptions.add(Options(title = "Title", name = "Name"))
    listOfOptions.add(Options(title = "Title", name = "Name"))
    listOfOptions.add(Options(title = "Title", name = "Name"))
    listOfOptions.add(Options(title = "Title", name = "Name"))
    listOfOptions.add(Options(title = "Title", name = "Name"))
    listOfOptions.add(Options(title = "Title", name = "Name"))

    return listOfOptions
}

fun main(){

    optionList().map { item ->
        Options2(title = item.title, name = item.name)
    }
}