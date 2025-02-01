package ru.job4j.ex;
public class FindEl {
    public static int indexOf(String[] value, String key) throws  ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if(key.equals(value[i])) {
                result = i;
                break;
            }
        }
        if (result == -1) {
            throw new  ElementNotFoundException("No suitable elements");
        }
        return result;
    }
    public static void main(String[] args)  {
        try {
            int index = indexOf(new String[] {"Артем",  "Данияр", "Александр", "Петр"}, "Петр");
            System.out.println("Элемент найден на индексе: " + index);
        } catch ( ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}