package various

class IndicatingList<T> : MutableIterable<T> {

    private val _items: MutableList<T> = mutableListOf()

    private var _indicator = -1

    fun isEmpty(): Boolean = this._items.isEmpty()

    fun count(): Int = this._items.count()

    fun position(): Int = this._indicator

    fun push(element: T) =
            if (position() + 1 == count())
                _items.add(++_indicator, element)
            else
                _items[++_indicator] = element

    fun back(): T? =
            when {
                isEmpty() -> null
                count() == 1 -> _items[_indicator]
                else -> _items[--_indicator]
            }

    override fun toString() = this._items.toString()

    override fun iterator(): MutableIterator<T> = _items.iterator()

}