package visitor.exercise3

class ElementArrayList : ArrayList<Entry>(), Element {
    override fun accept(v: Visitor) {
        val iterator = this.iterator()
        while (iterator.hasNext()) {
            iterator.next().accept(v)
        }
    }
}