package by.zharikov.democomposeviewmodel.common

interface EventHandler<E> {
    fun obtainEvent(event: E)
}