class BinarySearch {
    /**
     * @param nums ordered sequence of integers
     * @param key  an element for searching
     * @return index of key or a negative value
     */
    public static int callBinarySearch(int[] nums, int key) {
        // write your code here
        return java.util.Arrays.binarySearch(nums, key);
    }
}
/*
Класс Arrays содержит множество полезных методов для обработки массивов.
Один из них — метод binarySearch. Он позволяет быстро найти индекс элемента в заданном упорядоченном массиве.
Для этого достаточно передать массив значений и искомое значение в этот метод.

В этом тесте вам нужно вызвать этот метод из класса Arrays без использования оператора импорта.

Не используйте собственную реализацию метода поиска, она может не работать с подготовленными тестами.
 */