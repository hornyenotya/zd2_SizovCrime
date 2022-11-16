package com.example.zd2_criminalintent

import java.util.*

data class Crime(var id: UUID = UUID.randomUUID()) {
    var title: String = ""
    var date: Int = 0
    var isSolved: Boolean = false
    constructor(id: UUID, title: String, date: Int, isSolved: Boolean) : this(id){
        this.title = title
        this.date = date
        this.id = id
        this.isSolved = isSolved
    }
}