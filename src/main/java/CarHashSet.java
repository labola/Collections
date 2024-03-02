public class CarHashSet implements CarSet {
    private int size = 0;
    private static final int INITIAL_CAPACITY = 16;
    private Entry[] array = new Entry[INITIAL_CAPACITY];

    @Override
    public boolean add(Car car) {
        int position = getElementPosition(car, array.length);
        if (array[position] == null) {
            Entry entry = new Entry(car, null);
            array[position] = entry;
            size++;
            return true;
        } else {
            Entry existedElement = array[position];
            while (true) {
                if (existedElement.value.equals(car)) {
                    return false;
                } else if (existedElement.next == null) {
                    existedElement.next = new Entry(car, null);
                } else {
                    existedElement = existedElement.next;
                }
            }
        }

    }

    @Override
    public boolean remove(Car car) {
        int position = getElementPosition(car, array.length);
        if (array[position] == null) {
            return false;
        }
        Entry secondLast = array[position];
        Entry Last = secondLast.next;
        if
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {

    }

    private int getElementPosition(Car car, int arrayLenght) {
        return Math.abs(car.hashCode() % arrayLenght);
    }

    private static class Entry {
        private Car value;
        private Entry next;

        public Entry(Car value, Entry next) {
            this.value = value;
            this.next = next;
        }
    }
}
