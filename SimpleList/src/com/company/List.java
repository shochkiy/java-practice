package com.company;

/*
 * getSize() - получить размер списка;
 * addFirst(int data) - добавить в начало списка; data - данные
 * addByIndex(int index, int data) - добавить элемент с данными data по индексу
 * addLast(int data) - добавить в конец списка
 * overwriteByIndex(int index, int data) - переписать элемент с данными data по индексу
 * deleteItem(int data) - удалить элемент со списка по данным
 * deleteItemByIndex(int index) - удалить элемент со списка по индексу
 * getItemIndex(int data) - найти индекс элемента по данным
 * getItemByIndex(int index) - найти данные элемента по индексу
 * deleteAllItem() - очистить список
 * printList() - вывести ввесь список
 *
 * */
public class List {
    private ListItem first;
    private ListItem last;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void addFirst(int data) {
        ListItem a = new ListItem();
        a.data = data;
        if (first == null) {
            first = a;
            last = a;
        } else {
            a.next = first;
            first = a;
        }
        size++;
    }

    public void addByIndex(int index, int data) {
        if (index > size) {
            System.out.println("Index does not exist. Size - " + size);
        } else {
            if (index == 0) {
                addFirst(data);
            } else {
                ListItem a = new ListItem();
                a.data = data;
                ListItem b = getItemByIndex(index - 1);
                a.next = getItemByIndex(index);
                b.next = a;
                size++;
            }
        }
    }

    public void addLast(int data) {
        ListItem a = new ListItem();
        a.data = data;
        if (last == null) {
            first = a;
            last = a;
        } else {
            last.next = a;
            last = last.next;
        }
        size++;
    }

    public void overwriteByIndex(int index, int data) {
        if (index >= size) {
            System.out.println("Index does not exist. Size - " + size);
        } else {
            getItemByIndex(index).data = data;
        }
    }

    public void deleteItem(int data) {
        if (first == null) {
            return;
        }
        if (first == last) {
            first = null;
            last = null;
            size--;
            return;
        }
        if (first.data == data) {
            first = first.next;
            size--;
            return;
        }
        ListItem a = first;
        while (a.next != null) {
            if (a.next.data == data) {
                if (a.next == last) {
                    last = a;
                }
                a.next = a.next.next;
                size--;
                return;
            }
            a = a.next;
        }
    }

    public void deleteItemByIndex(int index) {
        ListItem a = getItemByIndex(index);
        if (a != null) {
            deleteItem(a.data);
        } else {
            System.out.println("Index does not exist");
        }
    }

    public int getItemIndex(int data) {
        int counter = 1;
        if (first == null) {
            return -1;
        }
        ListItem a = first;
        while (a.next != null) {
            if (a.next.data == data) {
                if (a.next == last) {
                    return size;
                }
                return counter;
            }
            a = a.next;
            counter++;
        }
        return -1;
    }

    public ListItem getItemByIndex(int index) {
        int counterIndex = 0;
        if (index < size) {
            if (first == null) {
                return null;
            }
            ListItem a = first;
            while (a.next != null) {
                if (counterIndex == index) {
                    return a;
                }
                a = a.next;
                counterIndex++;
            }
            return a;
        } else {
            System.out.println("List size " + size);
            return null;
        }
    }

    public void deleteAllItem() {
        first = null;
        last = null;
        size = 0;
    }

    public void printList() {
        if (size != 0) {
            ListItem a = first;
            while (a != null) {
                System.out.print(a.data + " ");
                a = a.next;
            }
            System.out.println();
        } else {
            System.out.println("List is empty.");
        }
    }
}
