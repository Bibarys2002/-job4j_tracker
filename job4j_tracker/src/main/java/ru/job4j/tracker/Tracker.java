package ru.job4j.tracker;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[size];
        int newSize = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (key.equals(item.getName())) {
                result[newSize++] = item;

            }
        }
        return Arrays.copyOf(items, newSize);
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
        if (items[index].getId() == id) {
        result = index;
        break;
        }
        }
        return result;
        }
        public Item findById(int id) {
            int index = indexOf(id);
            return index != -1 ? items[index] : null;
        }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] =  item;
            return true;
            }
            return false;

    }

    public void delete(int id) {
        int index = indexOf(id);
        int start = index + 1;
        int distPos = index;
        int length = size - index - 1;
        for (int i = 0; i < size; i++) {
            if (index != -1) {
            System.arraycopy(items, start, items, distPos, length);
            items[size - 1] = null;
            size--;
            }

        }

    }

}
