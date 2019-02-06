package various

class IndicatingList<T> : MutableIterable<T> {

    private val _items: MutableList<T> = mutableListOf()

    private var _indicator = -1

    fun isEmpty(): Boolean = _items.isEmpty()

    fun count(): Int = _items.count()

    fun position(): Int = _indicator

    fun isPointingToLast(): Boolean = count() - 1 == position()

    fun push(element: T) =
            if (isPointingToLast())
                _items.add(++_indicator, element)
            else
                _items[++_indicator] = element

    fun current() = _items[_indicator]

    fun forth(): Boolean =
            isPointingToLast().let {
                if (!it && !isEmpty()) _indicator++
                !it
            }

    fun back(): T? =
            when {
                isEmpty() -> null
                count() == 1 -> current()
                else -> _items[--_indicator]
            }

    override fun toString() = _items.toString()

    override fun iterator(): MutableIterator<T> = _items.iterator()

}