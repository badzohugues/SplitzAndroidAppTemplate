package com.badzohugues.splitztemplateapp.data.mapper

interface Mapper<A, B> {
    fun transform(item: A): B
    fun revert(item: B): A
}
